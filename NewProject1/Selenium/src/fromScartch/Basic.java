package fromScartch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.findElement(By.xpath("//form/h1")).getText());
		
		
		

	}

}
