package data.userinfo_data;

import java.util.ArrayList;

import PO.orderPO;
import PO.resultMessage;
import PO.userPO;
import dataservice.userInfo_dataservcie.userInfo_dataService;


public class userInfoList implements userInfo_dataService{
	ArrayList<PO.userPO> userList;

	@Override
	public resultMessage add_UserInfo(PO.userPO userA) {
		// TODO Auto-generated method stub
		this.userList.add(userA);
		return resultMessage.SUCCESSED;
	}

	@Override
	public PO.userPO find_UserInfoList(String userID) {
		// TODO Auto-generated method stub
		this.userList.add(new userPO("a","4000000","asdfgh",PO.userType.SYSTEMANAGER,PO.userState.OFFLINE));
		return this.userList.get(0);
	}

	@Override
	public resultMessage modify_UserInfoList(PO.userPO userA) {
		// TODO Auto-generated method stub
		return resultMessage.SUCCESSED;
	}

	@Override
	public resultMessage delete_UserInfoList(String userID) {
		// TODO Auto-generated method stub
		this.userList.add(new userPO("a","4000000","asdfgh",PO.userType.SYSTEMANAGER,PO.userState.OFFLINE));
		this.userList.remove(0);
		return resultMessage.SUCCESSED;
	}

	@Override
	public ArrayList<orderPO> getHistory_UserInfoList(String userID) {
		// TODO Auto-generated method stub
		this.userList.add(new userPO("a","4000000","asdfgh",PO.userType.SYSTEMANAGER,PO.userState.OFFLINE));
		return this.userList.get(0).orderList();
	}
}
