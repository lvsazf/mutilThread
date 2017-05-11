package justep.rancher.client.model;

import java.util.Set;

public class AliyunecsConfig {
	private String accessKeyId;
	private String accessKeySecret;
	private String apiEndpoint;
	private String description;
	private String diskCategory;
	private String diskSize;
	private String imageId;
	private String instanceType;
	private String internetMaxBandwidth;
	private String ioOptimized;
	private String privateIp;
	private String region;
	private String routeCidr;
	private String securityGroup;
	private String slbId;
	private String sshPassword;
	private String systemDiskCategory;
	private String vpcId;
	private String vswitchId;
	private String zone;
	private Boolean privateAddressOnly;
	private Set<String> tag;
	public String getAccessKeyId() {
		return accessKeyId;
	}
	public void setAccessKeyId(String accessKeyId) {
		this.accessKeyId = accessKeyId;
	}
	public String getAccessKeySecret() {
		return accessKeySecret;
	}
	public void setAccessKeySecret(String accessKeySecret) {
		this.accessKeySecret = accessKeySecret;
	}
	public String getApiEndpoint() {
		return apiEndpoint;
	}
	public void setApiEndpoint(String apiEndpoint) {
		this.apiEndpoint = apiEndpoint;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDiskCategory() {
		return diskCategory;
	}
	public void setDiskCategory(String diskCategory) {
		this.diskCategory = diskCategory;
	}
	public String getDiskSize() {
		return diskSize;
	}
	public void setDiskSize(String diskSize) {
		this.diskSize = diskSize;
	}
	public String getImageId() {
		return imageId;
	}
	public void setImageId(String imageId) {
		this.imageId = imageId;
	}
	public String getInstanceType() {
		return instanceType;
	}
	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}
	public String getInternetMaxBandwidth() {
		return internetMaxBandwidth;
	}
	public void setInternetMaxBandwidth(String internetMaxBandwidth) {
		this.internetMaxBandwidth = internetMaxBandwidth;
	}
	public String getIoOptimized() {
		return ioOptimized;
	}
	public void setIoOptimized(String ioOptimized) {
		this.ioOptimized = ioOptimized;
	}
	public String getPrivateIp() {
		return privateIp;
	}
	public void setPrivateIp(String privateIp) {
		this.privateIp = privateIp;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRouteCidr() {
		return routeCidr;
	}
	public void setRouteCidr(String routeCidr) {
		this.routeCidr = routeCidr;
	}
	public String getSecurityGroup() {
		return securityGroup;
	}
	public void setSecurityGroup(String securityGroup) {
		this.securityGroup = securityGroup;
	}
	public String getSlbId() {
		return slbId;
	}
	public void setSlbId(String slbId) {
		this.slbId = slbId;
	}
	public String getSshPassword() {
		return sshPassword;
	}
	public void setSshPassword(String sshPassword) {
		this.sshPassword = sshPassword;
	}
	public String getSystemDiskCategory() {
		return systemDiskCategory;
	}
	public void setSystemDiskCategory(String systemDiskCategory) {
		this.systemDiskCategory = systemDiskCategory;
	}
	public String getVpcId() {
		return vpcId;
	}
	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}
	public String getVswitchId() {
		return vswitchId;
	}
	public void setVswitchId(String vswitchId) {
		this.vswitchId = vswitchId;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public Boolean getPrivateAddressOnly() {
		return privateAddressOnly;
	}
	public void setPrivateAddressOnly(Boolean privateAddressOnly) {
		this.privateAddressOnly = privateAddressOnly;
	}
	public Set<String> getTag() {
		return tag;
	}
	public void setTag(Set<String> tag) {
		this.tag = tag;
	}
}
