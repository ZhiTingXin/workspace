package bl.usersmanagement_bl;

import VO.resultMessage;
import VO.userVO;
import blservice.usermanagement_blservice.usermanagement_blservice;

public class usersmanagement_bl implements usermanagement_blservice{

	@Override
	public resultMessage addUserManagement(userVO user) {
		if(user.getUserID()=="001")
		return resultMessage.SUCCESSED;
	return resultMessage.FAILED;
	}

	@Override
	public userVO getUser(String user_id) {
		if(user_id =="001")
			return new userVO(user_id, null, null, null, null);
		return new userVO(null, null, null, null, null);
	}

	@Override
	public resultMessage modifyUserManagement(userVO user) {
		if(user.getUserID()=="001")
			return resultMessage.SUCCESSED;
		return resultMessage.FAILED;
	}

}
