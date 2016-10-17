package data.advicefeedback_data;

import java.util.ArrayList;

import PO.advicePO;
import PO.resultMessage;
import dataservice.advicefeedback_dataservice.adviceFeedBack_dataService;

public class adviceList implements adviceFeedBack_dataService {
	ArrayList<PO.advicePO> adviceList;

	@Override
	public resultMessage add_advice(advicePO advice1) {
		// TODO Auto-generated method stub
		advicePO A=new advicePO("abc","1000000","2000000","ABC");
		this.adviceList.add(A);
		return resultMessage.SUCCESSED;
	}

	@Override
	public advicePO find_advice(advicePO advice1) {
		// TODO Auto-generated method stub
		advicePO A=new advicePO("abc","1000000","2000000","ABC");
		return A;
	}

	@Override
	public ArrayList<advicePO> show_advice() {
		// TODO Auto-generated method stub
		return this.adviceList;
	}

	@Override
	public resultMessage modify_advice(advicePO advice1) {
		// TODO Auto-generated method stub
		return resultMessage.SUCCESSED;
	}
}
