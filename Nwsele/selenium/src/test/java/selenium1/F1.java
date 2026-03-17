package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class F1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@id,'inputUsername')]")).sendKeys("praveen");
	    driver.findElement(By.name("inputPassword")).sendKeys("praveen");
	    driver.findElement(By.xpath("//button[contains(text(),'In')]")).click();
	    Thread.sleep(2000);
	    System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("praveen");
	    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("praveen@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9948934134");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	    Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
	    driver.findElement(By.cssSelector(".go-to-login-btn")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("praveen");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.cssSelector(".submit")).click();
	    Thread.sleep(2000);
	    System.out.println(driver.findElement(By.xpath("//div/h2")).getText());
	    Assert.assertEquals(driver.findElement(By.xpath("//div/h2")).getText(),"Hello praveen,");
	    driver.findElement(By.cssSelector(".logout-btn")).click();

	    




	}

}
