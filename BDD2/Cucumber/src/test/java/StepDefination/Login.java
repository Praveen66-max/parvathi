package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
	    System.out.println("Inside steps-User is on the login page");
	    driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    System.out.println("Inside steps-User enters valid username and password");
	    driver.findElement(By.id("inputUsername")).sendKeys("praveen");
	    driver.findElement(By.name("inputPassword")).sendKeys("praveen6*");
	}

	@And("Clicks on the login button")
	public void clicks_on_the_login_button() {
		System.out.println("Inside steps-Clicks on the login button");
		driver.findElement(By.cssSelector(".submit")).click();
	    
	}

	@Then("User should be navigated to the home page")
	public void user_should_be_navigated_to_the_home_page() throws InterruptedException {
		System.out.println("Inside steps-User should be navigated to the home page");
		Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector(".error")).getText());

	}




}
