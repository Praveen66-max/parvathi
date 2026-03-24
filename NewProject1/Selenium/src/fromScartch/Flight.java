package fromScartch;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement>countries=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement country:countries) {
			if(country.getText().equalsIgnoreCase("india"))
				country.click();
		}
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-state-active")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		for(int i=1;i<=6;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			
		}
		
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(staticdropdown);
		dropdown.selectByIndex(1);
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
	    System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		
		
	}
	
}
	    
	

		

	



