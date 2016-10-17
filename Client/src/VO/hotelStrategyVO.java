package VO;



public class hotelStrategyVO {
	String hotelStrategyInfo;
	String hotelStaffID;
	String hotelID;

	public hotelStrategyVO(String hotelStrategyInfo, String hotelStaffID,
			String hotelID) {
		this.hotelStaffID = hotelStaffID;
		this.hotelStrategyInfo = hotelStrategyInfo;
		this.hotelID = hotelID;
	}

	public String gethotelStrategyInfo() {
		return this.hotelStrategyInfo;
	}

	public String gethotelStaffID() {
		return this.hotelStaffID;
	}

	public String getHotelID() {
		return this.hotelID;
	}
}
