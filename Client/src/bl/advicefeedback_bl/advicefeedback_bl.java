package bl.advicefeedback_bl;

import java.util.ArrayList;

import VO.adviceVO;
import VO.resultMessage;
import blservice.advicefeedback_blservice.advicefeedback_blservice;

public class advicefeedback_bl implements advicefeedback_blservice {
    
	ArrayList<adviceVO> advice;
	@Override
	public resultMessage add_advice(adviceVO advice1) {
		this.advice.add(advice1);
		return resultMessage.SUCCESSED;
	}

	@Override
	public adviceVO find_advice(adviceVO advice1) {
		if(this.advice.contains(advice1)){
		return advice1;
		}else{
			return null;
		}
	}

	@Override
	public ArrayList<adviceVO> show_advice() {
		return advice;
	}

	@Override
	public resultMessage modify_advice(adviceVO advice1) {
	    advice.add(advice1);
	    advice1.getAdviceInfo();
		return resultMessage.SUCCESSED;
	}

}
