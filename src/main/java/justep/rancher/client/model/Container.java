package justep.rancher.client.model;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Container extends CommanResource{
	private String agentId;
	private String allocationState;
	private Integer count;
	private Integer createIndex;
	private String deploymentUnitUuid;
	private String description;
	private Set<String> expose;
	private String externalId;
	private Date firstRunning;
	private String healthState;
	private String hostId;
	private String hostname;
	private String imageUuid;
	private String name;
	private Boolean nativeContainer;
	private String networkContainerId;
	private Set<String> networkIds;
	private Set<String> ports;
	private String primaryIpAddress;
	private String registryCredentialId;
	private String requestedHostId;
	private Integer startCount;
	private Boolean startOnCreate;
	/**
	 * "NetworkAgent",
	 * "LoadBalancerAgent",
	 */
	private String systemContainer;
	private String token;
	private String version;
	private String volumeDriver;
	private Map<String,String> environment;
	private List<String> command;
	private String workingDir;
	private String user;
	private Boolean publishAllPorts;
	private Boolean privileged;
	private Set<String> capAdd;
	private Set<String> capDrop;
	private List<String> dns;
	private List<String> dnsSearch;
	private Map<String,String> instanceLinks;
	private String domainName;
	private Long memorySwap;
	private Long memory;
	private String cpuSet;
	private Integer cpuShares;
	private Boolean stdinOpen;
	private Boolean tty;
	private List<String> entryPoint;
	private Map<String,String> lxcConf;
	private RestartPolicy restartPolicy;
	private Set<String> devices;
	private Map<String,String> labels;
	private InstanceHealthCheck healthCheck;
	private Set<String> securityOpt;
	private LogConfig logConfig;
	private String pidMode;
	private Set<String> extraHosts;
	private Boolean readOnly;
	private DockerBuild build;
	private Map<String,String> dataVolumeMounts;
	private String networkMode;
	private Set<String> dataVolume;
	private Set<String> dataVolumesFrom;
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getAllocationState() {
		return allocationState;
	}
	public void setAllocationState(String allocationState) {
		this.allocationState = allocationState;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Integer getCreateIndex() {
		return createIndex;
	}
	public void setCreateIndex(Integer createIndex) {
		this.createIndex = createIndex;
	}
	public String getDeploymentUnitUuid() {
		return deploymentUnitUuid;
	}
	public void setDeploymentUnitUuid(String deploymentUnitUuid) {
		this.deploymentUnitUuid = deploymentUnitUuid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<String> getExpose() {
		return expose;
	}
	public void setExpose(Set<String> expose) {
		this.expose = expose;
	}
	public String getExternalId() {
		return externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public Date getFirstRunning() {
		return firstRunning;
	}
	public void setFirstRunning(Date firstRunning) {
		this.firstRunning = firstRunning;
	}
	public String getHealthState() {
		return healthState;
	}
	public void setHealthState(String healthState) {
		this.healthState = healthState;
	}
	public String getHostId() {
		return hostId;
	}
	public void setHostId(String hostId) {
		this.hostId = hostId;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public String getImageUuid() {
		return imageUuid;
	}
	public void setImageUuid(String imageUuid) {
		this.imageUuid = imageUuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getNativeContainer() {
		return nativeContainer;
	}
	public void setNativeContainer(Boolean nativeContainer) {
		this.nativeContainer = nativeContainer;
	}
	public String getNetworkContainerId() {
		return networkContainerId;
	}
	public void setNetworkContainerId(String networkContainerId) {
		this.networkContainerId = networkContainerId;
	}
	public Set<String> getNetworkIds() {
		return networkIds;
	}
	public void setNetworkIds(Set<String> networkIds) {
		this.networkIds = networkIds;
	}
	public Set<String> getPorts() {
		return ports;
	}
	public void setPorts(Set<String> ports) {
		this.ports = ports;
	}
	public String getPrimaryIpAddress() {
		return primaryIpAddress;
	}
	public void setPrimaryIpAddress(String primaryIpAddress) {
		this.primaryIpAddress = primaryIpAddress;
	}
	public String getRegistryCredentialId() {
		return registryCredentialId;
	}
	public void setRegistryCredentialId(String registryCredentialId) {
		this.registryCredentialId = registryCredentialId;
	}
	public String getRequestedHostId() {
		return requestedHostId;
	}
	public void setRequestedHostId(String requestedHostId) {
		this.requestedHostId = requestedHostId;
	}
	public Integer getStartCount() {
		return startCount;
	}
	public void setStartCount(Integer startCount) {
		this.startCount = startCount;
	}
	public Boolean getStartOnCreate() {
		return startOnCreate;
	}
	public void setStartOnCreate(Boolean startOnCreate) {
		this.startOnCreate = startOnCreate;
	}
	public String getSystemContainer() {
		return systemContainer;
	}
	public void setSystemContainer(String systemContainer) {
		this.systemContainer = systemContainer;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getVolumeDriver() {
		return volumeDriver;
	}
	public void setVolumeDriver(String volumeDriver) {
		this.volumeDriver = volumeDriver;
	}
	public Map<String,String> getEnvironment() {
		return environment;
	}
	public void setEnvironment(Map<String,String> environment) {
		this.environment = environment;
	}
	public List<String> getCommand() {
		return command;
	}
	public void setCommand(List<String> command) {
		this.command = command;
	}
	public String getWorkingDir() {
		return workingDir;
	}
	public void setWorkingDir(String workingDir) {
		this.workingDir = workingDir;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Boolean getPublishAllPorts() {
		return publishAllPorts;
	}
	public void setPublishAllPorts(Boolean publishAllPorts) {
		this.publishAllPorts = publishAllPorts;
	}
	public Boolean getPrivileged() {
		return privileged;
	}
	public void setPrivileged(Boolean privileged) {
		this.privileged = privileged;
	}
	public Set<String> getCapAdd() {
		return capAdd;
	}
	public void setCapAdd(Set<String> capAdd) {
		this.capAdd = capAdd;
	}
	public Set<String> getCapDrop() {
		return capDrop;
	}
	public void setCapDrop(Set<String> capDrop) {
		this.capDrop = capDrop;
	}
	public List<String> getDns() {
		return dns;
	}
	public void setDns(List<String> dns) {
		this.dns = dns;
	}
	public List<String> getDnsSearch() {
		return dnsSearch;
	}
	public void setDnsSearch(List<String> dnsSearch) {
		this.dnsSearch = dnsSearch;
	}
	public Map<String, String> getInstanceLinks() {
		return instanceLinks;
	}
	public void setInstanceLinks(Map<String, String> instanceLinks) {
		this.instanceLinks = instanceLinks;
	}
	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	public Long getMemorySwap() {
		return memorySwap;
	}
	public void setMemorySwap(Long memorySwap) {
		this.memorySwap = memorySwap;
	}
	public Long getMemory() {
		return memory;
	}
	public void setMemory(Long memory) {
		this.memory = memory;
	}
	public String getCpuSet() {
		return cpuSet;
	}
	public void setCpuSet(String cpuSet) {
		this.cpuSet = cpuSet;
	}
	public Integer getCpuShares() {
		return cpuShares;
	}
	public void setCpuShares(Integer cpuShares) {
		this.cpuShares = cpuShares;
	}
	public Boolean getStdinOpen() {
		return stdinOpen;
	}
	public void setStdinOpen(Boolean stdinOpen) {
		this.stdinOpen = stdinOpen;
	}
	public Boolean getTty() {
		return tty;
	}
	public void setTty(Boolean tty) {
		this.tty = tty;
	}
	public List<String> getEntryPoint() {
		return entryPoint;
	}
	public void setEntryPoint(List<String> entryPoint) {
		this.entryPoint = entryPoint;
	}
	public Map<String, String> getLxcConf() {
		return lxcConf;
	}
	public void setLxcConf(Map<String, String> lxcConf) {
		this.lxcConf = lxcConf;
	}
	public RestartPolicy getRestartPolicy() {
		return restartPolicy;
	}
	public void setRestartPolicy(RestartPolicy restartPolicy) {
		this.restartPolicy = restartPolicy;
	}
	public Set<String> getDevices() {
		return devices;
	}
	public void setDevices(Set<String> devices) {
		this.devices = devices;
	}
	public Map<String, String> getLabels() {
		return labels;
	}
	public void setLabels(Map<String, String> labels) {
		this.labels = labels;
	}
	public InstanceHealthCheck getHealthCheck() {
		return healthCheck;
	}
	public void setHealthCheck(InstanceHealthCheck healthCheck) {
		this.healthCheck = healthCheck;
	}
	public Set<String> getSecurityOpt() {
		return securityOpt;
	}
	public void setSecurityOpt(Set<String> securityOpt) {
		this.securityOpt = securityOpt;
	}
	public LogConfig getLogConfig() {
		return logConfig;
	}
	public void setLogConfig(LogConfig logConfig) {
		this.logConfig = logConfig;
	}
	public String getPidMode() {
		return pidMode;
	}
	public void setPidMode(String pidMode) {
		this.pidMode = pidMode;
	}
	public Set<String> getExtraHosts() {
		return extraHosts;
	}
	public void setExtraHosts(Set<String> extraHosts) {
		this.extraHosts = extraHosts;
	}
	public Boolean getReadOnly() {
		return readOnly;
	}
	public void setReadOnly(Boolean readOnly) {
		this.readOnly = readOnly;
	}
	public DockerBuild getBuild() {
		return build;
	}
	public void setBuild(DockerBuild build) {
		this.build = build;
	}
	public Map<String,String> getDataVolumeMounts() {
		return dataVolumeMounts;
	}
	public void setDataVolumeMounts(Map<String,String> dataVolumeMounts) {
		this.dataVolumeMounts = dataVolumeMounts;
	}
	public String getNetworkMode() {
		return networkMode;
	}
	public void setNetworkMode(String networkMode) {
		this.networkMode = networkMode;
	}
	public Set<String> getDataVolume() {
		return dataVolume;
	}
	public void setDataVolume(Set<String> dataVolume) {
		this.dataVolume = dataVolume;
	}
	public Set<String> getDataVolumesFrom() {
		return dataVolumesFrom;
	}
	public void setDataVolumesFrom(Set<String> dataVolumesFrom) {
		this.dataVolumesFrom = dataVolumesFrom;
	}
}
