package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;


public class HomePage extends ProjectMethods  {

	public HomePage(){
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="//h2")
	public WebElement eleLoggedName;

	@Then("verify Username (.*)")
	public HomePage verifyLoggedName(String data) {
		verifyPartialText(eleLoggedName, data);
		return this;
	}

	@FindBy(how=How.LINK_TEXT,using="CRM/SFA")
	private WebElement elecrmsfa;
	@And("click crmsfa")
	public MyHomePage clickcrmsfa() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(elecrmsfa);
		return new MyHomePage();		
	}


}







