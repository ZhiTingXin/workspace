package data.hotel_data;

import java.util.ArrayList;

import PO.hotelPO;
import PO.resultMessage;
import PO.roomPO;
import dataservice.hotel_dataservice.hotel_dataServcie;

public class hotelList implements hotel_dataServcie {
	ArrayList<PO.hotelPO> hotelList;

	@Override
	public resultMessage add_hotel(hotelPO hotelA) {
		// TODO Auto-generated method stub
		this.hotelList.add(hotelA);
		return resultMessage.SUCCESSED;
	}

	@Override
	public resultMessage delete_hotel(String hotelID) {
		// TODO Auto-generated method stub
		hotelPO hotelA=new hotelPO();
		this.hotelList.add(hotelA);
		this.hotelList.remove(hotelA);
		return resultMessage.SUCCESSED;
	}

	@Override
	public resultMessage modify_hotel(hotelPO hotelA) {
		// TODO Auto-generated method stub
		hotelA.getHotelID();
		return resultMessage.SUCCESSED;
	}

	@Override
	public hotelPO find_hotel(String hotelID) {
		// TODO Auto-generated method stub
		hotelPO hotelA=new hotelPO();
		this.hotelList.add(hotelA);
		return this.hotelList.get(0);
	}

	@Override
	public ArrayList<hotelPO> show_hotel(String hotelName) {
		// TODO Auto-generated method stub
		return this.hotelList;
	}

	@Override
	public resultMessage add_room(String hotelID, roomPO roomA) {
		// TODO Auto-generated method stub
		hotelPO hotelA=new hotelPO();
		this.hotelList.add(hotelA);
		this.hotelList.get(0).getRooms();
		return resultMessage.SUCCESSED;
	}

	@Override
	public resultMessage modify_room(String hotelID, roomPO roomA) {
		// TODO Auto-generated method stub
		hotelPO hotelA=new hotelPO();
		this.hotelList.add(hotelA);
		this.hotelList.get(0).getRooms();
		return resultMessage.SUCCESSED;
	}

	@Override
	public resultMessage delete_room(String hotelID, roomPO roomA) {
		// TODO Auto-generated method stub
		hotelPO hotelA=new hotelPO();
		this.hotelList.add(hotelA);
		this.hotelList.get(0).getRooms();
		return resultMessage.SUCCESSED;
	}
}
