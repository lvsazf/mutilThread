package justep.rancher.client.bak;

import java.sql.Timestamp;
import java.util.Date;

import justep.rancher.client.model.ProjectMember;
import justep.rancher.client.model.ServicesPortRange;

public class Project {
	private String id;
	private String type;
	private String name;
	private String state;
	private Boolean allowSystemRole;
	private Date created;
	private Timestamp createdTS;
	private String description;
	private String kind;
	private Boolean kubernetes;
	private ProjectMember[] members;
	private Boolean publicDns;
	private Timestamp removeTime;
	private Date removed;
	private ServicesPortRange servicesPortRange;
	private Boolean swarm;
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
	public Boolean getAllowSystemRole() {
		return allowSystemRole;
	}
	public void setAllowSystemRole(Boolean allowSystemRole) {
		this.allowSystemRole = allowSystemRole;
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
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Boolean getKubernetes() {
		return kubernetes;
	}
	public void setKubernetes(Boolean kubernetes) {
		this.kubernetes = kubernetes;
	}
	public ProjectMember[] getMembers() {
		return members;
	}
	public void setMembers(ProjectMember[] members) {
		this.members = members;
	}
	public Boolean getPublicDns() {
		return publicDns;
	}
	public void setPublicDns(Boolean publicDns) {
		this.publicDns = publicDns;
	}
	public Timestamp getRemoveTime() {
		return removeTime;
	}
	public void setRemoveTime(Timestamp removeTime) {
		this.removeTime = removeTime;
	}
	public Date getRemoved() {
		return removed;
	}
	public void setRemoved(Date removed) {
		this.removed = removed;
	}
	public ServicesPortRange getServicesPortRange() {
		return servicesPortRange;
	}
	public void setServicesPortRange(ServicesPortRange servicesPortRange) {
		this.servicesPortRange = servicesPortRange;
	}
	public Boolean getSwarm() {
		return swarm;
	}
	public void setSwarm(Boolean swarm) {
		this.swarm = swarm;
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
