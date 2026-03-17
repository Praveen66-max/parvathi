package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/praveen/login.do");
		LoginPage page=new LoginPage(driver);
		page.LoginButton("praveenkumarroyal692@gmail.com", "praveen");
		Thread.sleep(2000);
		LogOutPage page1=new LogOutPage(driver);
		page1.LogoutButton();
		Thread.sleep(2000);
		driver.quit();
		//driver.findElement(By.id("username")).sendKeys("praveenkumarroyal692@gmail.com");
		//driver.findElement(By.name("pwd")).sendKeys("praveen");
		//driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		//WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(2000));
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-testid='popup_menu_button_profile']"))).click();
		//driver.findElement(By.xpath("//div[text()='Logout']")).click();

	}

}
