package blservice.order_blservice;

import java.util.ArrayList;
import VO.orderState;
import VO.orderVO;
import VO.resultMessage;

public interface order_blservice {
	public orderState getState(String order_id);
	public orderState getOrder(String order_id);
	public ArrayList<orderVO> getOrdersOfUsers(String user_id);
	public orderVO createOrder(orderVO order_info);
	public resultMessage saveOrd(orderVO order_info);
	public resultMessage changeState(orderVO order_info);
	
}
