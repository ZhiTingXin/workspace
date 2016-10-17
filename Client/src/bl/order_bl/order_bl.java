package bl.order_bl;

import java.util.ArrayList;
import java.util.Date;

import VO.hotelVO;
import VO.orderState;
import VO.orderVO;
import VO.resultMessage;
import blservice.order_blservice.order_blservice;

public class order_bl implements order_blservice {

	ArrayList<orderVO> userId;
	Date orderDate;
	String userID;
	int orderPrice;
	orderState orderState1;
	String orderID;
	hotelVO orderHotel;
	String roomNumber;
	String roomType;
	String orderAssessment;

	public order_bl(Date date, String userid, VO.orderState orderstate, int orderprice, String orderid,
			hotelVO orderhotel, String roomnumber, String roomtype) {
		orderDate = date;
		userID = userid;
		orderPrice = orderprice;
		orderState1 = orderstate;
		orderID = orderid;
		orderHotel = orderhotel;
		roomNumber = roomnumber;
		roomType = roomtype;
	}

	@Override
	public orderState getState(String order_id) {
		if (order_id == "0001")
			return orderState.UNDO;
		return orderState.REVOCATED;
	}

	@Override
	public orderState getOrder(String order_id) {
		if (order_id == "0001")
			return orderState.EXCEPTION;
		return orderState.REVOCATED;
	}

	@Override
	public ArrayList<orderVO> getOrdersOfUsers(String user_id) {

		return userId;
	}

	@Override
	public orderVO createOrder(orderVO order_info) {

		return new orderVO(orderDate, orderID, orderState1, orderPrice, orderID, orderHotel, roomNumber, roomType);
	}

	@Override
	public resultMessage saveOrd(orderVO order_info) {
		if (userID == "001")
			return resultMessage.FAILED;
		return resultMessage.SUCCESSED;
	}

	@Override
	public resultMessage changeState(orderVO order_info) {
		if (orderID == "001")
			return resultMessage.FAILED;
		return resultMessage.SUCCESSED;
	}

}
