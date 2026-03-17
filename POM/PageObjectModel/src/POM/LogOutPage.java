package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOutPage {
	
	WebDriver driver;
	
	public LogOutPage(WebDriver driver) {
		
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//button[@data-testid='popup_menu_button_profile']")
	WebElement Button;
	
	@FindBy(xpath="//div[text()='Logout']")
	WebElement logout;
	
	
	public void LogoutButton() {
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(2000));
		w.until(ExpectedConditions.elementToBeClickable(Button));
		Button.click();
		w.until(ExpectedConditions.elementToBeClickable(logout));
		logout.click();
		
		
	}
}
