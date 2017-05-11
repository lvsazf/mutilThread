package justep.rancher.client.model;

import java.sql.Timestamp;
import java.util.Date;

import justep.rancher.client.utils.ModelUtils;

public abstract class CommanResource {
	private String id;
	private String accountId;
	/**
	 * "creating"
	 * "error"
	 * "erroring"
	 * "migrating"
	 * "purged"
	 * "purging"
	 * "removed"
	 * "removing"
	 * "requested"
	 * "restarting"
	 * "restoring"
	 * "running"
	 * "starting"
	 * "stopped"
	 * "stopping"
	 * "updating-running"
	 * "updating-stopped"
	 */
	private String state;
	private String type;
	private String kind;
	private Date created;
	private Timestamp createdTS;
	private Date removeTime;
	private String removed;
	/**
	 * "yes"
	 * "no"
	 * "error"
	 */
	private String transitioning;
	private String transitioningMessage;
	private Integer transitioningProgress;
	private String uuid;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
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
	public Date getRemoveTime() {
		return removeTime;
	}
	public void setRemoveTime(Date removeTime) {
		this.removeTime = removeTime;
	}
	public String getRemoved() {
		return removed;
	}
	public void setRemoved(String removed) {
		this.removed = removed;
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
	public Integer getTransitioningProgress() {
		return transitioningProgress;
	}
	public void setTransitioningProgress(Integer transitioningProgress) {
		this.transitioningProgress = transitioningProgress;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}
}
