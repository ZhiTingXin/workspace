package data.order_data;

import java.util.ArrayList;

import PO.orderPO;
import PO.resultMessage;
import dataservice.order_dataservice.order_dataService;

public class orderList implements order_dataService{
	ArrayList<PO.orderPO> orderList;

	@Override
	public resultMessage add_order(orderPO orderA) {
		// TODO Auto-generated method stub
		this.orderList.add(orderA);
		return resultMessage.SUCCESSED;
	}

	@Override
	public resultMessage modify_order(orderPO orderA) {
		// TODO Auto-generated method stub
		return resultMessage.SUCCESSED;
	}

	@Override
	public ArrayList<orderPO> find_order(String userId) {
		// TODO Auto-generated method stub
		return new orderList().orderList;
	}

	@Override
	public resultMessage add_exceptionOrder(orderPO orderA) {
		// TODO Auto-generated method stub
		this.orderList.add(orderA);
		return resultMessage.SUCCESSED;
	}

	@Override
	public resultMessage add_excutedOrder(orderPO orderA) {
		// TODO Auto-generated method stub
		this.orderList.add(orderA);
		return resultMessage.SUCCESSED;
	}

	@Override
	public resultMessage add_revocationOrder(orderPO orderA) {
		// TODO Auto-generated method stub
		this.orderList.add(orderA);
		return resultMessage.SUCCESSED;
	}

	@Override
	public ArrayList<orderPO> find_exceptionOrder(ArrayList<orderPO> orderList) {
		// TODO Auto-generated method stub
		return this.orderList;
	}

	@Override
	public ArrayList<orderPO> find_excutedOrder(ArrayList<orderPO> orderList) {
		// TODO Auto-generated method stub
		return this.orderList;
	}

	@Override
	public ArrayList<orderPO> find_revocationOrder(ArrayList<orderPO> orderList) {
		// TODO Auto-generated method stub
		return this.orderList;
	}

	@Override
	public resultMessage create_orderListBill(orderPO orderA) {
		// TODO Auto-generated method stub
		return resultMessage.SUCCESSED;
	}
}
