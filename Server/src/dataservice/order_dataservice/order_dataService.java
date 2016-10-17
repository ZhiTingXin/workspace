package dataservice.order_dataservice;

import java.util.ArrayList;

import PO.orderPO;
import PO.resultMessage;

public interface order_dataService {
	public resultMessage add_order(orderPO orderA);
	public resultMessage modify_order(orderPO orderA);
	public ArrayList<orderPO> find_order(String userId);
	public resultMessage add_exceptionOrder(orderPO orderA);
	public resultMessage add_excutedOrder(orderPO orderA);
	public resultMessage add_revocationOrder(orderPO orderA);
	public ArrayList<orderPO> find_exceptionOrder(ArrayList<orderPO> orderList);
	public ArrayList<orderPO> find_excutedOrder(ArrayList<orderPO> orderList);
	public ArrayList<orderPO> find_revocationOrder(ArrayList<orderPO> orderList);
	public resultMessage create_orderListBill(orderPO orderA);
	
}
