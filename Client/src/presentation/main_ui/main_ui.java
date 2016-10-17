package presentation.main_ui;

import javax.swing.JPanel;

import presentation.advicefeedback_ui.adviceFeedBack_ui;
import presentation.hotelmanagement_ui.hotelManagement_ui;
import presentation.hotelstrategy_ui.hotelStrategy_ui;
import presentation.hotelview_ui.hotelView_ui;
import presentation.login_ui.login_ui;
import presentation.orderformation_ui.orderFormation_ui;
import presentation.ordermanangement_ui.orderManagement_ui;
import presentation.register_ui.register_ui;
import presentation.systemstrategy_ui.systemStrategy_ui;
import presentation.userinfo_ui.userInfo_ui;
import presentation.usersmanagement_ui.a.usersManagement_ui;

public class main_ui {
	JPanel mainPanel;
	login_ui loginUI;
	register_ui registerUI;
	userInfo_ui userInfoUI;
	usersManagement_ui usersManagementUI;
	adviceFeedBack_ui adviceFeedBackUI;
	hotelView_ui hotelViewUI;
	hotelManagement_ui hotelManagementUI;
	hotelStrategy_ui hotelStrategyUI;
	orderFormation_ui orderFormationUI;
	orderManagement_ui orderManagementUI;
	systemStrategy_ui systemStrategyUI;

	public main_ui() {
		this.mainPanel=new JPanel();
	}
	
	public void getLoginUI(){
		this.loginUI=new login_ui();
	}
	
}
