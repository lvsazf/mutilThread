package justep.rancher.client.model;

public class ComposeConfig {
	private String dockerComposeConfig;
	private String rancherComposeConfig;
	public String getDockerComposeConfig() {
		return dockerComposeConfig;
	}
	public void setDockerComposeConfig(String dockerComposeConfig) {
		this.dockerComposeConfig = dockerComposeConfig;
	}
	public String getRancherComposeConfig() {
		return rancherComposeConfig;
	}
	public void setRancherComposeConfig(String rancherComposeConfig) {
		this.rancherComposeConfig = rancherComposeConfig;
	}
}
