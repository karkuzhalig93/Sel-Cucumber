package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {
		
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompName;
	@And("enter CompName (.*)")
	public CreateLead enterCompName(String data) {
		type(eleCompName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFName;
	@And("enter Firstame (.*)")
	public CreateLead enterFName(String data) {
		type(eleFName, data);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLName;
	@And("enter lastname (.*)")
	public CreateLead enterLName(String data) {
		type(eleLName, data);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME, using="smallSubmit")
	private WebElement eleSubmit;
	@And("click create")
	public ViewLead clickSubmit() {
		click(eleSubmit);
		return new ViewLead();
	}
	
	//UpdateCompany Name
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleUpdCName	;
	
	public CreateLead enterUpdCName(String data) {
		type(eleUpdCName, data);
		return this;
	}
	
	//Update
	@FindBy(how=How.XPATH,using="(//input[@class='smallSubmit'])[1]")
	private WebElement eleUpdate	;
	
	public ViewLead clickUpdate() {
		
		click(eleUpdate);
		return new ViewLead();
	}
	
	public CreateLead verTitle(String title) {
		verifyTitle(title);
		return this;

	}
	
}
