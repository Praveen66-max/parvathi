package fromScartch;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class praticsepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
	    List<WebElement>places=driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		    for(WebElement place:places) {
		    	 if(place.getText().equalsIgnoreCase("India")) {
				place.click();
            }
		
            }
		WebElement staticdropdown=driver.findElement(By.id("dropdown-class-example"));
		Select dropdown=new Select(staticdropdown);
		dropdown.selectByIndex(1);
		driver.findElement(By.name("checkBoxOption2")).click();
		//driver.findElement(By.id("openwindow")).click();
		//driver.findElement(By.id("opentab")).click();
		driver.findElement(By.id("name")).sendKeys("praveen");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
	    System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());
		driver.findElement(By.id("displayed-text")).sendKeys("praveen");
		driver.findElement(By.id("hide-textbox")).click();
		System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());

		
		
		
	


	}
	}

