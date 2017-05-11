package justep.rancher.client.model;

public class ToServiceUpgradeStrategy {
	private Integer batchSize;
	private Integer finalScale;
	private Integer intervalMillis;
	private String toServiceId;
	private Boolean updateLinks;
	public Integer getBatchSize() {
		return batchSize;
	}
	public void setBatchSize(Integer batchSize) {
		this.batchSize = batchSize;
	}
	public Integer getFinalScale() {
		return finalScale;
	}
	public void setFinalScale(Integer finalScale) {
		this.finalScale = finalScale;
	}
	public Integer getIntervalMillis() {
		return intervalMillis;
	}
	public void setIntervalMillis(Integer intervalMillis) {
		this.intervalMillis = intervalMillis;
	}
	public String getToServiceId() {
		return toServiceId;
	}
	public void setToServiceId(String toServiceId) {
		this.toServiceId = toServiceId;
	}
	public Boolean getUpdateLinks() {
		return updateLinks;
	}
	public void setUpdateLinks(Boolean updateLinks) {
		this.updateLinks = updateLinks;
	}
}
