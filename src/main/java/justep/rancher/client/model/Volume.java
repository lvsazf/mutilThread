package justep.rancher.client.model;

import java.util.Map;

public class Volume {
	private String description;
	private String driver;
	private Map<String,String> driverOpts;
	private String externalId;
	private String id;
	private String imageId;
	private String instanceId;
	private Boolean isHostPath;
	private String name;
	private String uri;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public Map<String, String> getDriverOpts() {
		return driverOpts;
	}
	public void setDriverOpts(Map<String, String> driverOpts) {
		this.driverOpts = driverOpts;
	}
	public String getExternalId() {
		return externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getInstanceId() {
		return instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	public Boolean getIsHostPath() {
		return isHostPath;
	}
	public void setIsHostPath(Boolean isHostPath) {
		this.isHostPath = isHostPath;
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
