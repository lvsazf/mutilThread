package justep.rancher.client.bak;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

public class Environment {
	private String id;
	private String type;
	private String name;
	private String state;
	private String accountId;
	private Date created;
	private Timestamp createdTS;
	private String description;
	private String dockerCompose;
	private Map<String,String> environment;
	private String externalId;
	private String healthState;
	private String kind;
	private Map<String,String> outputs;
	private Map<String,String> previousEnvironment;
	private String previousExternalId;
	private String rancherCompose;
	private String removeTime;
	private String removed;
	private Boolean startOnCreate;
	private String transitioning;
	private String transitioningMessage;
	private String transitioningProgress;
	private String uuid;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Timestamp getCreatedTS() {
		return createdTS;
	}
	public void setCreatedTS(Timestamp createdTS) {
		this.createdTS = createdTS;
	}
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
	public Map<String,String> getEnvironment() {
		return environment;
	}
	public void setEnvironment(Map<String,String> environment) {
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
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Map<String,String> getOutputs() {
		return outputs;
	}
	public void setOutputs(Map<String,String> outputs) {
		this.outputs = outputs;
	}
	public Map<String,String> getPreviousEnvironment() {
		return previousEnvironment;
	}
	public void setPreviousEnvironment(Map<String,String> previousEnvironment) {
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
	public String getRemoveTime() {
		return removeTime;
	}
	public void setRemoveTime(String removeTime) {
		this.removeTime = removeTime;
	}
	public String getRemoved() {
		return removed;
	}
	public void setRemoved(String removed) {
		this.removed = removed;
	}
	public Boolean getStartOnCreate() {
		return startOnCreate;
	}
	public void setStartOnCreate(Boolean startOnCreate) {
		this.startOnCreate = startOnCreate;
	}
	public String getTransitioning() {
		return transitioning;
	}
	public void setTransitioning(String transitioning) {
		this.transitioning = transitioning;
	}
	public String getTransitioningMessage() {
		return transitioningMessage;
	}
	public void setTransitioningMessage(String transitioningMessage) {
		this.transitioningMessage = transitioningMessage;
	}
	public String getTransitioningProgress() {
		return transitioningProgress;
	}
	public void setTransitioningProgress(String transitioningProgress) {
		this.transitioningProgress = transitioningProgress;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}
