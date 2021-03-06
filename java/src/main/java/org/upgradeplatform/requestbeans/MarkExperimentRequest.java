package org.upgradeplatform.requestbeans;


public class MarkExperimentRequest {

	
	private String userId;
	private String experimentPoint;
	private String partitionId;
	private String condition;
	
	public MarkExperimentRequest() {}

	public MarkExperimentRequest(String userId, String experimentPoint, String partitionId, String condition) {
		super();
		this.userId = userId;
		this.experimentPoint = experimentPoint;
		this.partitionId = partitionId;
		this.condition = condition;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getExperimentPoint() {
		return experimentPoint;
	}

	public void setExperimentPoint(String experimentPoint) {
		this.experimentPoint = experimentPoint;
	}

	public String getPartitionId() {
		return partitionId;
	}

	public void setPartitionId(String partitionId) {
		this.partitionId = partitionId;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
}
