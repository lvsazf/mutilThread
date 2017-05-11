package justep.rancher.client.utils;

import java.text.SimpleDateFormat;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
/**
 * <p>ClassName: ModelUtils</p>
 * <p>Description: 工具类</p>
 * @author 史绍虎
 * <p>Date: 2015-12-28 下午2:28:50</p>
 */
public class ModelUtils {
	private static ObjectMapper mapper = new ObjectMapper();
	private static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static JacksonDecoder decoder() {
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.getSerializationConfig().with(new SimpleDateFormat(DATE_TIME_FORMAT));
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false); 
		return new JacksonDecoder(mapper);
	}
	public static JacksonEncoder encoder() {
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.getSerializationConfig().with(new SimpleDateFormat(DATE_TIME_FORMAT));
		return new JacksonEncoder(mapper);
	}
	public static String toString(Object o) {
		try {
			return mapper.writeValueAsString(o);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
}
