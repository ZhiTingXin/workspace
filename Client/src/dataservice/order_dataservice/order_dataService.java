package dataservice.order_dataservice;

import java.util.ArrayList;

import VO.orderVO;
import VO.resultMessage;

public interface order_dataService {
	public resultMessage add_order(orderVO orderA);
	public resultMessage modify_order(orderVO orderA);
	public ArrayList<orderVO> find_order(String userId);
	public resultMessage add_exceptionOrder(orderVO orderA);
	public resultMessage add_excutedOrder(orderVO orderA);
	public resultMessage add_revocationOrder(orderVO orderA);
	public ArrayList<orderVO> find_exceptionOrder(ArrayList<orderVO> orderList);
	public ArrayList<orderVO> find_excutedOrder(ArrayList<orderVO> orderList);
	public ArrayList<orderVO> find_revocationOrder(ArrayList<orderVO> orderList);
	public resultMessage create_orderListBill(orderVO orderA);
	
}
