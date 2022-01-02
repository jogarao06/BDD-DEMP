package stepDefination_sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	WebDriver driver;

	@Given("open Browser")
	public void open_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Given("Enter Url")
	public void enter_url() {
		driver.get("https://www.flipkart.com/");

	}

	@When("Wait for Page")
	public void wait_for_page() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@When("search for mobile")
	public void search_for_mobile() {
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		driver.findElement(By.name("q")).sendKeys("Mobile", Keys.ENTER);

	}

	@When("Close Browser")
	public void close_browser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();

	}

	@When("search for Mi TV {string}")
	public void search_for_mi_tv(String TV) {
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();

		driver.findElement(By.name("q")).sendKeys(TV, Keys.ENTER);

	}

}
