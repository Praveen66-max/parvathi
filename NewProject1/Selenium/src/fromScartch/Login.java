package fromScartch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("praveen");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(200));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error']")));
		System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("praveen");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("pra@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9947937495");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Reset Login']")));
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
	    System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Go to Login']"))).click();
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("praveen");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".submit"))).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='login-container']/h2")));
        System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),"Hello praveen,");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();

		



		


	}

}
