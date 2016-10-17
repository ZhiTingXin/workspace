package data.systemstrategy_data;

import java.util.ArrayList;

import PO.resultMessage;
import PO.systemStrategyPO;
import dataservice.systemstrategy_dataservice.systemStrategy_dataService;

public class systemStrategyList implements systemStrategy_dataService{
	ArrayList<PO.systemStrategyPO> systemStrategyList;

	@Override
	public resultMessage add_systemStrategy(systemStrategyPO systemStrategyA) {
		// TODO Auto-generated method stub
		this.systemStrategyList.add(systemStrategyA);
		return resultMessage.SUCCESSED;
	}

	@Override
	public resultMessage delete_systemStrategy(systemStrategyPO systemStrategyA) {
		// TODO Auto-generated method stub
		this.systemStrategyList.add(systemStrategyA);
		this.systemStrategyList.remove(0);
		return resultMessage.SUCCESSED;
	}

	@Override
	public systemStrategyPO find_systemStrategy(String systemStaffID) {
		// TODO Auto-generated method stub
		this.systemStrategyList.add(new systemStrategyPO("abc","3000000"));
		return this.systemStrategyList.get(0);
	}

	@Override
	public resultMessage modify_systemStrategy(systemStrategyPO systemStrategyA) {
		// TODO Auto-generated method stub
		this.systemStrategyList.add(new systemStrategyPO("abc","3000000"));
		this.systemStrategyList.get(0);
		return resultMessage.SUCCESSED;
	}
}
