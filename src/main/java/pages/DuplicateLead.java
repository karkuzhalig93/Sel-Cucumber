package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods {

	public DuplicateLead() {
		PageFactory.initElements(driver, this);
	}

	// Verify title
	@And("verify Duplicatetitle (.*)")
	public DuplicateLead verTitle(String title) {
		verifyTitle(title);
		return this;

	}
	
	//Click create lead
		@FindBy(how=How.XPATH,using="(//input[@class='smallSubmit'])[1]")
		private WebElement eleUpdate;
		
		@And("click createLead")
		public ViewLead clickCreateLead() {
			
			click(eleUpdate);
			return new ViewLead();
		}
	
}
