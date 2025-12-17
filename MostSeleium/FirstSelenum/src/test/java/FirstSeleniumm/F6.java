package FirstSeleniumm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class F6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.name("radioButton")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		Thread.sleep(2000);
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}

		WebElement staticdropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(2);
		driver.findElement(By.id("checkBoxOption3")).click();
		driver.findElement(By.id("openwindow")).click();
		driver.findElement(By.id("opentab")).click();
		driver.findElement(By.id("name")).sendKeys("praveen");
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();

		driver.findElement(By.id("displayed-text")).sendKeys("praveenkumar");
		driver.findElement(By.id("hide-textbox")).click();
		System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());
		driver.findElement(By.id("show-textbox")).click();
		System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());
		


	}

}
