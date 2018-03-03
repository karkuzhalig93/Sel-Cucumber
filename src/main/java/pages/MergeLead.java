package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods {

	public MergeLead() {

		PageFactory.initElements(driver, this);

	}

	// click icon 1
	// Click create lead
	@FindBy(how = How.XPATH, using = "(//img[@src='/images/fieldlookup.gif'])[1]\")")
	private WebElement eleicon1;

	public ViewLead clickIcon1() {

		click(eleicon1);
		return new ViewLead();
	}

	// click icon 1
	// Click create lead
	/*@FindBy(how = How.XPATH, using = "(//img[@src='/images/fieldlookup.gif'])[1]\")")
	private WebElement eleicon2;

	public ViewLead clickIcon1() {

		click(eleicon1);
		return new ViewLead();
	}*/

}
