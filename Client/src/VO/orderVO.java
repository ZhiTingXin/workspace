package VO;


import java.util.Date;

public class orderVO {
	
   Date orderDate;
   String userID;
   int orderPrice;
   orderState orderState;
   String orderID;
   hotelVO orderHotel;
   String roomNumber;
   String roomType;
   String orderAssessment;  
   public orderVO(Date date,String userid,VO.orderState orderstate,
		   int orderprice,String orderid,hotelVO orderhotel,
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
   
   public VO.orderState getOrderState(){
	   return orderState;
   }
   
   public String getOrderID(){
	   return orderID;
   }
   
   public hotelVO getOrderHotel(){
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
