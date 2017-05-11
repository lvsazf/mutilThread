package justep.rancher.client.model;

public class DockerBuild{
	private String context;
	private String dockerfile;
	private Boolean forcerm;
	private Boolean nocache;
	private String remote;
	private Boolean rm;
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getDockerfile() {
		return dockerfile;
	}
	public void setDockerfile(String dockerfile) {
		this.dockerfile = dockerfile;
	}
	public Boolean getForcerm() {
		return forcerm;
	}
	public void setForcerm(Boolean forcerm) {
		this.forcerm = forcerm;
	}
	public Boolean getNocache() {
		return nocache;
	}
	public void setNocache(Boolean nocache) {
		this.nocache = nocache;
	}
	public String getRemote() {
		return remote;
	}
	public void setRemote(String remote) {
		this.remote = remote;
	}
	public Boolean getRm() {
		return rm;
	}
	public void setRm(Boolean rm) {
		this.rm = rm;
	}
}
