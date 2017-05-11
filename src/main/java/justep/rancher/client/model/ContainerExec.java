package justep.rancher.client.model;

import java.util.Set;

public class ContainerExec {
	private Boolean attachStdin;
	private Boolean attachStdout;
	private Set<String> command;
	private Boolean tty;
	public Boolean getAttachStdin() {
		return attachStdin;
	}
	public void setAttachStdin(Boolean attachStdin) {
		this.attachStdin = attachStdin;
	}
	public Boolean getAttachStdout() {
		return attachStdout;
	}
	public void setAttachStdout(Boolean attachStdout) {
		this.attachStdout = attachStdout;
	}
	public Set<String> getCommand() {
		return command;
	}
	public void setCommand(Set<String> command) {
		this.command = command;
	}
	public Boolean getTty() {
		return tty;
	}
	public void setTty(Boolean tty) {
		this.tty = tty;
	}
}
