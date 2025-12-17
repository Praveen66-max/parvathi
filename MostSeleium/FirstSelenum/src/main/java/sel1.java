import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		String[] ItemsAdded= {"Pumpkin - 1 Kg","Apple - 1 Kg"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement>products=driver.findElements(By.cssSelector("div h4"));
		System.out.println(driver.findElements(By.cssSelector("div h4")).size());
		for(int i=0;i<products.size();i++)
		{
			List<String> iteamsList = Arrays.asList(ItemsAdded);
			String name=products.get(i).getText();
			if(iteamsList.contains(name))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		
			}
		}

	}

}
