package justep.rancher.client.model;

import java.util.Map;

public class Environment extends CommanResource{
	private String description;
	private String dockerCompose;
	private Map<String,String> environment;
	private String externalId;
	private String healthState;
	private String name;
	private Map<String,String> outputs;
	private Map<String,String> previousEnvironment;
	private String previousExternalId;
	private String rancherCompose;
	private Boolean startOnCreate;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDockerCompose() {
		return dockerCompose;
	}
	public void setDockerCompose(String dockerCompose) {
		this.dockerCompose = dockerCompose;
	}
	public Map<String, String> getEnvironment() {
		return environment;
	}
	public void setEnvironment(Map<String, String> environment) {
		this.environment = environment;
	}
	public String getExternalId() {
		return externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public String getHealthState() {
		return healthState;
	}
	public void setHealthState(String healthState) {
		this.healthState = healthState;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, String> getOutputs() {
		return outputs;
	}
	public void setOutputs(Map<String, String> outputs) {
		this.outputs = outputs;
	}
	public Map<String, String> getPreviousEnvironment() {
		return previousEnvironment;
	}
	public void setPreviousEnvironment(Map<String, String> previousEnvironment) {
		this.previousEnvironment = previousEnvironment;
	}
	public String getPreviousExternalId() {
		return previousExternalId;
	}
	public void setPreviousExternalId(String previousExternalId) {
		this.previousExternalId = previousExternalId;
	}
	public String getRancherCompose() {
		return rancherCompose;
	}
	public void setRancherCompose(String rancherCompose) {
		this.rancherCompose = rancherCompose;
	}
	public Boolean getStartOnCreate() {
		return startOnCreate;
	}
	public void setStartOnCreate(Boolean startOnCreate) {
		this.startOnCreate = startOnCreate;
	}
}
