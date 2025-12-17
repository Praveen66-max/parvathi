package FirstSeleniumm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("praveen");
		driver.findElement(By.name("inputPassword")).sendKeys("praveen6*");
		driver.findElement(By.cssSelector(".submit")).click();
        System.out.println(driver.findElement(By.cssSelector("p[class='error']")).getText());
		driver.findElement(By.cssSelector("div[class='forgot-pwd-container'] a")).click();
		driver.findElement(By.xpath("//form/input[1]")).sendKeys("praveen");
		driver.findElement(By.xpath("//form/input[2]")).sendKeys("praveenroyal@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("994560923");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector("p[class='infoMsg']")).getText());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("inputUsername")).sendKeys("praveen");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".submit")).click();
        System.out.println(driver.findElement(By.xpath("//div/h2")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div/h2")).getText(), "Hello praveen,");
        System.out.println(driver.findElement(By.xpath("//div/h1")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div/h1")).getText(), "Welcome to Rahul Shetty Academy");
        System.out.println(driver.findElement(By.xpath("//div/p")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div/p")).getText(), "You are successfully logged in.");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        
       
        
    
        
        
        
		

	}

}
