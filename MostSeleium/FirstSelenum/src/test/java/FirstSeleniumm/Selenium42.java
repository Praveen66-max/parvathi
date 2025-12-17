package FirstSeleniumm;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium42 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		String[] itemsNeeded = {"Carrot","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement>products=driver.findElements(By.cssSelector("div h4"));
		System.out.println(driver.findElements(By.cssSelector("div h4")).size());
		Thread.sleep(2000);
		for(int i=0; i<products.size(); i++)
		{
		    String name = products.get(i).getText();
		    
		    List<String> itemsNeededList = Arrays.asList(itemsNeeded);
		    if(itemsNeededList.contains(name))
		    {
		        driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		    }
		}
				
			}
		

	}


