package dataservice.systemstrategy_dataservice;

import PO.resultMessage;
import PO.systemStrategyPO;

public interface systemStrategy_dataService {
	public resultMessage add_systemStrategy(systemStrategyPO systemStrategyA);
	public resultMessage delete_systemStrategy(systemStrategyPO systemStrategyA);
	public systemStrategyPO find_systemStrategy(String systemStaffID);
	public resultMessage modify_systemStrategy(systemStrategyPO systemStrategyA);
}
