package blservice.usermanagement_blservice;

import VO.resultMessage;
import VO.userVO;

public interface usermanagement_blservice {

	public resultMessage addUserManagement(userVO user);
	public userVO getUser(String user_id);
	public resultMessage modifyUserManagement(userVO user);
    

}
