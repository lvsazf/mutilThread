package justep.rancher.client.model;

public class RegistrationToken extends CommanResource {
	private String description;
	private String name;
	private String command;
	private String image;
	private String token;
	private String registrationUrl;
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
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getRegistrationUrl() {
		return registrationUrl;
	}
	public void setRegistrationUrl(String registrationUrl) {
		this.registrationUrl = registrationUrl;
	}
	
}
