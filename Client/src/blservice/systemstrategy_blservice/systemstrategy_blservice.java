package blservice.systemstrategy_blservice;


import java.util.ArrayList;

import VO.resultMessage;
import VO.systemStrategyVO;

public interface systemstrategy_blservice {
	
	public systemStrategyVO makeSystemStrategy(systemStrategyVO systemstrategy);
	public systemStrategyVO getsystemstrategy(String systemstrategy_name);
	public resultMessage saveSystemStrategy(systemStrategyVO systemstrategy);
	public resultMessage modifySystemStrategy(systemStrategyVO systemstrategy);
	public resultMessage deleteSystemStrategy(systemStrategyVO systemstrategy);
	public ArrayList<systemStrategyVO> showSystemStrategy();

}
