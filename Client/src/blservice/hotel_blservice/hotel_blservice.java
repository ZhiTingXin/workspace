package blservice.hotel_blservice;

import java.util.ArrayList;

import VO.hotelVO;
import VO.resultMessage;

public interface hotel_blservice {
    
	public hotelVO getHotel(String hotel_name);
	public resultMessage modifyHotel(hotelVO hotel);
	public resultMessage saveHotel(hotelVO hotel);
	public hotelVO addHotel(hotelVO hotel);
	public resultMessage deleteHotel(hotelVO hotel);
	public ArrayList<hotelVO> showHotel();

}
