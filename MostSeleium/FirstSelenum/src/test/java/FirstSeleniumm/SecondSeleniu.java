package FirstSeleniumm;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SecondSeleniu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.name("radioButton")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("India");
	    List<WebElement>options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	    Thread.sleep(3000);
	    for(WebElement option:options) 
	    {
	    	if(option.getText().equalsIgnoreCase("India"))
	    	{
	    		option.click();
	    		break;
	    		
	    	}
	    }
	   WebElement staticdropdown=driver.findElement(By.id("dropdown-class-example"));
	   Select dropdown=new Select(staticdropdown);
	   dropdown.selectByIndex(3);
       System.out.println(dropdown.getFirstSelectedOption().getText());
       dropdown.selectByValue("option2");
       System.out.println(dropdown.getFirstSelectedOption().getText());
       dropdown.selectByVisibleText("Option1");
       System.out.println(dropdown.getFirstSelectedOption().getText());
       driver.findElement(By.id("checkBoxOption3")).click();
       driver.findElement(By.id("openwindow")).click();
       driver.findElement(By.id("opentab")).click();
       driver.findElement(By.id("name")).sendKeys("praveen");
       driver.findElement(By.cssSelector("input[id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("input[value='Confirm']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("displayed-text")).sendKeys("praveen");
	    System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.id("displayed-text")).isDisplayed());
		driver.findElement(By.id("hide-textbox")).click();
		System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.id("displayed-text")).isDisplayed());
	
	
	    	
	  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

