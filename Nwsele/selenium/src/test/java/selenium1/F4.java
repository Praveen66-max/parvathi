package selenium1;

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

public class F4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Set<String>iteams=new HashSet<>(Arrays.asList("Apple","Musk Melon"));
		List<WebElement>products=driver.findElements(By.cssSelector("div h4"));
		Thread.sleep(2000);
		for(WebElement product:products) {
			String name=product.getText().split("-")[0].trim();
			if(iteams.contains(name)) {
				product.findElement(By.xpath("following-sibling::div/button")).click();
				
			}
		
		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED')]")).click();
		Thread.sleep(2000);
        driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
        Thread.sleep(2000);
		driver.findElement(By.cssSelector(".promoBtn")).click();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
        System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		
		

	}

}
