package bl.hotelstrategy_bl;

import java.util.ArrayList;

import VO.hotelStrategyVO;
import VO.hotelVO;
import VO.orderVO;
import VO.resultMessage;
import VO.roomVO;
import blservice.hotelstrategy_blservice.hotelstrategy_blservice;

public class hotelstrategy_bl implements hotelstrategy_blservice{
    ArrayList<hotelStrategyVO> strategyList = new ArrayList<hotelStrategyVO>();
    hotelVO hotel = new hotelVO(null, "123", "dasbd", "dasdjhau", null, null);
    ArrayList<orderVO> orders;
	String hotelID;
	String hotelName;
	String hotelDistrict;
	ArrayList<roomVO> hotelRoom;
	ArrayList<hotelStrategyVO> hotelStrategy;
	
	public hotelstrategy_bl (ArrayList<orderVO> order1,String hotelID1,String hotelName1,
			String hotelDistrict1,ArrayList<roomVO> hotelroom,ArrayList<hotelStrategyVO> strategy){
		orders=order1;
		hotelID=hotelID1;
		hotelName=hotelName1;
		hotelDistrict=hotelDistrict1;
		hotelRoom=hotelroom;
		hotelStrategy=strategy;
	}
	
	String hotelStrategyInfo;
	String hotelStaffID;
	String hotelID_1;

	public hotelstrategy_bl(String hotelStrategyInfo, String hotelStaffID,
			String hotelID) {
		this.hotelStaffID = hotelStaffID;
		this.hotelStrategyInfo = hotelStrategyInfo;
		this.hotelID_1 = hotelID;
	}
	
	@Override
	public resultMessage makeHotelStrategy(hotelStrategyVO hotelstrategy) {
		strategyList.add(hotelstrategy);
		return resultMessage.SUCCESSED;
	}

	@Override
	public resultMessage modifyHotelstrategy(hotelStrategyVO hotelstrategy) {
		hotelstrategy.getHotelID();
		return resultMessage.SUCCESSED;
	}

	@Override
	public resultMessage deleteHotelstrategy(hotelStrategyVO hotelstrategy) {
		strategyList.remove(hotelstrategy);
		return resultMessage.SUCCESSED;
	}

	@Override
	public resultMessage saveHotelStrategy(hotelStrategyVO hotelstrategy) {
		strategyList.add(hotelstrategy);
		return resultMessage.SUCCESSED;
	}

	@Override
	public hotelStrategyVO getHotelStrategy(String Hotelstrategy_name) {
		
		return new hotelStrategyVO(hotelStrategyInfo, hotelStaffID, hotelID_1);
	}

	@Override
	public ArrayList<hotelStrategyVO> getList(String hotel_id) {
		
		return strategyList;
	}

}
