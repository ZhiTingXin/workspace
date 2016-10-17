package PO;

import java.io.Serializable;

public class roomPO implements Serializable {
	String roomType;
	int roomNumber;
	String roomState;

	public String getRoomType() {
		return roomType;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public String getRoomState() {
		return roomState;
	}

}
