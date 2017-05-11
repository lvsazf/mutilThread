package justep.rancher.client.model;

public class Agent extends CommanResource {
	private String managedConfig;
	private String name;
	private String uri;
	public String getManagedConfig() {
		return managedConfig;
	}
	public void setManagedConfig(String managedConfig) {
		this.managedConfig = managedConfig;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
}
