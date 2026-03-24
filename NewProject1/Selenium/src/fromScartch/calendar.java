package fromScartch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		String monthNumber="6";
		String data="23";
		String year="2027";
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup__input")).click();
		Thread.sleep(200);
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		Thread.sleep(200);
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
		driver.findElement(By.xpath("//abbr[@aria-label='23 June 2027']")).click();
		
		
		
		



	}

}
