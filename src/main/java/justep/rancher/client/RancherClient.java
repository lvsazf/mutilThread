package justep.rancher.client;

import justep.rancher.client.utils.ModelUtils;
import justep.rancher.client.utils.RancherException;
import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.Response;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.ErrorDecoder;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
/**
 * <p>ClassName: RancherClient</p>
 * <p>Description: Rancher REST接口的实例工具类</p>
 * @author 史绍虎
 * <p>Date: 2015-11-16 下午5:28:33</p>
 */
public class RancherClient {
	static class RancherHeadersInterceptor implements RequestInterceptor {
		@Override
		public void apply(RequestTemplate template) {
			template.header("Accept", "application/json");
			template.header("Content-Type", "application/json");
		}
	}
	
	static class RancherErrorDecoder implements ErrorDecoder {
		@Override
		public Exception decode(String methodKey, Response response) {
			return new RancherException(response.status(), response.reason());
		}
	}
	
	public static <T> T getInstance(String endpoint,Class<T> clz) {
		JacksonDecoder decoder = ModelUtils.decoder();
		JacksonEncoder encoder = ModelUtils.encoder();
		return Feign.builder().encoder(encoder).decoder(decoder).errorDecoder(new RancherErrorDecoder())
				.requestInterceptor(new RancherHeadersInterceptor()).target(clz, endpoint);
	}
	
	public static <T> T getInstance(String endpoint,Class<T> clz,String userName,String password) {
		JacksonDecoder decoder = ModelUtils.decoder();
		JacksonEncoder encoder = ModelUtils.encoder();
		return Feign.builder().encoder(encoder).decoder(decoder).errorDecoder(new RancherErrorDecoder())
				.requestInterceptor(new RancherHeadersInterceptor())
				.requestInterceptor(new BasicAuthRequestInterceptor(userName, password)).target(clz, endpoint);
	}
}
