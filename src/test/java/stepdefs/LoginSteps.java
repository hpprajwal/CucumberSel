package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	
	public LoginSteps()
    {
           System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium downloads Jar\\\\chromedriver.exe");
           driver = new ChromeDriver();
           driver.manage().window().maximize();
    }
    @Given("^user is on login page$")
    public void user_is_on_login_page() throws Throwable {
        driver.get("https://www.phptravels.net/admin");
    }

    @When("^user enters valid email$")
    public void user_enters_valid_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("email")).sendKeys("admin@phptravels.com");
    }

    @When("^user enters valid password$")
    public void user_enters_valid_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
           driver.findElement(By.name("password")).sendKeys("demoadmin");
           driver.findElement(By.xpath("/html/body/div[2]/form[1]/button")).click();
           Thread.sleep(1000);
    }

    @Then("^user is logges in successfully$")
    public void user_is_logges_in_successfully() throws Throwable {
           Assert.assertEquals("Dashboard", driver.getTitle());
           driver.close();
    }



}
