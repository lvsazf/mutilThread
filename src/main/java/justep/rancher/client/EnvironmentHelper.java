package justep.rancher.client;

import java.util.Map;

import justep.rancher.client.model.CommanResponse;
import justep.rancher.client.model.Environment;
import justep.rancher.client.utils.RancherException;
import feign.Param;
import feign.QueryMap;
import feign.RequestLine;
/**
 * <p>ClassName: EnvironmentHelper</p>
 * <p>Description: EnvironmentHelper接口类</p>
 * @author 史绍虎
 * <p>Date: 2016-4-15 上午11:06:11</p>
 * 
 * Query condition support operator
 * 
 * e.g.:
 * 
 * GET /v1/projects/1a5/environments?limit=2&accountId=1a5
 * Map<String, Object> map=new HashMap<String, Object>()
 * map.put("name", "Tomcat-Cluster") throws RancherException;
 * map.put("limit", 2) throws RancherException;
 * 
 * The operator of key:[=,≠,NULL,NOT NULL] match [key,key_ne,key_null,key_notnull]
 * All visiable operator:
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
public interface EnvironmentHelper {
	@RequestLine("GET /v1/environments")
	CommanResponse<Environment> query(@QueryMap Map<String, Object> map) throws RancherException;
	
	@RequestLine("GET /v1/projects/{projectId}/environments")
	CommanResponse<Environment> query(@Param("projectId")String projectId,@QueryMap Map<String, Object> map) throws RancherException;
	
	@RequestLine("POST /v1/projects/{projectId}/environments")
	Environment create(@Param("projectId")String projectId,Environment environment) throws RancherException;
	/**
	 * Editable attribute:[name,description,externalId,previousExternalId,previousEnvironment,outputs].
	 * Beyond above,modification may be caused any errors.
	 */
	@RequestLine("PUT /v1/projects/{projectId}/environments/{id}")
	Environment edit(@Param("projectId")String projectId,@Param("id")String id,Environment environment) throws RancherException;
	
	@RequestLine("DELETE /v1/projects/{projectId}/environments/{id}")
	Environment delete(@Param("projectId")String projectId,@Param("id")String id) throws RancherException;
	
	@RequestLine("GET /v1/environments/{id}")
	Environment get(@Param("id")String id) throws RancherException;
	
	/**
	 * Editable attribute:[dockerCompose,rancherCompose,externalId,environment].
	 * Beyond above,modification may be caused any errors.
	 */
	@RequestLine("POST /v1/environments/{id}/?action=upgrade")
	Environment upgrade(@Param("id")String id,Environment environment) throws RancherException;
	
	@RequestLine("POST /v1/environments/{id}/?action=cancelupgrade")
	Environment cancelUpgrade(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/environments/{id}/?action=finishupgrade")
	Environment finishUpgrade(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/environments/{id}/?action=rollback")
	Environment rollback(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/environments/{id}/?action=cancelrollback")
	Environment cancelRollback(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/environments/{id}/?action=update")
	Environment update(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/environments/{id}/?action=remove")
	Environment remove(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/environments/{id}/?action=activateservices")
	Environment activateServices(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/environments/{id}/?action=deactivateservices")
	Environment deactivateServices(@Param("id")String id) throws RancherException;
	
	@RequestLine("POST /v1/environments/{id}/?action=exportconfig")
	Environment exportconfig(@Param("id")String id) throws RancherException;
	
	@RequestLine("GET /v1/environments/{id}/composeConfig")
	void composeConfig(@Param("id")String id) throws RancherException;
}
