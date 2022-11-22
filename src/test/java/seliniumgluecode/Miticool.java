package seliniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Miticool {
	
	WebDriver driver;
	
	@Given("^user opens the url of miticool$")
	public void openurl()
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mitticool.com/");
		
	}
	
	@When("^user enters the login credentails$")
	public void credentails()
	{
		driver.findElement(By.cssSelector("span.nasa-login-title")).click();
		driver.findElement(By.name("username")).sendKeys("topivol635@dicopto.com");
		driver.findElement(By.name("password")).sendKeys("topivol635@dicopto.com");
		driver.findElement(By.name("login")).click();
	}
	
	@Then("^mousehover on product$")
	public void mousehover()
	{
		WebElement prod = driver.findElement(By.xpath("//*[@id=\"site-navigation\"]/li[2]/a/span"));
		Actions action = new Actions(driver);
		action.moveToElement(prod).perform();
	}
	
	@And("^select the suboption and print its heading$")
	public void subproducthover() throws InterruptedException
	{
		Thread.sleep(300);
		WebElement prod1 = driver.findElement(By.xpath("//*[@id=\"site-navigation\"]/li[2]/div/div/ul/li[4]/a/span"));
		prod1.click();
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div[3]/div/div/div[2]/div[3]/div/div/ul/li[1]/div/div/div/div/div[2]/div/div[2]/a")).click();
		String str = driver.findElement(By.xpath("//*[@id=\"product-955030025\"]/div[2]/div/div[2]/div[1]/div[2]/div/div/h1")).getText();
		System.out.println(str);
	}
	
	@But("^userlogsout$")
	public void logout()
	{
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"top-bar\"]/div/div/div[1]/div/ul/li/a"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(logout).perform();
		driver.findElement(By.xpath("//*[@id=\"top-bar\"]/div/div/div[1]/div/ul/li/ul/li[7]/a")).click();
		driver.close();
	}
}
