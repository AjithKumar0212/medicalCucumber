package org.Base;

import pom.LoginPage;
import pom.RegPage;

public class projectManager {
	private projectManager() {
	}
private static projectManager manager;
private LoginPage loginPage;
private RegPage  regPage;
public static projectManager getManager() {
	if(manager==null) {
		manager=new projectManager();
	}
	return manager;
}
public LoginPage getLoginPage() {
	return loginPage==null? loginPage=new LoginPage():loginPage;
	}
public RegPage getRegPage() {
	
	return regPage==null? regPage=new RegPage():regPage;
}


}


