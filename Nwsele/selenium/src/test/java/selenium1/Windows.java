package selenium1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//a[contains(text(),'ResumeAssistance')]")).click();
		Set<String>window=driver.getWindowHandles();
		Iterator<String>it=window.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		String Text=driver.findElement(By.cssSelector(".im-para.red")).getText();
		String EmailId=Text.split("at")[1].trim().split("with")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(EmailId);

	}

}
