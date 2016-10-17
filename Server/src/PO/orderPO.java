package PO;

import java.io.Serializable;
import java.util.Date;

public class orderPO implements Serializable {
	
   Date orderDate;
   String userID;
   int orderPrice;
   orderState orderState;
   String orderID;
   hotelPO orderHotel;
   String roomNumber;
   String roomType;
   String orderAssessment;  
   public orderPO(Date date,String userid,PO.orderState orderstate,
		   int orderprice,String orderid,hotelPO orderhotel,
		   String roomnumber,String roomtype){
	   
	   orderDate=date;
	   userID=userid;
	   orderPrice=orderprice;
	   orderState=orderstate;
	   orderID=orderid;
	   orderHotel=orderhotel;
	   roomNumber=roomnumber;
	   roomType=roomtype;
   }
   
   public Date getOrderDate(){
	   return orderDate;
   }
   
   public String getUserID(){
	   return userID;
   }
   
   public int getOrderprice(){
	   return orderPrice;
   }
   
   public PO.orderState getOrderState(){
	   return orderState;
   }
   
   public String getOrderID(){
	   return orderID;
   }
   
   public hotelPO getOrderHotel(){
	   return orderHotel;
   }
   
   public String getRoomNumber(){
	   return roomNumber;
   }
   
  public  String getRoomType(){
	  return roomType;
  }
  public String getOrderAssessment(){
	  return orderAssessment;
  }
}
