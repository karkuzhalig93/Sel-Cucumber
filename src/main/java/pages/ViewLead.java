package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods {
	
	public ViewLead() {
		
		PageFactory.initElements(driver, this);
	}
	// Verify Lead name
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVerify;
	@Then("verify LeadName (.*)")
	public ViewLead verifyLead(String data) {
		verifyPartialText(eleVerify, data );
		return this;
	}
	
	// Verify title
	public ViewLead verTitle(String title) {
		verifyTitle(title);
		return this;
		
	}
	
	//CLick edit
	@FindBy(how=How.LINK_TEXT,using ="Edit")
	private WebElement eleEdit;
	
	public CreateLead clickEdit() {
		click(eleEdit);
		return new CreateLead();
	}
	
	//click Delete
	@FindBy(how=How.LINK_TEXT,using ="Delete")
	private WebElement eleDelete;
	
	public MyLeadsPage clickDelete() {
		click(eleDelete);
		return new MyLeadsPage();
	}
	
	//click Duplicate
		@FindBy(how=How.LINK_TEXT,using ="Duplicate Lead")
		private WebElement eleDuplicate;
		@And("click DuplicateLead")
		public DuplicateLead clickDuplicate() {
			click(eleDuplicate);
			return new DuplicateLead();
		}
}
