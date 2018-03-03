package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods {

	public FindLeads() {

		PageFactory.initElements(driver, this);

	}

	// Enter first name
	@FindBy(how = How.XPATH, using = "(//div[@class='x-form-item x-tab-item'])[2]//input")
	private WebElement eleFname;

	public FindLeads enterfirstName(String data) {
		type(eleFname, data);
		return this;
	}

	// Enter emp id
	@FindBy(how = How.NAME, using = "id")
	private WebElement eleEmpID;

	public FindLeads enterEmpID(String empId) {
		type(eleFname, empId);
		return this;
	}

	// navigate to phone number tab
	@FindBy(how = How.XPATH, using = "//span[text()='Phone']")
	private WebElement elePhone;

	public FindLeads clickPhone() {
		click(elePhone);
		return this;
	}

	// enter phone num
	@FindBy(how = How.NAME, using = "phoneNumber")
	private WebElement elePhoneNum;

	public FindLeads enterPhoneNum(String data) {
		type(elePhoneNum, data);
		return this;
	}

	// navigate to email tab
	@FindBy(how = How.XPATH, using = "(//span[contains(@class,'x-tab-strip-text ')])[3]")
	private WebElement eleEmailtab;
	@And("click Email")
	public FindLeads clickEmail() {
		click(eleEmailtab);
		return this;
	}

	// enter email
	@FindBy(how = How.NAME, using = "emailAddress")
	private WebElement eleEmail;
	
	@Given("enter email (.*)")
	public FindLeads enterEmail(String data) {
		type(eleEmail, data);
		return this;
	}

	// click find lead button
	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")
	private WebElement eleSubFindLead;
	@And("click findleadbutton")
	public FindLeads clickSubFindLead() {
		click(eleSubFindLead);
		return this;
	}

	// To get text
	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleFLink;
	@And("get FirstLeadName")
	public FindLeads getLinkText() {
		String id = getText(eleFLink);
		System.out.println(id);
		return this;
	}

	// To click first link
	@FindBy(how = How.XPATH, using = "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement elefirstLink;
	@And("click firstLead")
	public ViewLead clickFirstLink() {
		click(elefirstLink);
		return new ViewLead();
	}

	// To verify the message displayed
	@FindBy(how = How.XPATH, using = "//div[@class='x-paging-info']")
	private WebElement eleErrorMsg;

	public FindLeads verifyErrorMsg(String expText) {
		verifyExactText(eleErrorMsg, expText);
		return this;
	}

}