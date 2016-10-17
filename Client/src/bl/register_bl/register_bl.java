package bl.register_bl;

import VO.resultMessage;
import blservice.register_blservice.register_blservice;

public class register_bl implements register_blservice {

	@Override
	public resultMessage addRegister(String userID, String userpassword) {
		if (userID == "001" && userpassword == "123456780qA")
			return resultMessage.SUCCESSED;
		return resultMessage.FAILED;
	}

}
