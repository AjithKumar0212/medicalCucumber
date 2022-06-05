package pom;

import org.Base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegPage extends BaseClass{
	public RegPage() {
		PageFactory.initElements(driver,this);	}

	
	public WebElement getTxtGivenName() {
		return txtGivenName;
	}
	public WebElement getTxtFamilyName() {
		return txtFamilyName;
	}
	public WebElement getTxtMiddleName() {
		return txtMiddleName;
	}
	public WebElement getBtnRightButton() {
		return btnRightButton;
	}
	public WebElement getDDRegPatient() {
		return DDRegPatient;
	}
	public WebElement getTxtbirthdate() {
		return txtbirthdate;
	}
	public WebElement getDDBirthdateMonth() {
		return DDBirthdateMonth;
	}
	public WebElement getTxtbirthdateYear() {
		return txtbirthdateYear;
	}
	public WebElement getTxtaddress1() {
		return txtaddress1;
	}
	public WebElement getTxtaddress2() {
		return txtaddress2;
	}
	public WebElement getTxtcityVillage() {
		return txtcityVillage;
	}
	public WebElement getTxtCountry() {
		return txtCountry;
	}
	public WebElement getTxtPostalCode() {
		return txtPostalCode;
	}
	public WebElement getTxtphoneNumber() {
		return txtphoneNumber;
	}
	public WebElement getDDrelationshiptype() {
		return DDrelationshiptype;
	}
	public WebElement getTxtPersonName() {
		return txtPersonName;
	}
	public WebElement getBtnConfirm() {
		return btnConfirm;
	}
	public WebElement getBtnCancel() {
		return btnCancel;
	}


	@FindBy(name="givenName")
	private WebElement txtGivenName;
	@FindBy(name="familyName")
	private WebElement txtFamilyName;
	@FindBy(name="middleName")
	private WebElement txtMiddleName;
	@FindBy(id="next-button")
	private WebElement btnRightButton;
	@FindBy(name="gender")
	private WebElement DDRegPatient;
	@FindBy(name="birthdateDay")
	private WebElement txtbirthdate;
	@FindBy(name="birthdateMonth")
	private WebElement DDBirthdateMonth;
	@FindBy(name="birthdateYear")
	private WebElement txtbirthdateYear;
	@FindBy(id="address1")
	private WebElement txtaddress1;
	@FindBy(id="address2")
	private WebElement txtaddress2;
	@FindBy(id="cityVillage")
	private WebElement txtcityVillage;
	@FindBy(id="country")
	private WebElement txtCountry;
	@FindBy(id="postalCode")
	private WebElement txtPostalCode;
	@FindBy(name="phoneNumber")
	private WebElement txtphoneNumber;
	@FindBy(name="relationship_type")
	private WebElement DDrelationshiptype;
	@FindBy(xpath="//input[@placeholder=\"Person Name\"]")
	private WebElement txtPersonName;
	@FindBy(id="submit")
	private WebElement btnConfirm;
	@FindBy(id="cancelSubmission")
	private WebElement btnCancel;
	
	
	

}
