package justep.rancher.client;

import java.util.Map;

import justep.rancher.client.model.CommanResponse;
import justep.rancher.client.model.Container;
import justep.rancher.client.model.LinkGroup;
import justep.rancher.client.model.RestartStrategy;
import justep.rancher.client.model.Service;
import justep.rancher.client.model.ServiceUpgrade;
import justep.rancher.client.model.WsAccess;
import justep.rancher.client.utils.RancherException;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
/**
 * <p>ClassName: ServiceHelper</p>
 * <p>Description: ServiceHelper接口类</p>
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
public interface ServiceHelper {
	@RequestLine("GET /v1/services")
	CommanResponse<Service> query(@QueryMap Map<String, Object> map) throws RancherException;
	
	@RequestLine("GET /v1/projects/{projectId}/services")
	CommanResponse<Service> query(@Param("projectId")String projectId,@QueryMap Map<String, Object> map) throws RancherException;
	
	@RequestLine("POST /v1/projects/{projectId}/services")
	Service create(@Param("projectId")String projectId,Service Service) throws RancherException;
	/**
	 * Editable attribute:[name,description,selectorContainer,selectorLink,scale].
	 * Beyond above,modification may be caused any errors.
	 */
	@RequestLine("PUT /v1/projects/{projectId}/services/{id}")
	Service edit(@Param("projectId")String projectId,@Param("id")String id,Service service) throws RancherException;
	
	@RequestLine("DELETE /v1/projects/{projectId}/services/{id}")
	Service delete(@Param("projectId")String projectId,@Param("id")String id) throws RancherException;
	
	
	@RequestLine("GET /v1/services/{id}")
	Service get(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/services/{id}/?action=upgrade")
	Service upgrade(@Param("id")String id,ServiceUpgrade upgrade) throws RancherException;
	
	@RequestLine("POST /v1/services/{id}/?action=cancelupgrade")
	Service cancelUpgrade(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/services/{id}/?action=finishupgrade")
	Service finishUpgrade(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/services/{id}/?action=rollback")
	Service rollback(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/services/{id}/?action=cancelrollback")
	Service cancelRollback(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/services/{id}/?action=update")
	Service update(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/services/{id}/?action=remove")
	Service remove(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/services/{id}/?action=activate")
	Service activate(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/services/{id}/?action=deactivate")
	Service deactivate(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/services/{id}/?action=restart")
	Service restart(@Param("id")String id,RestartStrategy strategy) throws RancherException;
	
	@RequestLine("GET /v1/services/{id}/instances")
	CommanResponse<Container> instances(@Param("id")String id) throws RancherException;
	
	
	@RequestLine("POST /v1/services/{id}/?action=setservicelinks")
	Service setLinks(@Param("id")String id,LinkGroup linkGroup) throws RancherException;
	
	@RequestLine("POST /v1/services/{id}/?action=addservicelink")
	Service addLink(@Param("id")String id,LinkGroup linkGroup) throws RancherException;
	
	@RequestLine("POST /v1/services/{id}/?action=removeservicelink")
	Service removeLink(@Param("id")String id,LinkGroup linkGroup) throws RancherException;
	
	@RequestLine("GET /v1/services/{id}/containerstats")
	WsAccess containerStats(@Param("id")String id) throws RancherException;
}
