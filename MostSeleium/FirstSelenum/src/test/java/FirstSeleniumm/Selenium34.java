package FirstSeleniumm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium34 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Cucumber");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		Thread.sleep(8000);
		driver.findElement(By.cssSelector(".promoBtn")).click();
		Thread.sleep(8000);
       System.out.println(driver.findElement(By.xpath("//span[text()='Code applied ..!']")).getText());
       driver.findElement(By.xpath("//button[text()='Place Order']")).click();
       List<WebElement>countries=driver.findElements(By.xpath("//div/select/option"));
       for(WebElement country:countries)
       {
    	   if(country.getText().equalsIgnoreCase("India"))
    	   {
    		   country.click();
    	   }
       }
       driver.findElement(By.cssSelector(".chkAgree")).click();
       driver.findElement(By.xpath("//button[text()='Proceed']")).click();
       
       
       
      
      
	


	}

}
