package blservice.advicefeedback_blservice;

import java.util.ArrayList;

import VO.adviceVO;
import VO.resultMessage;

public interface advicefeedback_blservice {
  
	public resultMessage add_advice(adviceVO advice1);
	public adviceVO find_advice(adviceVO advice1);
	public ArrayList<adviceVO> show_advice();
	public resultMessage modify_advice(adviceVO advice1);
}
