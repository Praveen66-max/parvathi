package SecondSelenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class G10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		int j=0;
		String[] IteamsAdded= {"Cauliflower","Tomato"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement>products=driver.findElements(By.cssSelector("div h4"));
		for(int i=0;i<products.size();i++)
		{
	        

			String[] name=products.get(i).getText().split("-");
			String formattedString=name[0].trim();
			List<String>IteamsNeeded = Arrays.asList(IteamsAdded);
			if(IteamsNeeded.contains(formattedString))
			{
				
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==3) {
				
			}
		}
		

	}

}
}
