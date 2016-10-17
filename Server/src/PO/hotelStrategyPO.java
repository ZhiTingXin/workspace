package PO;

import java.io.Serializable;

public class hotelStrategyPO implements Serializable  {
	String hotelStrategyInfo;
	String hotelStaffID;
	String hotelID;
	public hotelStrategyPO(String hotelStrategyInfo, String hotelStaffID,String hotelID) {
		this.hotelStaffID=hotelStaffID;
		this.hotelStrategyInfo=hotelStrategyInfo;
		this.hotelID=hotelID;
	}
	
	public String gethotelStrategyInfo(){
		return this.hotelStrategyInfo;
	}
	public String gethotelStaffID(){
		return this.hotelStaffID;
	}
	public String getHotelID(){
		return this.hotelID;
	}
}
