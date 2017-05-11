package justep.rancher.client.model;

public class Project extends CommanResource{
	private String description;
	private Boolean kubernetes;
	private ProjectMember[] members;
	private String name;
	private Boolean publicDns;
	private ServicesPortRange servicesPortRange;
	private Boolean swarm;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getKubernetes() {
		return kubernetes;
	}
	public void setKubernetes(Boolean kubernetes) {
		this.kubernetes = kubernetes;
	}
	public ProjectMember[] getMembers() {
		return members;
	}
	public void setMembers(ProjectMember[] members) {
		this.members = members;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getPublicDns() {
		return publicDns;
	}
	public void setPublicDns(Boolean publicDns) {
		this.publicDns = publicDns;
	}
	public ServicesPortRange getServicesPortRange() {
		return servicesPortRange;
	}
	public void setServicesPortRange(ServicesPortRange servicesPortRange) {
		this.servicesPortRange = servicesPortRange;
	}
	public Boolean getSwarm() {
		return swarm;
	}
	public void setSwarm(Boolean swarm) {
		this.swarm = swarm;
	}
}
