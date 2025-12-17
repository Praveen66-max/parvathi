package FirstSeleniumm;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewSelenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		int j=0;
		String[] iteamsAdded= {"Onion","Banana","Orange"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement>products=driver.findElements(By.cssSelector("div h4"));
		Thread.sleep(2000);
        System.out.println(driver.findElements(By.cssSelector("div h4")).size());
        for(int i=0;i<products.size();i++)
        {
            
       
        	String[] name=products.get(i).getText().split("-");
        	String formattedName=name[0].trim();
        	
        	List<String> iteamsList = Arrays.asList(iteamsAdded);

        	if(iteamsList.contains(formattedName))
        	{
        		j++;
        		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
        		
        		if(j==3) {
        			
        			break;
        		}
        		
        		
       
        	}
        	}
        	
        }
		

        }
	


