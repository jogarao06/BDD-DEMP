package stepDefination_Org;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Creat_Org {
	WebDriver driver;

	@Given("launch Browser")
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Given("enterURL {string}")
	public void enter_url(String url) {
		driver.get(url);

	}

	@When("login page is displayed")
	public void login_page_is_displayed() {
		Assert.assertEquals(true, true);
	}

	@When("enterusername {string}")
	public void enterusername(String un) {
		driver.findElement(By.name("user_name")).sendKeys(un);

	}

	@When("enterPassword {string}")
	public void enter_password(String pwd) {
		driver.findElement(By.name("user_password")).sendKeys(pwd);

	}

	@Then("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("submitButton")).click();

	}

	@Then("verify the homepage title")
	public void verify_the_homepage_title() {
		Assert.assertEquals(true, true);
	}

	@Then("click on organizationlink")
	public void click_on_organizationlink() {
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();

	}

	@Then("just wait")
	public void just_wait() {
		System.out.println("waiting");
	}

	@Then("click on createorganization img")
	public void click_on_createorganization_img() {
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();

	}

	@Then("enterorgname {string}")
	public void enterorgname(String orgname) {
		driver.findElement(By.name("accountname")).sendKeys(orgname);
	}

	@Then("enter phonenumber {string}")
	public void enter_phonenumber(String phonenumber) {
		driver.findElement(By.name("phone")).sendKeys(phonenumber);
	}

	@Then("save the organization")
	public void save_the_organization() {
	driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
	}

	@Then("logout from the apllication")
	public void logout_from_the_apllication() throws InterruptedException {
	Thread.sleep(2000);
	Actions act=new Actions(driver);
	WebElement ele=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	act.moveToElement(ele).build().perform();
	Thread.sleep(2000);
	WebElement ele1= driver.findElement(By.xpath("//a[text()='Sign Out']\""));
	ele1.click();

	}

	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
