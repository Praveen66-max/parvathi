package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	

		WebDriver driver;
		
		public LoginPage(WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="username")
		WebElement name;
		
		@FindBy(name="pwd")
		WebElement pass;
		
		@FindBy(xpath="//a[@id='loginButton']")
		WebElement Login;
		
		
		public void LoginButton(String username,String pwd) {
			
			WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
			w.until(ExpectedConditions.visibilityOf(name));
			name.sendKeys(username);
			w.until(ExpectedConditions.visibilityOf(pass));
			pass.sendKeys(pwd);
			w.until(ExpectedConditions.elementToBeClickable(Login));
			Login.click();
			

			
		
	}

}
