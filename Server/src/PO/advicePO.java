package PO;

import java.io.Serializable;

public class advicePO implements Serializable {
	String adviceinfo;
	String senderID;
	String replyerID;
	String replyment;

	public advicePO(String adviceinfo, String senderID, String replyerID,
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
