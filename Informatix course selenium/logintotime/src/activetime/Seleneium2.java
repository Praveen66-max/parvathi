package activetime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleneium2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/praveen/login.do");
		driver.findElement(By.id("username")).sendKeys("praveenkumarroyal692@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("praveen");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@data-testid='popup_menu_button_profile']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Logout']")).click();
		


	}

}
