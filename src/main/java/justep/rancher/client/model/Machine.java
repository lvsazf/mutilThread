package justep.rancher.client.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Machine extends CommanResource{
	private String description;
	private String driver;
	private String externalId;
	private String name;
	private AliyunecsConfig aliyunecsConfig;
	private String authCertificateAuthority;
	private String authKey;
	private String dockerVersion;
	private String engineEnv;
	private String engineInsecureRegistry;
	private String engineInstallUrl;
	private String engineLabel;
	private String engineOpt;
	private String engineRegistryMirror;
	private String engineStorageDriver;
	private String genericConfig;
	private Map<String,String> labels;
	private String openstackConfig;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getExternalId() {
		return externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AliyunecsConfig getAliyunecsConfig() {
		return aliyunecsConfig;
	}
	public void setAliyunecsConfig(AliyunecsConfig aliyunecsConfig) {
		this.aliyunecsConfig = aliyunecsConfig;
	}
	public String getAuthCertificateAuthority() {
		return authCertificateAuthority;
	}
	public void setAuthCertificateAuthority(String authCertificateAuthority) {
		this.authCertificateAuthority = authCertificateAuthority;
	}
	public String getAuthKey() {
		return authKey;
	}
	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}
	public String getDockerVersion() {
		return dockerVersion;
	}
	public void setDockerVersion(String dockerVersion) {
		this.dockerVersion = dockerVersion;
	}
	public String getEngineEnv() {
		return engineEnv;
	}
	public void setEngineEnv(String engineEnv) {
		this.engineEnv = engineEnv;
	}
	public String getEngineInsecureRegistry() {
		return engineInsecureRegistry;
	}
	public void setEngineInsecureRegistry(String engineInsecureRegistry) {
		this.engineInsecureRegistry = engineInsecureRegistry;
	}
	public String getEngineInstallUrl() {
		return engineInstallUrl;
	}
	public void setEngineInstallUrl(String engineInstallUrl) {
		this.engineInstallUrl = engineInstallUrl;
	}
	public String getEngineLabel() {
		return engineLabel;
	}
	public void setEngineLabel(String engineLabel) {
		this.engineLabel = engineLabel;
	}
	public String getEngineOpt() {
		return engineOpt;
	}
	public void setEngineOpt(String engineOpt) {
		this.engineOpt = engineOpt;
	}
	public String getEngineRegistryMirror() {
		return engineRegistryMirror;
	}
	public void setEngineRegistryMirror(String engineRegistryMirror) {
		this.engineRegistryMirror = engineRegistryMirror;
	}
	public String getEngineStorageDriver() {
		return engineStorageDriver;
	}
	public void setEngineStorageDriver(String engineStorageDriver) {
		this.engineStorageDriver = engineStorageDriver;
	}
	public String getGenericConfig() {
		return genericConfig;
	}
	public void setGenericConfig(String genericConfig) {
		this.genericConfig = genericConfig;
	}
	public Map<String,String> getLabels() {
		return labels;
	}
	public void setLabels(Map<String,String> labels) {
		this.labels = labels;
	}
	public String getOpenstackConfig() {
		return openstackConfig;
	}
	public void setOpenstackConfig(String openstackConfig) {
		this.openstackConfig = openstackConfig;
	}
	
	public static MachineBuilder MachineBuilder(String name){
		return new MachineBuilder(name);
	}
	
	public static MachineBuilder MachineBuilder(String name,AliyunecsConfig aliyunecsConfig){
		return new MachineBuilder(name,aliyunecsConfig);
	}
	
	public static class MachineBuilder {
		private String name=null;
		private String engineInstallUrl=null;
		private AliyunecsConfig aliyunecsConfig=null;
		private Map<String,String> labels=new HashMap<String,String>();
		
		public  MachineBuilder(String name,AliyunecsConfig aliyunecsConfig) {
			this.name=name;
			this.aliyunecsConfig=aliyunecsConfig;
		}
		
		public  MachineBuilder(String name) {
			this.name=name;
			this.aliyunecsConfig=new AliyunecsConfig();
		}
		
		public MachineBuilder engineInstallUrl(String url) {
			this.engineInstallUrl = url;
			return this;
		}
		
		public MachineBuilder accessKey(String accessKeyId,String accessKeySecret) {
			this.aliyunecsConfig.setAccessKeyId(accessKeyId);
			this.aliyunecsConfig.setAccessKeySecret(accessKeySecret);
			return this;
		}
		
		public MachineBuilder imageId(String imageId) {
			this.aliyunecsConfig.setImageId(imageId);
			return this;
		}
		
		public MachineBuilder instanceType(String instanceType) {
			this.aliyunecsConfig.setInstanceType(instanceType);
			return this;
		}
		
		public MachineBuilder ioOptimized(String ioOptimized) {
			this.aliyunecsConfig.setIoOptimized(ioOptimized);
			return this;
		}
		
		public MachineBuilder privateIp(String privateIp) {
			this.aliyunecsConfig.setPrivateIp(privateIp);
			return this;
		}
		
		public MachineBuilder diskConfig(String diskCategory,String diskSize) {
			this.aliyunecsConfig.setDiskCategory(diskCategory);
			this.aliyunecsConfig.setDiskSize(diskSize);
			return this;
		}
		
		public MachineBuilder region(String region) {
			this.aliyunecsConfig.setRegion(region);
			return this;
		}
		
		public MachineBuilder securityGroup(String securityGroup) {
			this.aliyunecsConfig.setSecurityGroup(securityGroup);
			return this;
		}
		
		public MachineBuilder sshPassword(String sshPassword) {
			this.aliyunecsConfig.setSshPassword(sshPassword);
			return this;
		}
		
		public MachineBuilder systemDiskCategory(String systemDiskCategory) {
			this.aliyunecsConfig.setSystemDiskCategory(systemDiskCategory);
			return this;
		}
		
		public MachineBuilder vpc(String vpcId,String vswitchId) {
			this.aliyunecsConfig.setVpcId(vpcId);
			this.aliyunecsConfig.setVswitchId(vswitchId);
			return this;
		}
		
		public MachineBuilder privateAddressOnly(boolean privateAddressOnly) {
			this.aliyunecsConfig.setPrivateAddressOnly(privateAddressOnly);
			return this;
		}
		
		public MachineBuilder addLabel(String key,String value) {
			this.labels.put(key, value);
			return this;
		}
		
		public MachineBuilder addLabels(Map<String, String> labels) {
			this.labels.putAll(labels);
			return this;
		}
		
		public MachineBuilder addTag(String tag) {
			if(this.aliyunecsConfig.getTag()==null){
				this.aliyunecsConfig.setTag(new HashSet<String>());
			}
			this.aliyunecsConfig.getTag().add(tag);
			return this;
		}
		
		public Machine build() {
			Machine machine = new Machine();
			machine.setName(name);
			machine.setEngineInstallUrl(engineInstallUrl);
			machine.setAliyunecsConfig(aliyunecsConfig);
			machine.setLabels(labels);
			return machine;
		}
	}
}
