package testInformations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageinformations.Forgotpassword;
import pageinformations.LoginPage;

public class fbTest {
	WebDriver driver;
	@BeforeTest
	public void envSetUp() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void loginValidation() throws InterruptedException {
		LoginPage pg=new LoginPage(driver);
		Thread.sleep(1000);
		pg.loginValidation("abhi123@gmail.com","Abhi@123");
		pg.loginBtnClick();
		
	}
	@Test
	public void ForgotPasswordvalidation() throws InterruptedException {
		Forgotpassword pg=new Forgotpassword(driver);
		Thread.sleep(1000);
		pg.frgtbtnclick();
		pg.forgotPasswordvalidation("7558816231");
		pg.continuebtnclick();
	}
	system.out.println("hello");
	}

