package bl.userinfo_bl;

import VO.resultMessage;
import VO.userVO;
import blservice.userinfo_blservice.userinfo_blservice;

public class userinfo_bl implements userinfo_blservice {

	@Override
	public resultMessage modifyUserinfo(userVO userinfo) {
		if(userinfo.getUserID()=="001")
		return resultMessage.FAILED;
	return resultMessage.SUCCESSED;
	}

}
