package SecondSelenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class G5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		int j=0;
		String[] iteamsAdded= {"Cucumber","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement>products=driver.findElements(By.cssSelector("div h4"));
		for(int i=0;i<products.size();i++)
		{
			
			String[] name=products.get(i).getText().split("-");
			String formattedstring=name[0].trim();
			List<String>iteamsNedded = Arrays.asList(iteamsAdded);
			if(iteamsNedded.contains(formattedstring))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==3){
					break;
				
				}
				}
			
				
			}
			
		}
		

	}


