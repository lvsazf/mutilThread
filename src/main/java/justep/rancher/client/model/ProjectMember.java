package justep.rancher.client.model;

public class ProjectMember {
	private String description;
	private String externalId;
	private String externalIdType;
	private String id;
	private String name;
	private Project projectId;
	private String role;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getExternalId() {
		return externalId;
	}
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}
	public String getExternalIdType() {
		return externalIdType;
	}
	public void setExternalIdType(String externalIdType) {
		this.externalIdType = externalIdType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Project getProjectId() {
		return projectId;
	}
	public void setProjectId(Project projectId) {
		this.projectId = projectId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
