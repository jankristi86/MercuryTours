package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	public WebDriver dr;
	private By register = By.linkText("REGISTER");
	private By firstName = By.cssSelector("input[name=firstName]");
	private By lastName = By.cssSelector("input[name=lastName]");
	private By phone = By.cssSelector("input[name='phone']");
	private By email = By.cssSelector("input[id=userName]");
	private By address = By.cssSelector("input[name='address1']");
	private By city = By.cssSelector("input[name='city']");
	private By state = By.cssSelector("input[name='state']");
	private By postalCode = By.cssSelector("input[name='postalCode']");
	private By selectCountry = By.cssSelector("select[name='country']");
	private By userName = By.cssSelector("input[id='email']");
	private By password = By.cssSelector("input[name='password']");
	private By confirmPass = By.cssSelector("input[name='confirmPassword']");
	private By submit = By.cssSelector("input[name='register']");
	private By regConfirmation = By.xpath("//font[contains(text(),'Thank you for registering.')]");
	private By signOff = By.linkText("SIGN-OFF");

	// constructor
	public RegisterPage(WebDriver dr) {
		this.dr = dr;
	}

	// register btn
	public WebElement getRegisterBtn() {
		return dr.findElement(register);
	}

	// firstName
	public WebElement getFirstName() {
		return dr.findElement(firstName);
	}

	public void clickFirstName() {
		getFirstName().click();
	}

	public void sendKeysFirstName(String str) {
		getFirstName().clear();
		getFirstName().sendKeys(str);
	}

	// lastName
	public WebElement getLastName() {
		return dr.findElement(lastName);
	}

	public void clickLastName() {
		getLastName().click();
	}

	public void sendKeysLastName(String str) {
		getLastName().clear();
		getLastName().sendKeys(str);
	}

	// Phone
	public WebElement getPhone() {
		return dr.findElement(phone);
	}

	public void clickPhone() {
		getPhone().click();
	}

	public void sendKeysPhone(String str) {
		getPhone().clear();
		getPhone().sendKeys(str);
	}

	// Email
	public WebElement getEmail() {
		return dr.findElement(email);
	}

	public void clickEmail() {
		getEmail().click();
	}

	public void sendKeysEmail(String str) {
		getEmail().clear();
		getEmail().sendKeys(str);
	}

	// address
	public WebElement getAddress() {
		return dr.findElement(address);
	}

	public void clickAddress() {
		getAddress().click();
	}

	public void sendKeysAddress(String str) {
		getAddress().clear();
		getAddress().sendKeys(str);
	}

	// city
	public WebElement getCity() {
		return dr.findElement(city);
	}

	public void clickCity() {
		getCity().click();
	}

	public void sendKeysCity(String str) {
		getCity().clear();
		getCity().sendKeys(str);
	}

	// state
	public WebElement getState() {
		return dr.findElement(state);
	}

	public void clickState() {
		getState().click();
	}

	public void sendKeysState(String str) {
		getState().clear();
		getState().sendKeys(str);
	}

	// postal
	public WebElement getPostalCode() {
		return dr.findElement(postalCode);
	}

	public void clickPostalCode() {
		getPostalCode().click();
	}

	public void sendKeysPostalCode(String str) {
		getPostalCode().clear();
		getPostalCode().sendKeys(str);
	}

	// selectCountry
	public WebElement getSelectCountry() {
		return dr.findElement(selectCountry);
	}

	public void clickSelectCountry() {
		getSelectCountry().click();
	}

	public void chooseSelectCountry(String str) {
		Select s = new Select(getSelectCountry());
		s.selectByVisibleText("SERBIA");

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

	// confirmPass
	public WebElement getConfirmPass() {
		return dr.findElement(confirmPass);
	}

	public void clickConfirmPass() {
		getConfirmPass().click();
	}

	public void sendKeysConfirmPass(String str) {
		getConfirmPass().clear();
		getConfirmPass().sendKeys(str);
	}

	// submitBtn
	public WebElement getSubmit() {
		return dr.findElement(submit);
	}

	public void clickSubmit() {
		getSubmit().click();
	}

	public WebElement getRegConfirmation() {
		return dr.findElement(regConfirmation);
	}

	public WebElement getSignOff() {
		return dr.findElement(signOff);
	}

}
