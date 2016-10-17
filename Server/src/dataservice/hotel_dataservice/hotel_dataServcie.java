package dataservice.hotel_dataservice;

import java.util.ArrayList;

import PO.hotelPO;
import PO.hotelStrategyPO;
import PO.resultMessage;
import PO.roomPO;

public interface hotel_dataServcie {
	public resultMessage add_hotel(hotelPO hotelA);
	public resultMessage delete_hotel(String hotelID);
	public resultMessage modify_hotel(hotelPO hotelA);
	public hotelPO find_hotel(String hotelID);
	public ArrayList<hotelPO> show_hotel(String hotelName);
	//public resultMessage add_hotelStrategy(String hotelID,hotelStrategyPO hotelStratrgy);
	//public resultMessage delete_hotelStrategy(String hotelID,hotelStrategyPO hotelStrategy);
	//public resultMessage modify_hotelStrategy(String hotelID,hotelStrategyPO hotelStrategy);
	//public hotelStrategyPO find_hotelStrategy(String hotelID,hotelStrategypo hoetl Strategy);
	public resultMessage add_room(String hotelID,roomPO roomA);
	public resultMessage modify_room(String hotelID,roomPO roomA);
	public resultMessage delete_room(String hotelID,roomPO roomA);
}
