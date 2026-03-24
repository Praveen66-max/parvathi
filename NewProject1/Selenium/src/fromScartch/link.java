package fromScartch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.internal.SystemPropertyUtil;

public class link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
	   WebElement link =driver.findElement(By.id("gf-BIG"));
	   System.out.println(link.findElements(By.tagName("a")).size());
		

	}

}
