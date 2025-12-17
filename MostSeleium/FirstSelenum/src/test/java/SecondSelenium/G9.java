package SecondSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class G9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.name("radioButton")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement>options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		Thread.sleep(2000);
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			 option.click();
		}
		WebElement staticdropdown=driver.findElement(By.id("dropdown-class-example"));
		Select dropdown=new Select(staticdropdown);
		dropdown.selectByIndex(1);
		driver.findElement(By.id("checkBoxOption3")).click();
		driver.findElement(By.id("name")).sendKeys("praveen");
		Thread.sleep(2000);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
        System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());
		driver.findElement(By.id("hide-textbox")).click();
        System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());

		
	}

}
