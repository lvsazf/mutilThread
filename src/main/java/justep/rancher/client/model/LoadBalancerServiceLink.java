package justep.rancher.client.model;

import java.util.HashSet;
import java.util.Set;

import justep.rancher.client.utils.ModelUtils;

public class LoadBalancerServiceLink {
	private String uuid;
	private String serviceId;
	private Set<String> ports;
	LoadBalancerServiceLink(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public Set<String> getPorts() {
		return ports;
	}

	/**
	 * port format : domain:hostPort:containerPort
	 */
	public void setPorts(Set<String> ports) {
		this.ports = ports;
	}
	
	public void addPort(String domain,Integer hostPort,Integer containerPort) {
		if(ports==null){
			this.ports=new HashSet<String>();
		}
		domain=domain==null?"":domain;
		containerPort=containerPort==null?hostPort:containerPort;
		this.ports.add(domain+":"+hostPort+"="+containerPort);
	}
	
	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}
}
