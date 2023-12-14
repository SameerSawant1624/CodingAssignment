package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {
	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement textField;

	@FindBy(xpath = "(//div[@class='autocomplete-results-container']//child::div)[6]")
	private WebElement iphone;

	Actions action = new Actions(driver);

	public void entertextinSerachField() {
		textField.sendKeys("iphone");
	}

	public void clickOniphone() {
		action.moveToElement(iphone).click().build().perform();
	}
}
