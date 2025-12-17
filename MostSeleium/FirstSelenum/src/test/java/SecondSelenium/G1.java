package SecondSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class G1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("praveenkumar");
		driver.findElement(By.name("inputPassword")).sendKeys("praveenkumar");
		driver.findElement(By.cssSelector(".submit")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("praveen");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("praveenroyal@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("998475886");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("praveen");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("div h2")).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("div h2")).getText(),"Hello praveen,");
        
        
        
        
        
        
		
		
	}

}
