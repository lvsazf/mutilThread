package justep.rancher.client.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

public class LaunchBuilder {
	private Set<String> ports=new HashSet<String>();
	private Set<String> volumes=new HashSet<String>();
	private Set<String> volumesSidekick=new HashSet<String>();
	private List<String> dns=new LinkedList<String>();
	private List<String> commands=new LinkedList<String>();
	private List<String> entryPoints=new LinkedList<String>();
	private Map<String,String> environments=new HashMap<String,String>();
	private Map<String, String> labels=new HashMap<String, String>();
	private String network = "managed";
	private String dockerImage = null;
	private Double cpus = null;
	private Double memory = null;
	private boolean privileged = false;
	private boolean interactive=true;
	private boolean tty=true;
	private InstanceHealthCheck healthCheck;
	private  LaunchBuilder(String dockerImage) {
		this.dockerImage = dockerImage;
	}
	private  LaunchBuilder(String dockerImage, Double cpus, Double memory) {
		this.dockerImage = dockerImage;
		this.cpus = cpus;
		this.memory = memory;
	}
	
	public static LaunchBuilder init(String dockerImage){
		return new LaunchBuilder(dockerImage);
	}
	
	public static LaunchBuilder init(String dockerImage, Double cpus, Double memory){
		return new LaunchBuilder(dockerImage, cpus, memory);
	}
	public LaunchBuilder volume(String containerPath, String hostPath, String mode){
		String v=containerPath;
		if(StringUtils.isNotBlank(hostPath)){
			v=v+":"+hostPath;
		}
		if(StringUtils.isNotBlank(mode)){
			v=v+":"+mode;
		}
		this.volumes.add(v);
		return this;
	}
	
	public LaunchBuilder volume(String containerPath, String hostPath){
		volume(containerPath, hostPath, null);
		return this;
	}
	
	public LaunchBuilder volume(String containerPath){
		volume(containerPath, null, null);
		return this;
	}
	
	public LaunchBuilder volumeSidekick(String sidekick){
		this.volumesSidekick.add(sidekick);
		return this;
	}
	
	public LaunchBuilder addDns(String ip){
		this.dns.add(ip);
		return this;
	}
	
	public LaunchBuilder command(String command){
		this.commands.add(command);
		return this;
	}
	
	public LaunchBuilder addEnvironment(String key,String value){
		this.environments.put(key, value);
		return this;
	}
	
	public LaunchBuilder entryPoint(String entryPoint){
		this.entryPoints.add(entryPoint);
		return this;
	}
	
	public LaunchBuilder console(boolean interactive,boolean tty){
		this.interactive=interactive;
		this.tty=tty;
		return this;
	}

	public LaunchBuilder portMapping(Integer hostPort,Integer containerPort) {
		containerPort=containerPort==null?hostPort:containerPort;
		this.ports.add(hostPort+":"+containerPort);
		return this;
	}
	
	public LaunchBuilder healthCheck(InstanceHealthCheck healthCheck){
		this.healthCheck=healthCheck;
		return this;
	}
	
	public LaunchBuilder forcePullImage(boolean forcePullImage){
		if(forcePullImage){
			labels.put("io.rancher.container.pull_image", "always");
		}
		return this;
	}
	
	public LaunchBuilder requestIp(String ip){
		if(StringUtils.isNotBlank(ip)){
			labels.put("io.rancher.container.requested_ip", ip);
		}
		return this;
	}
	
	public LaunchBuilder startOnce(){
		labels.put("io.rancher.container.start_once","true");
		return this;
	}
	
	public LaunchBuilder everyHost(){
		labels.put("io.rancher.scheduler.global","true");
		return this;
	}
	/**
	 * condition value support:["","ne","soft","soft_ne"]
	 * filed value support:["host_label","container_label","container"]
	 * 
	 * Filed:
	 * 
	 * host label				 ==> host_label
	 * container with label 	 ==> container_label
	 * service with the name 	 ==> container_label  ; key ==> io.rancher.stack_service.name 
	 * container with the name	 ==> container		  ; labelValue only have value but not key 
	 */
	public LaunchBuilder scheduling(String condition,String filed,String key,String value){
		String labelKey="io.rancher.scheduler.affinity:";
		String labelValue="";
		if(StringUtils.isNotBlank(filed)){
			labelKey+=filed;
		}
		if(StringUtils.isNotBlank(condition)){
			labelKey+="_";
			labelKey+=condition;
		}
		if(StringUtils.isNotBlank(key)){
			labelValue+=key;
		}
		if(StringUtils.isNotBlank(value)){
			if(!"container".equals(filed)){
				labelValue+="=";
			}
			labelValue+=value;
		}
		labels.put(labelKey, labelValue);
		return this;
	}
	
	public LaunchBuilder privileged(boolean privileged){
		this.privileged = privileged;
		return this;
	}
	
	public LaunchConfig build() {
		LaunchConfig config = new LaunchConfig();
		config.setImageUuid("docker:"+dockerImage);
		config.setNetworkMode(network);
		config.setPrivileged(privileged);
		config.setStdinOpen(interactive);
		config.setTty(tty);
		config.setHealthCheck(healthCheck);
		if(cpus!=null){
			config.setCpuShares((int)(cpus*1024));
		}
		if(memory!=null){
			config.setMemory((long)(memory*1024*1024));
		}
		if (!labels.isEmpty()) {
			config.setLabels(labels);
		}
		if (!ports.isEmpty()) {
			config.setPorts(ports);
		}
		if (!volumes.isEmpty()) {
			config.setDataVolumes(volumes);
		}
		if (!volumesSidekick.isEmpty()) {
			config.setDataVolumesFromLaunchConfigs(volumesSidekick);
		}
		if (!dns.isEmpty()) {
			config.setDns(dns);
		}
		if (!commands.isEmpty()) {
			config.setCommand(commands);
		}
		if (!environments.isEmpty()) {
			config.setEnvironment(environments);
		}
		if (!entryPoints.isEmpty()) {
			config.setEntryPoint(entryPoints);
		}
		return config;
	}
	
	public Sidekick build(String name) {
		Sidekick config = new Sidekick();
		config.setImageUuid("docker:"+dockerImage);
		config.setNetworkMode(network);
		config.setPrivileged(privileged);
		config.setStdinOpen(interactive);
		config.setTty(tty);
		config.setHealthCheck(healthCheck);
		config.setName(name);
		if(cpus!=null){
			config.setCpuShares((int)(cpus*1024));
		}
		if(memory!=null){
			config.setMemory((long)(memory*1024*1024));
		}
		if (!labels.isEmpty()) {
			config.setLabels(labels);
		}
		if (!ports.isEmpty()) {
			config.setPorts(ports);
		}
		if (!volumes.isEmpty()) {
			config.setDataVolumes(volumes);
		}
		if (!volumesSidekick.isEmpty()) {
			config.setDataVolumesFromLaunchConfigs(volumesSidekick);
		}
		if (!dns.isEmpty()) {
			config.setDns(dns);
		}
		if (!commands.isEmpty()) {
			config.setCommand(commands);
		}
		if (!environments.isEmpty()) {
			config.setEnvironment(environments);
		}
		if (!entryPoints.isEmpty()) {
			config.setEntryPoint(entryPoints);
		}
		return config;
	}
}
