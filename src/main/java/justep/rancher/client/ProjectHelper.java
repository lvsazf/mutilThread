package justep.rancher.client;

import justep.rancher.client.model.CommanResponse;
import justep.rancher.client.model.Project;
import justep.rancher.client.model.RegistrationToken;
import justep.rancher.client.model.Registry;
import justep.rancher.client.model.Registrycredential;
import justep.rancher.client.utils.RancherException;
import feign.Param;
import feign.RequestLine;
/**
 * <p>ClassName: ProjectHelper</p>
 * <p>Description: ProjectHelper接口类</p>
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
public interface ProjectHelper {
	@RequestLine("GET /v1/projects")
	CommanResponse<Project> query() throws RancherException;
	
	@RequestLine("GET /v1/projects/{id}")
	Project get(@Param("id") String id) throws RancherException;
	
	@RequestLine("POST /v1/projects")
	Project create(Project project) throws RancherException;
	
	@RequestLine("POST /v1/projects/{id}/?action=update")
	Project update(@Param("id") String id) throws RancherException;
	
	@RequestLine("POST /v1/projects/{id}/?action=deactivate")
	Project deactivate(@Param("id") String id) throws RancherException;
	
	@RequestLine("POST /v1/projects/{id}/?action=activate")
	Project activate(@Param("id") String id) throws RancherException;
	
	@RequestLine("POST /v1/projects/{id}/?action=remove")
	Project remove(@Param("id") String id) throws RancherException;
	
	@RequestLine("POST /v1/projects/{id}/registrationtokens")
	RegistrationToken createRegistrationtoken(@Param("id") String id,RegistrationToken token) throws RancherException;
	
	@RequestLine("GET /v1/projects/{id}/registrationtokens")
	CommanResponse<RegistrationToken> registrationtokens(@Param("id") String id) throws RancherException;
	
	@RequestLine("POST /v1/projects/{id}/registry")
	Registry createRegistry(@Param("id") String id,Registry registry) throws RancherException;
	
	@RequestLine("POST /v1/projects/{projectId}/registries/{id}/?action=deactivate")
	Project deactivateRegistry(@Param("projectId") String projectId,@Param("id") String id) throws RancherException;
	
	@RequestLine("POST /v1/projects/{projectId}/registries/{id}/?action=activate")
	Project activateRegistry(@Param("projectId") String projectId,@Param("id") String id) throws RancherException;
	
	@RequestLine("POST /v1/projects/{projectId}/registries/{id}/?action=remove")
	Project removeRegistry(@Param("projectId") String projectId,@Param("id") String id) throws RancherException;
	
	@RequestLine("POST /v1/projects/{id}/registrycredential")
	Registrycredential createRegistrycredential(@Param("id") String id,Registrycredential registrycredential) throws RancherException;
}
