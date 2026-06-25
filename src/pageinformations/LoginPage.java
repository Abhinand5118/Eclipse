package pageinformations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy (name="email")
	WebElement Email;
	@FindBy (name="pass")
	WebElement Password;
	@FindBy (xpath = "//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div")
	WebElement Loginbtn;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void loginValidation(String UN,String PSWD) {
		Email.sendKeys(UN);
		Password.sendKeys(PSWD);
	}
	public void loginBtnClick() {
		Loginbtn.click();
	}
}
