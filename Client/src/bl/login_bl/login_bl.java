package bl.login_bl;

import java.util.ArrayList;

import VO.adviceVO;
import VO.orderVO;
import VO.systemStrategyVO;
import VO.userVO;
import blservice.login_blsevice.login_blsevice;

public class login_bl implements login_blsevice {

	
	String userName;
	String userID;
	String userPassword;
	String userRegisterTime;
	VO.userType userType;
	VO.userState userState;
	VO.userMemberState userMemberState;
	int userCredit;
	ArrayList<adviceVO> adviceList;
	ArrayList<systemStrategyVO> systemStrategyList;
	ArrayList<orderVO> orderList;
	String hotelID;
	String businessDistrict;
	
	ArrayList<adviceVO> replyList;
	public login_bl(String userName1, String userID1, String userPassword1,
			VO.userType userType1, VO.userState userState1, int userCredit1,
			VO.userMemberState userMemberState1, ArrayList<adviceVO> adviceList1) {
		userName = userName1;
		userPassword = userPassword1;
		userID = userID1;
		userType = userType1;
		userState = userState1;
		userCredit = userCredit1;
		this.userMemberState=userMemberState1;
		this.adviceList = adviceList1;
	}
	
	@Override
	public userVO login(String user_id, String user_password) {
		
		return new userVO(userName, userID, user_password, userType, userState);
		
	}

	
}
