package fromScartch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[contains(text(),'Free Access to InterviewQues')]")).click();
		Set<String>window=driver.getWindowHandles();
		Iterator<String>it=window.iterator();
		String partentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		String Text=driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
		String EmailID=Text.split("at")[1].trim().split("with")[0];
		driver.switchTo().window(partentId);
		driver.findElement(By.id("username")).sendKeys(EmailID);

		
		
		

	}

}
