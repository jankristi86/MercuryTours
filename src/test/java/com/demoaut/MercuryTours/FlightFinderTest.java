package com.demoaut.MercuryTours;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.objects.FlightFinder;
import page.objects.LoginPage;
import resources.Base;

public class FlightFinderTest extends Base {
	FlightFinder ff = new FlightFinder(dr);

	@BeforeTest
	public void initialize() throws Exception {
		dr = initializeDriver();
		dr.get(prop.getProperty("url"));
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void loginUser() {
		LoginPage lp = new LoginPage(dr);
		lp.clickSignOn();
		lp.getUserName().sendKeys("Pera24");
		lp.getPassword().sendKeys("perica");
		lp.clickLogin();
	}

	@Test
	public void bookFlight() throws InterruptedException {

		ff.getType().click();
		ff.choosePassCount();
		ff.chooseFromPort();
		ff.chooseFromMonth();
		ff.chooseFromDay();
		ff.chooseToPort();
		ff.chooseToMonth();
		ff.chooseToDay();
		ff.chooseServClass();
		ff.chooseAirline();
		ff.getFindFlight().click();
		ff.getReserveFlight().click();
	}

}
