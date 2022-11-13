package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class carsPage {
protected WebDriver driver;
	
	private By makedropdown = By.xpath("//select[@name='selectedMake']");
	private By submitButton = By.xpath("//button[@type='submit']");
	private By searchPageHeader = By.xpath("//h3[contains(.,'Showing') and contains(.,'results')]");
	
	
	
	public void searchByMake(WebDriver driver, String make)  {
		this.driver = driver;
		new Select(driver.findElement(makedropdown)).selectByValue(make);
		WebElement submitButtonEle = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(submitButton));
		submitButtonEle.click();
		WebElement searchHeaderText = new WebDriverWait(driver, Duration.ofSeconds(20))
		        .until(ExpectedConditions.visibilityOfElementLocated(searchPageHeader));
		System.out.println("Get text -----------> "+searchHeaderText.getText());
		

	}
}
