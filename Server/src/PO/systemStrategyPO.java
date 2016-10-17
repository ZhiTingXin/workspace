package PO;

import java.io.Serializable;

public class systemStrategyPO implements Serializable {
	String systemStrategyInfo;
	String systemStaffID;

	public systemStrategyPO(String systemStrategyInfo, String systemStaffID) {
		this.systemStaffID=systemStaffID;
		this.systemStrategyInfo=systemStrategyInfo;
	}
	
	public String getSystemStrategyInfo(){
		return this.systemStrategyInfo;
	}
	public String getSystemStaffID(){
		return this.systemStaffID;
	}
}
