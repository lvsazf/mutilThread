package justep.rancher.client;

import java.util.Map;

import justep.rancher.client.model.CommanResponse;
import justep.rancher.client.model.Container;
import justep.rancher.client.model.ContainerExec;
import justep.rancher.client.model.ContainerLogs;
import justep.rancher.client.model.WsAccess;
import justep.rancher.client.utils.RancherException;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
/**
 * <p>ClassName: ContainerHelper</p>
 * <p>Description: ContainerHelper接口类</p>
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
public interface ContainerHelper {
	@RequestLine("GET /v1/containers")
	CommanResponse<Container> query(@QueryMap Map<String, Object> map) throws RancherException;
	
	@RequestLine("GET /v1/projects/{projectId}/instances")
	CommanResponse<Container> query(@Param("projectId")String projectId,@QueryMap Map<String, Object> map) throws RancherException;
	
	@RequestLine("GET /v1/services/{id}/instances")
	CommanResponse<Container> query(@Param("id")String serviceId) throws RancherException;
	
	/**
	 * Editable attribute:[name,description].
	 * Beyond above,modification may be caused any errors.
	 */
	@RequestLine("PUT /v1/projects/{projectId}/containers/{id}")
	Container edit(@Param("projectId")String projectId,@Param("id")String id,Container container) throws RancherException;
	
	@RequestLine("DELETE /v1/projects/{projectId}/containers/{id}")
	Container delete(@Param("projectId")String projectId,@Param("id")String id) throws RancherException;
	
	
	@RequestLine("GET /v1/containers/{id}")
	Container get(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/containers/{id}/?action=update")
	Container update(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/containers/{id}/?action=restart")
	Container restart(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/containers/{id}/?action=start")
	Container start(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/containers/{id}/?action=stop")
	Container stop(@Param("id")String id) throws RancherException;

	@RequestLine("POST /v1/containers/{id}/?action=remove")
	Container remove(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/containers/{id}/?action=execute")
	Container execute(@Param("id")String id,ContainerExec exec) throws RancherException;
	
	@RequestLine("POST /v1/containers/{id}/?action=purge")
	Container purge(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/containers/{id}/?action=restore")
	Container restore(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/containers/{id}/?action=error")
	Container error(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/containers/{id}/?action=logs")
	WsAccess logs(@Param("id")String id,ContainerLogs log) throws RancherException;
	
	@RequestLine("GET /v1/containers/{id}/stats")
	WsAccess stats(@Param("id")String id) throws RancherException;
}
