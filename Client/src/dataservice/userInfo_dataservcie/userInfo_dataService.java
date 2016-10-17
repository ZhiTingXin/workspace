package dataservice.userInfo_dataservcie;

import java.util.ArrayList;

import VO.resultMessage;
import VO.userVO;

public interface userInfo_dataService {
	public resultMessage add_UserInfo(VO.userVO userA);
	public userVO find_UserInfoList(String userID);
	public resultMessage modify_UserInfoList(VO.userVO userA);
	public resultMessage delete_UserInfoList(String userID);
	public ArrayList<VO.orderVO> getHistory_UserInfoList (String userID);
}
