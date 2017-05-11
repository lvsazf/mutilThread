package justep.rancher.client.model;

import java.util.Set;

public class InServiceUpgradeStrategy {
	private Integer batchSize;
	private Integer intervalMillis;
	private LaunchConfig launchConfig;
	private LaunchConfig previousLaunchConfig;
	private Set<Sidekick> previousSecondaryLaunchConfigs;
	private Set<Sidekick> secondaryLaunchConfigs;
	private Boolean startFirst;
	public Integer getBatchSize() {
		return batchSize;
	}
	public void setBatchSize(Integer batchSize) {
		this.batchSize = batchSize;
	}
	public Integer getIntervalMillis() {
		return intervalMillis;
	}
	public void setIntervalMillis(Integer intervalMillis) {
		this.intervalMillis = intervalMillis;
	}
	public LaunchConfig getLaunchConfig() {
		return launchConfig;
	}
	public void setLaunchConfig(LaunchConfig launchConfig) {
		this.launchConfig = launchConfig;
	}
	public LaunchConfig getPreviousLaunchConfig() {
		return previousLaunchConfig;
	}
	public void setPreviousLaunchConfig(LaunchConfig previousLaunchConfig) {
		this.previousLaunchConfig = previousLaunchConfig;
	}
	public Set<Sidekick> getPreviousSecondaryLaunchConfigs() {
		return previousSecondaryLaunchConfigs;
	}
	public void setPreviousSecondaryLaunchConfigs(Set<Sidekick> previousSecondaryLaunchConfigs) {
		this.previousSecondaryLaunchConfigs = previousSecondaryLaunchConfigs;
	}
	public Set<Sidekick> getSecondaryLaunchConfigs() {
		return secondaryLaunchConfigs;
	}
	public void setSecondaryLaunchConfigs(Set<Sidekick> secondaryLaunchConfigs) {
		this.secondaryLaunchConfigs = secondaryLaunchConfigs;
	}
	public Boolean getStartFirst() {
		return startFirst;
	}
	public void setStartFirst(Boolean startFirst) {
		this.startFirst = startFirst;
	}
}
