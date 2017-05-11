package justep.rancher.client.model;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Service extends CommanResource {
	private Boolean assignServiceIpAddress;
	private Integer createIndex;
	private String description;
	private String environmentId;
	private String externalId;
	private String fqdn;
	private String healthState;
	private LaunchConfig launchConfig;
	private Map<String,String> metadata;
	private String name;
	private Set<PublicEndpoints> publicEndpoints;
	private Boolean retainIp;
	private Integer scale;
	private Set<Sidekick> secondaryLaunchConfigs;
	private String selectorContainer;
	private String selectorLink;
	private Boolean startOnCreate;
	private ServiceUpgrade upgrade;
	private String vip;
	
	public Boolean getAssignServiceIpAddress() {
		return assignServiceIpAddress;
	}
	public void setAssignServiceIpAddress(Boolean assignServiceIpAddress) {
		this.assignServiceIpAddress = assignServiceIpAddress;
	}
	public Integer getCreateIndex() {
		return createIndex;
	}
	public void setCreateIndex(Integer createIndex) {
		this.createIndex = createIndex;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEnvironmentId() {
		return environmentId;
	}
	public void setEnvironmentId(String environmentId) {
		this.environmentId = environmentId;
	}
	public String getExternalId() {
		return externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public String getFqdn() {
		return fqdn;
	}
	public void setFqdn(String fqdn) {
		this.fqdn = fqdn;
	}
	public String getHealthState() {
		return healthState;
	}
	public void setHealthState(String healthState) {
		this.healthState = healthState;
	}
	public LaunchConfig getLaunchConfig() {
		return launchConfig;
	}
	public void setLaunchConfig(LaunchConfig launchConfig) {
		this.launchConfig = launchConfig;
	}
	public Map<String, String> getMetadata() {
		return metadata;
	}
	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<PublicEndpoints> getPublicEndpoints() {
		return publicEndpoints;
	}
	public void setPublicEndpoints(Set<PublicEndpoints> publicEndpoints) {
		this.publicEndpoints = publicEndpoints;
	}
	public Boolean getRetainIp() {
		return retainIp;
	}
	public void setRetainIp(Boolean retainIp) {
		this.retainIp = retainIp;
	}
	public Integer getScale() {
		return scale;
	}
	public void setScale(Integer scale) {
		this.scale = scale;
	}
	public String getSelectorContainer() {
		return selectorContainer;
	}
	public void setSelectorContainer(String selectorContainer) {
		this.selectorContainer = selectorContainer;
	}
	public String getSelectorLink() {
		return selectorLink;
	}
	public void setSelectorLink(String selectorLink) {
		this.selectorLink = selectorLink;
	}
	public Boolean getStartOnCreate() {
		return startOnCreate;
	}
	public void setStartOnCreate(Boolean startOnCreate) {
		this.startOnCreate = startOnCreate;
	}
	public ServiceUpgrade getUpgrade() {
		return upgrade;
	}
	public void setUpgrade(ServiceUpgrade upgrade) {
		this.upgrade = upgrade;
	}
	public String getVip() {
		return vip;
	}
	public void setVip(String vip) {
		this.vip = vip;
	}
	public Set<Sidekick> getSecondaryLaunchConfigs() {
		return secondaryLaunchConfigs;
	}
	public void setSecondaryLaunchConfigs(Set<Sidekick> secondaryLaunchConfigs) {
		this.secondaryLaunchConfigs = secondaryLaunchConfigs;
	}
	
	public static ServiceBuilder ServiceBuilder(String name,String environmentId){
		return new ServiceBuilder(name,environmentId);
	}
	
	public static ServiceBuilder ServiceBuilder(String name,String environmentId, Integer instances){
		return new ServiceBuilder(name,environmentId,instances);
	}
	
	public static class ServiceBuilder {
		private String name=null;
		private String environmentId=null;
		private Integer scale = 1;
		private Boolean retainIp=false;
		private Boolean startOnCreate=true;
		private LaunchConfig launchConfig=null;
		private Set<Sidekick> secondaryLaunchConfigs=new HashSet<Sidekick>();
		
		public  ServiceBuilder(String name,String environmentId) {
			this.name=name;
			this.environmentId=environmentId;
		}
		
		public  ServiceBuilder(String name,String environmentId,Integer scale) {
			this.name=name;
			this.environmentId=environmentId;
			this.scale = scale;
		}
		
		public ServiceBuilder scale(Integer scale) {
			this.scale = scale;
			return this;
		}
		
		public ServiceBuilder retainIp(Boolean retainIp) {
			this.retainIp = retainIp;
			return this;
		}
		
		public ServiceBuilder startOnCreate(Boolean startOnCreate) {
			this.startOnCreate = startOnCreate;
			return this;
		}
		
		public ServiceBuilder launchConfig(LaunchConfig launchConfig){
			this.launchConfig = launchConfig;
			return this;
		}
		
		public ServiceBuilder sidekick(Sidekick sidekick){
			this.secondaryLaunchConfigs.add(sidekick);
			return this;
		}

		public Service build() {
			Service service = new Service();
			service.setName(name);
			service.setEnvironmentId(environmentId);
			service.setScale(scale);
			service.setLaunchConfig(launchConfig);
			service.setSecondaryLaunchConfigs(secondaryLaunchConfigs);
			service.setStartOnCreate(startOnCreate);
			service.setRetainIp(retainIp);
			return service;
		}
	}
}
