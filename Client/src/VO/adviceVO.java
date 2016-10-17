package VO;



public class adviceVO  {
	String adviceinfo;
	String senderID;
	String replyerID;
	String replyment;

	public adviceVO(String adviceinfo, String senderID, String replyerID,
			String replyment) {
		this.adviceinfo=adviceinfo;
		this.replyerID=replyerID;
		this.replyment=replyment;
		this.senderID=senderID;
	}
	public String getAdviceInfo(){
		return this.adviceinfo;
	}
	public String getSenderId(){
		return this.senderID;
	}
	public String getReplyerID(){
		return this.replyerID;
	}
	public String  getReplyment(){
		return this.replyment;
	}
}
