package justep.rancher.client.model;

public class InstanceHealthCheck {
	private Integer healthyThreshold;
	private Integer initializingTimeout;
	private Integer interval;
	private String name;
	private Integer port;
	private RecreateOnQuorumStrategyConfig recreateOnQuorumStrategyConfig;
	private Integer reinitializingTimeout;
	private String requestLine;
	private Integer responseTimeout;
	private String strategy;
	private Integer unhealthyThreshold;
	public Integer getHealthyThreshold() {
		return healthyThreshold;
	}
	public void setHealthyThreshold(Integer healthyThreshold) {
		this.healthyThreshold = healthyThreshold;
	}
	public Integer getInitializingTimeout() {
		return initializingTimeout;
	}
	public void setInitializingTimeout(Integer initializingTimeout) {
		this.initializingTimeout = initializingTimeout;
	}
	public Integer getInterval() {
		return interval;
	}
	public void setInterval(Integer interval) {
		this.interval = interval;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public Integer getReinitializingTimeout() {
		return reinitializingTimeout;
	}
	public void setReinitializingTimeout(Integer reinitializingTimeout) {
		this.reinitializingTimeout = reinitializingTimeout;
	}
	public String getRequestLine() {
		return requestLine;
	}
	public void setRequestLine(String requestLine) {
		this.requestLine = requestLine;
	}
	public Integer getResponseTimeout() {
		return responseTimeout;
	}
	public void setResponseTimeout(Integer responseTimeout) {
		this.responseTimeout = responseTimeout;
	}
	public String getStrategy() {
		return strategy;
	}
	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}
	public Integer getUnhealthyThreshold() {
		return unhealthyThreshold;
	}
	public void setUnhealthyThreshold(Integer unhealthyThreshold) {
		this.unhealthyThreshold = unhealthyThreshold;
	}
	public RecreateOnQuorumStrategyConfig getRecreateOnQuorumStrategyConfig() {
		return recreateOnQuorumStrategyConfig;
	}
	public void setRecreateOnQuorumStrategyConfig(RecreateOnQuorumStrategyConfig recreateOnQuorumStrategyConfig) {
		this.recreateOnQuorumStrategyConfig = recreateOnQuorumStrategyConfig;
	}
}
