package VO;


import java.util.ArrayList;

public class userVO {
	String userName;
	String userID;
	String userPassword;
	String userRegisterTime;
	VO.userType userType;
	VO.userState userState;
	
	// 客户
	VO.userMemberState userMemberState;
	int userCredit;
	ArrayList<adviceVO> adviceList;
	ArrayList<systemStrategyVO> systemStrategyList;
	ArrayList<orderVO> orderList;
	
	// 酒店工作人员
	String hotelID;
	
	// 网站营销人员
	String businessDistrict;
	ArrayList<adviceVO> replyList;

	public userVO(String userName1, String userID1, String userPassword1,
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
	
	public userVO(String userName1, String userID1, String userPassword1,
			VO.userType userType1, VO.userState userState1,String hotelID){
		this.userName=userName1;
		this.userID=userID1;
		this.userPassword=userPassword1;
		this.userType=userType1;
		this.userState=userState1;
		this.hotelID=hotelID;
	}
	
	public userVO(String userName1, String userID1, String userPassword1,
			VO.userType userType1,VO.userState userState1,ArrayList<adviceVO> replyList1){
		this.userName=userName1;
		this.userID=userID1;
		this.userPassword=userPassword1;
		this.userType=userType1;
		this.userState=userState1;
		this.replyList=replyList1;
	}
	
	public userVO(String userName1, String userID1, String userPassword1,
			VO.userType userType1,VO.userState userState1){
		this.userName=userName1;
		this.userID=userID1;
		this.userPassword=userPassword1;
		this.userType=userType1;
		this.userState=userState1;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserID(){
		return this.userID;
	}
	public String getUserPassword(){
		return this.userPassword;
	}
	public VO.userState getUserState(){
		return this.userState;
	}
	public String getUserRegisterTime(){
		return this.userRegisterTime;
	}
	public VO.userType getUserType(){
		return this.userType;
	}
	public VO.userMemberState getMemberState(){
		return this.userMemberState;
	}
	public int getUserCredit(){
		return this.userCredit;
	}
	public ArrayList<adviceVO> getAdviceList(){
		return this.adviceList;
	}
	public ArrayList<systemStrategyVO> getSystemStrategyList(){
		return this.systemStrategyList;
	}
	public ArrayList<orderVO> orderList(){
		return this.orderList;
	}
	
	public String gethotelID(){
		return this.hotelID;
	}
	public String getbusinessDistrict(){
		return this.businessDistrict;
	}
	public ArrayList<adviceVO> replyList(){
		return this.replyList;
	}
}
