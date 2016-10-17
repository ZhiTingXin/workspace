package PO;

import java.io.Serializable;
import java.util.ArrayList;

public class userPO implements Serializable {
	String userName;
	String userID;
	String userPassword;
	String userRegisterTime;
	PO.userType userType;
	PO.userState userState;
	
	// 客户
	PO.userMemberState userMemberState;
	int userCredit;
	ArrayList<advicePO> adviceList;
	ArrayList<systemStrategyPO> systemStrategyList;
	ArrayList<orderPO> orderList;
	
	// 酒店工作人员
	String hotelID;
	
	// 网站营销人员
	String businessDistrict;
	ArrayList<advicePO> replyList;

	public userPO(String userName1, String userID1, String userPassword1,
			PO.userType userType1, PO.userState userState1, int userCredit1,
			PO.userMemberState userMemberState1, ArrayList<advicePO> adviceList1) {
		userName = userName1;
		userPassword = userPassword1;
		userID = userID1;
		userType = userType1;
		userState = userState1;
		userCredit = userCredit1;
		this.userMemberState=userMemberState1;
		this.adviceList = adviceList1;
	}
	
	public userPO(String userName1, String userID1, String userPassword1,
			PO.userType userType1, PO.userState userState1,String hotelID){
		this.userName=userName1;
		this.userID=userID1;
		this.userPassword=userPassword1;
		this.userType=userType1;
		this.userState=userState1;
		this.hotelID=hotelID;
	}
	
	public userPO(String userName1, String userID1, String userPassword1,
			PO.userType userType1,PO.userState userState1,ArrayList<advicePO> replyList1){
		this.userName=userName1;
		this.userID=userID1;
		this.userPassword=userPassword1;
		this.userType=userType1;
		this.userState=userState1;
		this.replyList=replyList1;
	}
	
	public userPO(String userName1, String userID1, String userPassword1,
			PO.userType userType1,PO.userState userState1){
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
	public PO.userState getUserState(){
		return this.userState;
	}
	public String getUserRegisterTime(){
		return this.userRegisterTime;
	}
	public PO.userType getUserType(){
		return this.userType;
	}
	public PO.userMemberState getMemberState(){
		return this.userMemberState;
	}
	public int getUserCredit(){
		return this.userCredit;
	}
	public ArrayList<advicePO> getAdviceList(){
		return this.adviceList;
	}
	public ArrayList<systemStrategyPO> getSystemStrategyList(){
		return this.systemStrategyList;
	}
	public ArrayList<orderPO> orderList(){
		return this.orderList;
	}
	
	public String gethotelID(){
		return this.hotelID;
	}
	public String getbusinessDistrict(){
		return this.businessDistrict;
	}
	public ArrayList<advicePO> replyList(){
		return this.replyList;
	}
}
