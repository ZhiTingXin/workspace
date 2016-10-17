package dataservice.hotel_dataservice;

import java.util.ArrayList;

import VO.hotelVO;
import VO.resultMessage;
import VO.roomVO;

public interface hotel_dataServcie {
	public resultMessage add_hotel(hotelVO hotelA);
	public resultMessage delete_hotel(String hotelID);
	public resultMessage modify_hotel(hotelVO hotelA);
	public hotelVO find_hotel(String hotelID);
	public ArrayList<hotelVO> show_hotel(String hotelName);
	//public resultMessage add_hotelStrategy(String hotelID,hotelStrategyVO hotelStratrgy);
	//public resultMessage delete_hotelStrategy(String hotelID,hotelStrategyVO hotelStrategy);
	//public resultMessage modify_hotelStrategy(String hotelID,hotelStrategyVO hotelStrategy);
	//public hotelStrategyVO find_hotelStrategy(String hotelID,hotelStrategyVO hoetl Strategy);
	public resultMessage add_room(String hotelID,roomVO roomA);
	public resultMessage modify_room(String hotelID,roomVO roomA);
	public resultMessage delete_room(String hotelID,roomVO roomA);
}
