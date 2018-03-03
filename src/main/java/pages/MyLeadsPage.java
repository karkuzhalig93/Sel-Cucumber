package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {

	public MyLeadsPage() {

		PageFactory.initElements(driver, this);
	}

	// Click Create Lead
	@FindBy(how = How.LINK_TEXT, using = "Create Lead")
	private WebElement eleCreateLead;
	@And("click CreateLead")
	public CreateLead clickCreateLead() {
		click(eleCreateLead);
		return new CreateLead();
	}

	// Click Find Lead
	
	@FindBy(how = How.LINK_TEXT, using = "Find Leads")
	private WebElement eleFindLead;
	@And("click FindLead")
	public FindLeads clickFindLead() {
		click(eleFindLead);
		return new FindLeads();
	}
	
	//Click Merge Lead
	@FindBy(how = How.LINK_TEXT, using = "Merge Lead")
	private WebElement eleMergeLead;

	public MergeLead clickMergeLead() {
		click(eleMergeLead);
		return new MergeLead();
	}
}
