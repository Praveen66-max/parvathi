package fromScartch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		WebElement Source=driver.findElement(By.id("draggable"));
		WebElement Target=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(Source, Target).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Download']")).click();
		
		

	}

}
