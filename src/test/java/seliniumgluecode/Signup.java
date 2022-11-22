package seliniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Signup {
	
	public static WebDriver driver;
	@Given("^open browser$")
	public void openbrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@When("^loadurl https://itera-qa.azurewebsites.net/home/automation$")
	public void loadurl()
	{
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
	}
	@And("^Enter values to text box$")
	public void entertext()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("name")).sendKeys("Helios");
		driver.findElement(By.id("phone")).sendKeys("4454635457");
		driver.findElement(By.id("email")).sendKeys("helios@test.com");
		driver.findElement(By.id("password")).sendKeys("helio@test");
		driver.findElement(By.id("address")).sendKeys("41/89 Sendous, Columbia - 005561");
	}
	@And("^Click submit button$")
	public void submit()
	{
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
	}
	@Then("^Close browser$")
	public void browserclose()
	{
		driver.close();
	}

}
