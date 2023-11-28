package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {
	WebDriver driver;
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver(options);
	    driver.get("https://www.facebook.com/");
	}

	@When("I complete action")
	public void i_complete_action() {
		 WebElement txtUsername = driver.findElement(By.id("email"));
	     txtUsername.sendKeys("dlokeshbabu71@gmail.com");
	     WebElement password = driver.findElement(By.name("pass"));
	     password.sendKeys("9962670355");   
	}

	@And("some other action")
	public void some_other_action() {
		 WebElement login = driver.findElement(By.name("login"));
	     login.click();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		 String title = driver.getTitle();
		 System.out.println(title);
	     Assert.assertEquals("facebook", title);
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
	}
}
