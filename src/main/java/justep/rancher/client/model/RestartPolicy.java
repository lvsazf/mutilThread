package justep.rancher.client.model;

public class RestartPolicy {
	private Integer maximumRetryCount;
	private String name;
	public Integer getMaximumRetryCount() {
		return maximumRetryCount;
	}
	public void setMaximumRetryCount(Integer maximumRetryCount) {
		this.maximumRetryCount = maximumRetryCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
