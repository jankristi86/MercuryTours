package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder {

	public WebDriver dr;

	private By type = By.cssSelector("input[name='tripType']");
	private By passCount = By.cssSelector("select[name='passCount']");
	private By fromPort = By.cssSelector("select[name='fromPort']");
	private By fromMonth = By.cssSelector("select[name='fromMonth']");
	private By fromDay = By.cssSelector("select[name='fromDay']");
	private By toPort = By.cssSelector("select[name='toPort']");
	private By toMonth = By.cssSelector("select[name='toMonth']");
	private By toDay = By.cssSelector("select[name='toDay']");
	private By servClass = By.cssSelector("input[name='servClass']");
	private By airline = By.cssSelector("select[name='airline']");
	private By findFlight = By.cssSelector("input[name='findFlights']");
	private By reserveFlight = By.cssSelector("input[name='reserveFlight']");

	// constructor
	public FlightFinder(WebDriver dr) {
		this.dr = dr;
	}

	// Flight Type
	public WebElement getType() {
		return dr.findElement(type);

	}

	public void chooseType() {
		Select s = new Select(dr.findElement(type));
		s.selectByIndex(1);
	}

	// number of passengers
	public WebElement getPassCount() {
		return dr.findElement(passCount);
	}

	public void choosePassCount() {
		Select s = new Select(dr.findElement(passCount));
		s.selectByIndex(1);
	}

	// from port
	public WebElement getFrom() {
		return dr.findElement(fromPort);
	}

	public void clickfromPort() {
		getFrom().click();
	}

	public void chooseFromPort() {
		while (!dr.findElement(fromPort).getText().contains("Zurich")) {
			Actions a = new Actions(dr);
			a.keyDown(Keys.ARROW_DOWN).build().perform();
		}
		clickfromPort();
	}

	// from month
	public WebElement getFromMonth() {
		return dr.findElement(fromMonth);

	}

	public void chooseFromMonth() {
		Select s = new Select(dr.findElement(fromMonth));
		s.selectByVisibleText("December");
	}

	// from Day
	public WebElement getFromDay() {
		return dr.findElement(fromDay);

	}

	public void chooseFromDay() {
		Select s = new Select(dr.findElement(fromDay));
		s.selectByVisibleText("20");
	}

	// to port
	public WebElement getTo() {
		return dr.findElement(toPort);
	}

	public void clickToPort() {
		getTo().click();
	}

	public void chooseToPort() {
		while (!dr.findElement(toPort).getText().contains("Paris")) {
			Actions a = new Actions(dr);
			a.keyDown(Keys.ARROW_DOWN).build().perform();
		}
		clickToPort();
	}

	// to month
	public WebElement getToMonth() {
		return dr.findElement(toMonth);

	}

	public void chooseToMonth() {
		Select s = new Select(dr.findElement(toMonth));
		s.selectByVisibleText("January");
	}

	// to Day
	public WebElement getToDay() {
		return dr.findElement(toDay);

	}

	public void chooseToDay() {
		Select s = new Select(dr.findElement(toDay));
		s.selectByVisibleText("15");
	}

	// Service Class
	public WebElement getServClass() {
		return dr.findElement(servClass);
	}

	public void chooseServClass() {
		Select s = new Select(dr.findElement(servClass));
		s.selectByIndex(2);
	}

	// airline option
	public WebElement getAirline() {
		return dr.findElement(airline);
	}

	public void chooseAirline() {
		Select s = new Select(dr.findElement(airline));
		s.selectByVisibleText("No Preference");

	}

	// continue btn
	public WebElement getFindFlight() {
		return dr.findElement(findFlight);
	}

	// reserve flight
	public WebElement getReserveFlight() {
		return dr.findElement(reserveFlight);
	}

}
