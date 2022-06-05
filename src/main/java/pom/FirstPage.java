package pom;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage extends BaseClass{
	public FirstPage() {
		PageFactory.initElements(driver,this);	}

	public WebElement getBtnRegPatient() {
		return btnRegPatient;
	}
	public void setBtnRegPatient(WebElement btnRegPatient) {
		this.btnRegPatient = btnRegPatient;
	}
	@FindBy(xpath="//i[@class=\"icon-user\"]")
	private WebElement btnRegPatient;

}
