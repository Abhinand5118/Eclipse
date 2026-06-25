package pageinformations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpassword {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"login_form\"]/div/div[1]/div/div[4]/div/a/div/div[1]/div/span/span")
	WebElement ForgotBtn;
	@FindBy(xpath = "//*[@id=\"_r_2_\"]")
	WebElement Mobile;
	@FindBy(xpath = "//div[@class='x1ja2u2z x78zum5 x2lah0s x1n2onr6 xl56j7k x6s0dn4 xozqiw3 x1q0g3np x972fbf x10w94by x1qhh985 x14e42zd x9f619 xtvsq51 xqbgfmv xbe3n85 x7a1id4 x1d9i5bo x1xila8y x1bumbmr xc8cyl1']")
	WebElement Continue;
	
	public Forgotpassword(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void frgtbtnclick() {
		ForgotBtn.click();
	}
	public void forgotPasswordvalidation(String MB) {
		Mobile.sendKeys("7558816231");
	}
	public void continuebtnclick() {
		Continue.click();
	}
}
