package PO;

import java.io.Serializable;
import java.util.ArrayList;

public class hotelPO implements Serializable  {

	ArrayList<orderPO> orders;
	String hotelID;
	String hotelName;
	String hotelDistrict;
	ArrayList<roomPO> hotelRoom;
	ArrayList<hotelStrategyPO> hotelStrategy;
	
	public ArrayList<orderPO> getOrders(){
		return orders;
	}
	
	public String getHotelID(){
		return hotelID;
	}
	
	public String getHotelName(){
		return hotelName;
	}
	
	public String getHotelDistrict(){
		return hotelDistrict;
	}
	
	public ArrayList<roomPO> getRooms(){
		return hotelRoom;
	}
	
	public ArrayList<hotelStrategyPO> getHotelStrategy(){
		return hotelStrategy;
	}
}
