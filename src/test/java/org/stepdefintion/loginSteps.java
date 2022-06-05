package org.stepdefintion;

import java.util.List;

import org.Base.BaseClass;
import org.Base.projectManager;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pom.FirstPage;
import pom.LoginPage;
import pom.RegPage;

public class loginSteps extends BaseClass{
	LoginPage m;
	RegPage r;
	@Given("The user should be in  openmrs page login page")
	public void the_user_should_be_in_openmrs_page_login_page() {
	launchBrowser("chrome");
		launchUrl("https://demo.openmrs.org/openmrs/login.htm");
	}
	@When("The user should enter valid username {string}and password{string}")
	public void the_user_should_enter_valid_username_and_password(String user, String pass) {
m=new LoginPage();
projectManager.getManager().getLoginPage().getTxtusername().sendKeys(user);
projectManager.getManager().getLoginPage().getTxtPassword().sendKeys(pass);
projectManager.getManager().getLoginPage().getLocation().click();

	}
	@When("The user should click the login button")
	public void the_user_should_click_the_login_button() {
		m=new LoginPage();
		m.getBtnLogin().click();	
	}

	@Then("The user shoould be in valid login page")
	public void the_user_shoould_be_in_valid_login_page() {
		Assert.assertTrue(getCurrentUrl().contains("home.page"));
		System.out.println("The user in valid page");
		
	}
	@Then("The user should click logout button and return to Home page")
	public void the_user_should_click_logout_button_and_return_to_Home_page() {
	    m.getBtnLogout().click();
		Assert.assertTrue(getCurrentUrl().contains("login"));
		System.out.println("Logged Out Sucessfully");
		
		browserQuit();
	}
	
	@When("The user should enter Invalid {string}and {string}")
	public void the_user_should_enter_Invalid_and(String user, String pass) {

		m=new LoginPage();
		m.getTxtusername().sendKeys(user);
		m.getTxtPassword().sendKeys(pass);
		m.getLocation().click();
	
	}
	
	@Then("The user should be in Invalid login page")
	public void the_user_should_be_in_Invalid_login_page() {
		Assert.assertTrue(getCurrentUrl().contains("login"));
		System.out.println("The user in Invalid page");
		browserQuit();
		}	
	@When("The user should click the registarionPatient button")
	public void the_user_should_click_the_registarionPatient_button() {
		FirstPage fr=new FirstPage();
	fr.getBtnRegPatient().click();
	}	
	@When("The user should be in Registration page")
	public void the_user_should_be_in_Registration_page() {
Assert.assertTrue(getCurrentUrl().contains("register"));
	}	
	@When("The user should fill the given,Middle and family name")
	public void the_user_should_fill_the_given_Middle_and_family_name(io.cucumber.datatable.DataTable d) {
		 r=new RegPage();
		List<List<String>> li = d.asLists();
	 List<String> l = li.get(0);
	
	 r.getTxtGivenName().sendKeys(l.get(0));
		r.getTxtMiddleName().sendKeys(l.get(1));
	 r.getTxtFamilyName().sendKeys(l.get(2));
	}
	@When("The user should click next button")
	public void the_user_should_click_next_button() {
	 r.getBtnRightButton().click();
		}
	@When("The user should select the gender {string} in dropdown")
	public void the_user_should_select_the_gender_in_dropdown(String string) {
	selectByVisibleText(r.getDDRegPatient(), string);
	}
	@When("The user should fill the date {string},month{string} and year{string}")
	public void the_user_should_fill_the_date_month_and_year(String string, String string2, String string3) {
    sendKeys(r.getTxtbirthdate(), string);
    selectByVisibleText(r.getDDBirthdateMonth(), string2);
    sendKeys(r.getTxtbirthdateYear(), string3);
	}
	@When("The user should fill the address{int},address{int},city,state,country,postal")
	public void the_user_should_fill_the_address_address_city_state_country_postal(Integer int1, Integer int2, io.cucumber.datatable.DataTable d) {
sendKeys(r.getTxtaddress1(), d.asLists().get(1).get(0));
sendKeys(r.getTxtaddress2(), d.asLists().get(1).get(1));
sendKeys(r.getTxtcityVillage(), d.asLists().get(1).get(2));
sendKeys(r.getTxtCountry(), d.asLists().get(1).get(3));
sendKeys(r.getTxtPostalCode(), d.asLists().get(1).get(4));
	}
	
	@When("The user should fill the patient phone number {string}")
	public void the_user_should_fill_the_patient_phone_number(String string) {
	sendKeys(r.getTxtphoneNumber(), string);
	}
	@When("The user should select the RealtionshipType and enter Person name{string}")
	public void the_user_should_select_the_RealtionshipType_and_enter_Person_name(String string) {
	selectByIndex(r.getDDrelationshiptype(), 1);
	sendKeys(r.getTxtPersonName(), string);
	}
	@When("The user should click the submit button")
	public void the_user_should_click_the_submit_button() {
	r.getBtnConfirm().click();
	}
	@When("then user have patentId")
	public void then_user_have_patentId() {
	Assert.assertTrue(getCurrentUrl().contains("Id"));
	
	System.out.println("Id ctreated Sucessfully");
	m.getBtnLogout().click();
	Assert.assertTrue(getCurrentUrl().contains("login"));
	System.out.println("Logged off Sucessfully");
	}

}
