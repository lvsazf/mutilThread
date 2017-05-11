package justep.rancher.client.model;

public class RestartStrategy {
	private RollingRestartStrategy rollingRestartStrategy;
	
	public RestartStrategy(Integer batchSize, Integer intervalMillis) {
		this.rollingRestartStrategy = new RollingRestartStrategy(batchSize,intervalMillis);
	}
	public RollingRestartStrategy getRollingRestartStrategy() {
		return rollingRestartStrategy;
	}
	class RollingRestartStrategy{
		private Integer batchSize;
		private Integer intervalMillis;
		RollingRestartStrategy(Integer batchSize, Integer intervalMillis) {
			this.setBatchSize(batchSize);
			this.setIntervalMillis(intervalMillis);
		}
		public Integer getBatchSize() {
			return batchSize;
		}
		void setBatchSize(Integer batchSize) {
			this.batchSize = batchSize;
		}
		public Integer getIntervalMillis() {
			return intervalMillis;
		}
		void setIntervalMillis(Integer intervalMillis) {
			this.intervalMillis = intervalMillis;
		}
	}
}
