package justep.rancher.client.model;

public class ServiceUpgrade {
	private InServiceUpgradeStrategy inServiceStrategy;
	private ToServiceUpgradeStrategy toServiceStrategy;
	public InServiceUpgradeStrategy getInServiceStrategy() {
		return inServiceStrategy;
	}
	public void setInServiceStrategy(InServiceUpgradeStrategy inServiceStrategy) {
		this.inServiceStrategy = inServiceStrategy;
	}
	public ToServiceUpgradeStrategy getToServiceStrategy() {
		return toServiceStrategy;
	}
	public void setToServiceStrategy(ToServiceUpgradeStrategy toServiceStrategy) {
		this.toServiceStrategy = toServiceStrategy;
	}
}
