package pom;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	public LoginPage() {
PageFactory.initElements(driver, this);	}
public WebElement getTxtusername() {
		return txtusername;
	}
	public void setTxtusername(WebElement txtusername) {
		this.txtusername = txtusername;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public void setTxtPassword(WebElement txtPassword) {
		this.txtPassword = txtPassword;
	}
	public WebElement getLocation() {
		return Location;
	}
	public void setLocation(WebElement location) {
		Location = location;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}
@FindBy(id="username")
private WebElement txtusername;
@FindBy(id="password")
private WebElement txtPassword;
@FindBy(id="Inpatient Ward")
private WebElement Location;
@FindBy(id="loginButton")
private WebElement btnLogin;
@FindBy(xpath="//li[contains(@class,\"logout\")]")
private WebElement btnLogout;
public WebElement getBtnLogout() {
	return btnLogout;
}
public void setBtnLogout(WebElement btnLogout) {
	this.btnLogout = btnLogout;
}
}
