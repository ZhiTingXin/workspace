package dataservice.advicefeedback_dataservice;

import java.util.ArrayList;

import VO.adviceVO;
import VO.resultMessage;

public interface adviceFeedBack_dataService {
	public resultMessage add_advice(adviceVO advice1);
	public adviceVO find_advice(adviceVO advice1);
	public ArrayList<adviceVO> show_advice();
	public resultMessage modify_advice(adviceVO advice1);
}
