package justep.rancher.client;

import java.util.Map;

import justep.rancher.client.model.CommanResponse;
import justep.rancher.client.model.Host;
import justep.rancher.client.model.Machine;
import justep.rancher.client.utils.RancherException;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
/**
 * <p>ClassName: MachineHelper</p>
 * <p>Description: MachineHelper接口类</p>
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
public interface MachineHelper {
	@RequestLine("GET /v1/machines")
	CommanResponse<Machine> query(@QueryMap Map<String, Object> map) throws RancherException;
	
	@RequestLine("GET /v1/projects/{projectId}/machines")
	CommanResponse<Machine> query(@Param("projectId")String projectId,@QueryMap Map<String, Object> map) throws RancherException;
	
	@RequestLine("POST /v1/projects/{projectId}/machines")
	Machine create(@Param("projectId")String projectId,Machine machine) throws RancherException;
	
	@RequestLine("DELETE /v1/projects/{projectId}/machines/{id}")
	Machine delete(@Param("projectId")String projectId,@Param("id")String id) throws RancherException;
	
	@RequestLine("GET /v1/machines/{id}")
	Machine get(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/machines/{id}/?action=update")
	Machine update(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/machines/{id}/?action=remove")
	Machine remove(@Param("id")String id) throws RancherException;
	
	@RequestLine("GET /v1/machines/{id}/hosts")
	CommanResponse<Host> hosts(@Param("id")String id,@QueryMap Map<String, Object> map) throws RancherException;
}
