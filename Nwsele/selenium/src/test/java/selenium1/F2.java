package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class F2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement>countries=driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		for(WebElement country:countries) {
			if(country.getText().equalsIgnoreCase("India")) {
				country.click();
			}
		}
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='RDP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-active")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=1;i<=6;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown=new Select(staticdropdown);
		dropdown.selectByIndex(1);
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    dropdown.selectByValue("AED");
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    dropdown.selectByVisibleText("USD");
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
	    System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}
