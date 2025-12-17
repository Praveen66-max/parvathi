package FirstSeleniumm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class FstSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		String name="praveen";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("password");
		driver.findElement(By.cssSelector(".submit")).click();
        System.out.println(driver.findElement(By.cssSelector(".error")).getText());
        driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
        driver.findElement(By.xpath("//input[@ placeholder='Name']")).sendKeys("praveenKumar");
        driver.findElement(By.xpath("//input[@ placeholder='Email']")).sendKeys("praveenKumar@gmail.com");
        driver.findElement(By.xpath("//input[@ placeholder='Phone Number']")).sendKeys("9948934134");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
        driver.findElement(By.id("inputUsername")).sendKeys("praveenKumar");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".submit")).click();
        System.out.println(driver.findElement(By.xpath("//div/h2")).getText());
        System.out.println(driver.findElement(By.xpath("//div/h1")).getText());
        System.out.println(driver.findElement(By.xpath("//div/p")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div/p")).getText(),"You are successfully logged in.");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
      
        
        
       
				
			

	}

}
