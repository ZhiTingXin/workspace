package bl.hotel_bl;

import java.util.ArrayList;


import VO.hotelVO;
import VO.resultMessage;
import blservice.hotel_blservice.hotel_blservice;

public class hotel_bl implements  hotel_blservice{
	ArrayList<hotelVO> hotelList = new ArrayList<hotelVO>();
	@Override
	public hotelVO getHotel(String hotel_name) {
		hotelVO hotel = new hotelVO(null, "123", "dasbd", "dasdjhau", null, null);
		hotel.getHotelName();
		return hotel;
	}

	@Override
	public resultMessage modifyHotel(hotelVO hotel) {
		hotel.getHotelName();
		return resultMessage.SUCCESSED;
	}

	@Override
	public resultMessage saveHotel(hotelVO hotel) {
		hotelList.add(hotel);
		return resultMessage.SUCCESSED;
	}

	@Override
	public hotelVO addHotel(hotelVO hotel) {
		hotelList.add(hotel);
		
		return hotel;
	}

	@Override
	public resultMessage deleteHotel(hotelVO hotel) {
		if(hotelList.contains(hotel)){
			hotelList.remove(hotel);
			return resultMessage.SUCCESSED;
		}else{
		return resultMessage.FAILED;
		}
	}

	@Override
	public ArrayList<hotelVO> showHotel() {
		return hotelList;
	}

}
