package justep.rancher.client.model;

import java.util.Map;

public class LogConfig {
	private Map<String,String> config;
	private String driver;
	public Map<String,String> getConfig() {
		return config;
	}
	public void setConfig(Map<String,String> config) {
		this.config = config;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
}
