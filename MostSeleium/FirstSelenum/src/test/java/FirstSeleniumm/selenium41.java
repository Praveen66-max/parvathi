package FirstSeleniumm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class selenium41 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("praveen");
		driver.findElement(By.name("inputPassword")).sendKeys("vikram");
		driver.findElement(By.cssSelector(".signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("praveen");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("praveen");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9948934134");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("praveen");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println(driver.findElement(By.xpath("//div/h2")).getText());
        System.out.println(driver.findElement(By.xpath("//div/h1")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div/h1")).getText(), "Welcome to Rahul Shetty Academy");
		
		
		
		
		
				
		
		
		
		

	}

}
