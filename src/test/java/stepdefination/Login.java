package stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;

	@Given("open browser")
	public void open_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Given("enter Url")
	public void enter_url() {

		driver.get("http://localhost:8888/");

	}

	@When("enter username")
	public void enter_username() {
		driver.findElement(By.name("user_name")).sendKeys("admin");

	}

	@When("entrt password")
	public void entrt_password() {
		driver.findElement(By.name("user_password")).sendKeys("admin");

	}

	@Then("click on loginbtn")
	public void click_on_loginbtn() {
		driver.findElement(By.id("submitButton")).click();

	}

	@Then("close browser")
	public void close_browser() {
		driver.close();

	}

	@Given("enter Url {string}")
	public void enter_url(String URL) {

		driver.get(URL);

	}

	@Given("enter username {string}")
	public void enter_username(String UN) {
		driver.findElement(By.name("user_name")).sendKeys(UN);

	}

	@Given("entrt password {string}")	
	public void entrt_password(String PWD) {

		driver.findElement(By.name("user_password")).sendKeys(PWD);

	}

}
