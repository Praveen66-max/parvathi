package FirstSeleniumm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium37 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement>products=driver.findElements(By.xpath("//div/h4"));
		Thread.sleep(2000);
		for(int i=0;i<products.size();i++)
		{
			String name=products.get(i).getText();
			if(name.contains("Mango"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}	
	}
}
			
		
		
			
			
	

