package justep.rancher.client.model;

import java.util.Map;

public class Registrycredential {
	private Map<String,String> data;
	private String description;
	private String name;
	private String publicValue;
	private String registryId;
	private String secretValue;
	private String email;
	public Map<String, String> getData() {
		return data;
	}
	public void setData(Map<String, String> data) {
		this.data = data;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublicValue() {
		return publicValue;
	}
	public void setPublicValue(String publicValue) {
		this.publicValue = publicValue;
	}
	public String getRegistryId() {
		return registryId;
	}
	public void setRegistryId(String registryId) {
		this.registryId = registryId;
	}
	public String getSecretValue() {
		return secretValue;
	}
	public void setSecretValue(String secretValue) {
		this.secretValue = secretValue;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
