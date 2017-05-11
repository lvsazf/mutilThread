package justep.rancher.client.model;

public class ServiceLink {
	private String uuid;
	private String serviceId;
	private String name;
	ServiceLink(String serviceId,String name) {
		this.serviceId = serviceId;
		this.name = name;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
