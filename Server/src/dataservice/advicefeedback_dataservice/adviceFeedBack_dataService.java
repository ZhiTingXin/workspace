package dataservice.advicefeedback_dataservice;

import java.util.ArrayList;

import PO.advicePO;
import PO.resultMessage;

public interface adviceFeedBack_dataService {
	public resultMessage add_advice(advicePO advice1);
	public advicePO find_advice(advicePO advice1);
	public ArrayList<advicePO> show_advice();
	public resultMessage modify_advice(advicePO advice1);
}
