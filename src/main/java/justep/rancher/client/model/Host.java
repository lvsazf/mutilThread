package justep.rancher.client.model;

import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;

public class Host extends CommanResource{
	private String agentState;
	private Integer computeTotal;
	private String description;
	private String name;
	private String physicalHostId;
	private JsonNode info;
	private String hostname;
	private Map<String,String> labels;
	private Set<PublicEndpoints> publicEndpoints;
	private Set<IpAddress> ipAddresses;
	public String getAgentState() {
		return agentState;
	}
	public void setAgentState(String agentState) {
		this.agentState = agentState;
	}
	public Integer getComputeTotal() {
		return computeTotal;
	}
	public void setComputeTotal(Integer computeTotal) {
		this.computeTotal = computeTotal;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhysicalHostId() {
		return physicalHostId;
	}
	public void setPhysicalHostId(String physicalHostId) {
		this.physicalHostId = physicalHostId;
	}
	public JsonNode getInfo() {
		return info;
	}
	public void setInfo(JsonNode info) {
		this.info = info;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public Map<String, String> getLabels() {
		return labels;
	}
	public void setLabels(Map<String, String> labels) {
		this.labels = labels;
	}
	public Set<PublicEndpoints> getPublicEndpoints() {
		return publicEndpoints;
	}
	public void setPublicEndpoints(Set<PublicEndpoints> publicEndpoints) {
		this.publicEndpoints = publicEndpoints;
	}
	public Set<IpAddress> getIpAddresses() {
		return ipAddresses;
	}
	public void setIpAddresses(Set<IpAddress> ipAddresses) {
		this.ipAddresses = ipAddresses;
	}
}
