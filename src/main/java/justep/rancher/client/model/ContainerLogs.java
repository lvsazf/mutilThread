package justep.rancher.client.model;

public class ContainerLogs {
	private Boolean follow;
	private Integer lines;

	public Boolean getFollow() {
		return follow;
	}

	public void setFollow(Boolean follow) {
		this.follow = follow;
	}

	public Integer getLines() {
		return lines;
	}

	public void setLines(Integer lines) {
		this.lines = lines;
	}
}
