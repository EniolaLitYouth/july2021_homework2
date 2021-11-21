package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;

	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Liberary
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement DASHBOAR_HEADERE_ELEMENT;
	
	public void verifyDashboardPage() {
		Assert.assertEquals(DASHBOAR_HEADERE_ELEMENT.getText(), "Dashboard", "Wrong Page!!!");
	}

}
