package SecondSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class G2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.findElement(By.id("inputUsername")).sendKeys("praveen");
        driver.findElement(By.name("inputPassword")).sendKeys("praveen6*");
        driver.findElement(By.cssSelector(".submit")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector(".error")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/a")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("praveen");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("praveen@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567891");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//form/p")).getText());
        driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("praveen");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//div/h2")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div/h2")).getText(), "Hello praveen,");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div button")).click();
        

	}

}
