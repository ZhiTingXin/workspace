package dataservice.systemstrategy_dataservice;

import VO.resultMessage;
import VO.systemStrategyVO;

public interface systemStrategy_dataService {
	public resultMessage add_systemStrategy(systemStrategyVO systemStrategyA);
	public resultMessage delete_systemStrategy(systemStrategyVO systemStrategyA);
	public systemStrategyVO find_systemStrategy(String systemStaffID);
	public resultMessage modify_systemStrategy(systemStrategyVO systemStrategyA);
}
