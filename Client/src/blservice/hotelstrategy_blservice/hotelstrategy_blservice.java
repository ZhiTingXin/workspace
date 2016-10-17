package blservice.hotelstrategy_blservice;

import java.util.ArrayList;

import VO.hotelStrategyVO;
import VO.resultMessage;

public interface hotelstrategy_blservice {

	public resultMessage makeHotelStrategy(hotelStrategyVO hotelstrategy);
	public resultMessage modifyHotelstrategy(hotelStrategyVO hotelstrategy);
	public resultMessage deleteHotelstrategy(hotelStrategyVO hotelstrategy);
	public resultMessage saveHotelStrategy(hotelStrategyVO hotelstrategy);
	public hotelStrategyVO getHotelStrategy(String Hotelstrategy_name);
	public ArrayList<hotelStrategyVO> getList(String hotel_id);

}
