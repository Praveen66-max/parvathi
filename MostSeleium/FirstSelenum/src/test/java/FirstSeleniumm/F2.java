package FirstSeleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class F2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.findElement(By.id("inputUsername")).sendKeys("praveen");
        driver.findElement(By.name("inputPassword")).sendKeys("praveen123");
        driver.findElement(By.cssSelector(".submit")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector(".error")).getText());
        driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("praveen kumar");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("praveenkumar@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9948934134");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
        driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("praveenkumar");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".signInBtn")).click();
        Thread.sleep(2000);
       System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
       Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello praveenkumar,");
       System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h1")).getText());
       driver.findElement(By.cssSelector(".logout-btn")).click();
       
        
        
       
        
        
        
        


        

	}

}
