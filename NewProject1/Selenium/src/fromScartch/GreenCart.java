package fromScartch;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Set<String>iteams=new HashSet<>(Arrays.asList("Potato","Apple"));
		List<WebElement>products=driver.findElements(By.cssSelector("div h4"));
		Thread.sleep(20);
		for(WebElement product:products) {
			String Added=product.getText().split("-")[0].trim();
			if(iteams.contains(Added)) {
				product.findElement(By.xpath("following-sibling::div/button")).click();
			}
		}
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
	    System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());

	}

}
