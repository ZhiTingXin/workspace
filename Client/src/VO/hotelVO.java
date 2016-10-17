package VO;


import java.util.ArrayList;

public class hotelVO  {

	ArrayList<orderVO> orders;
	String hotelID;
	String hotelName;
	String hotelDistrict;
	ArrayList<roomVO> hotelRoom;
	ArrayList<hotelStrategyVO> hotelStrategy;
	
	public hotelVO(ArrayList<orderVO> order1,String hotelID1,String hotelName1,
			String hotelDistrict1,ArrayList<roomVO> hotelroom,ArrayList<hotelStrategyVO> strategy){
		orders=order1;
		hotelID=hotelID1;
		hotelName=hotelName1;
		hotelDistrict=hotelDistrict1;
		hotelRoom=hotelroom;
		hotelStrategy=strategy;
	}
	
	public ArrayList<orderVO> getOrders(){
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
	
	public ArrayList<roomVO> getRooms(){
		return hotelRoom;
	}
	
	public ArrayList<hotelStrategyVO> getHotelStrategy(){
		return hotelStrategy;
	}
}
