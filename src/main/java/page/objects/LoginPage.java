package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver dr;

	private By signOn = By.linkText("SIGN-ON");
	private By userName = By.cssSelector("input[name='userName']");
	private By password = By.cssSelector("input[name='password']");
	private By login = By.cssSelector("input[name='login']");
	private By logConfirm = By.xpath("//font[contains(text(),'Use our Flight Finder')]");

	// constructor
	public LoginPage(WebDriver dr) {
		this.dr = dr;
	}

	// signOn Btn
	public WebElement getSignOn() {
		return dr.findElement(signOn);
	}

	public void clickSignOn() {
		getSignOn().click();
	}

	// userName
	public WebElement getUserName() {
		return dr.findElement(userName);
	}

	public void clickUserName() {
		getUserName().click();
	}

	public void sendKeysUserName(String str) {
		getUserName().clear();
		getUserName().sendKeys(str);
	}

	// password
	public WebElement getPassword() {
		return dr.findElement(password);
	}

	public void clickPassword() {
		getPassword().click();
	}

	public void sendKeysPassword(String str) {
		getPassword().clear();
		getPassword().sendKeys(str);
	}

	// LogIn
	public WebElement getLogin() {
		return dr.findElement(login);
	}

	public void clickLogin() {
		getLogin().click();
	}

	public WebElement logConfirm() {
		return dr.findElement(logConfirm);
	}

}
