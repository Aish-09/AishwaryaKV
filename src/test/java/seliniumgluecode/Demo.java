package seliniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
 
	public static WebDriver driver;
	@Given("^user opens the url$")
	public void loadurl()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("F:\\STLC Course\\STLC Selinium\\Program\\LoginForm11111.html");
	}
	@When("^user enter the valid credentials -username$")
	public void enterusername()
	{
		WebElement username = driver.findElement(By.id("uname"));
		username.sendKeys("helios@test.com");
	}
	@And("^user enter the valid credentials -password$")
	public void enterpass() {
		WebElement pass = driver.findElement(By.name("pwd"));
		pass.sendKeys("helios");
	}
	@Then("^user clicks the submit button$")
	public void clicksubmit() 
	{
		driver.findElement(By.cssSelector("button")).click();
	}
	

}
