package justep.rancher.client;

import java.util.Map;

import justep.rancher.client.model.CommanResponse;
import justep.rancher.client.model.Container;
import justep.rancher.client.model.Host;
import justep.rancher.client.model.IpAddress;
import justep.rancher.client.model.Label;
import justep.rancher.client.model.PhysicalHost;
import justep.rancher.client.model.WsAccess;
import justep.rancher.client.utils.RancherException;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
/**
 * <p>ClassName: HostHelper</p>
 * <p>Description: HostHelper接口类</p>
 * @author 史绍虎
 * <p>Date: 2016-4-15 上午11:06:11</p>
 * 
 * Query condition support operator
 * 
 * e.g.:
 * 
 * GET /v1/projects/1a5/environments?accountId=1a5&sort=name&limit=2
 * Map<String, Object> map=new HashMap<String, Object>()
 * map.put("accountId", "1a5") throws RancherException;
 * map.put("limit", 2) throws RancherException;
 * map.put("sort", "name") throws RancherException;
 * 
 * The operator of key:[=,≠,NULL,NOT NULL] match [key,key_ne,key_null,key_notnull]
 * All enabled operator:
 * "eq"			equal to
 * (always 		available, the default if no modifier is specified)
 * "ne"			not equal to
 * "lt"			less than
 * "lte"		less than or equal to
 * "gt"			greater than
 * "gte"		greater than or equal to
 * "prefix"		starts with
 * "like"		matches, as in SQL:
 * "notlike"	does not match (as above)
 * "null"		value is NULL
 * "notnull"	value is not NULL
 */
public interface HostHelper {
	@RequestLine("GET /v1/hosts")
	CommanResponse<Host> query(@QueryMap Map<String, Object> map) throws RancherException;
	
	@RequestLine("GET /v1/projects/{projectId}/hosts?limit=-1&include=ipAddresses")
	CommanResponse<Host> queryHostWithIp(@Param("projectId")String projectId,@QueryMap Map<String, Object> map) throws RancherException;
	
	@RequestLine("GET /v1/projects/{projectId}/hosts")
	CommanResponse<Host> query(@Param("projectId")String projectId,@QueryMap Map<String, Object> map) throws RancherException;
	
	/**
	 * Editable attribute:[name,description,labels].
	 * Beyond above,modification may be caused any errors.
	 */
	@RequestLine("PUT /v1/projects/{projectId}/hosts/{id}")
	Host edit(@Param("projectId")String projectId,@Param("id")String id,Host host) throws RancherException;
	
	@RequestLine("DELETE /v1/projects/{projectId}/hosts/{id}")
	Host delete(@Param("projectId")String projectId,@Param("id")String id) throws RancherException;
	
	
	@RequestLine("GET /v1/hosts/{id}")
	Host get(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/hosts/{id}/?action=update")
	Host update(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/hosts/{id}/?action=remove")
	Host remove(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/hosts/{id}/?action=activate")
	Host activate(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/hosts/{id}/?action=deactivate")
	Host deactivate(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/hosts/{id}/?action=dockersocket")
	Host dockersocket(@Param("id")String id) throws RancherException;
	
	@RequestLine("GET /v1/hosts/{id}/instances")
	CommanResponse<Container> instances(@Param("id")String id) throws RancherException;
	
	@RequestLine("GET /v1/hosts/{id}/ipaddresses")
	CommanResponse<IpAddress> ipaddresses(@Param("id")String id) throws RancherException;
	
	@RequestLine("GET /v1/hosts/{id}/physicalhost")
	PhysicalHost physicalhost(@Param("id")String id) throws RancherException;
	
	@RequestLine("GET /v1/hosts/{id}/hostlabels")
	CommanResponse<Label> hostLabels(@Param("id")String id) throws RancherException;
	
	@RequestLine("GET /v1/hosts/{id}/containerstats")
	WsAccess containerStats(@Param("id")String id) throws RancherException;
	
	@RequestLine("GET /v1/hosts/{id}/stats")
	WsAccess stats(@Param("id")String id) throws RancherException;
	
	@RequestLine("GET /v1/hosts/{id}/hoststats")
	WsAccess hostStats(@Param("id")String id) throws RancherException;
}
