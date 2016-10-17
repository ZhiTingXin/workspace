package VO;



public class systemStrategyVO {
	String systemStrategyInfo;
	String systemStaffID;

	public systemStrategyVO(String systemStrategyInfo, String systemStaffID) {
		this.systemStaffID = systemStaffID;
		this.systemStrategyInfo = systemStrategyInfo;
	}

	public String getSystemStrategyInfo() {
		return this.systemStrategyInfo;
	}

	public String getSystemStaffID() {
		return this.systemStaffID;
	}
}
