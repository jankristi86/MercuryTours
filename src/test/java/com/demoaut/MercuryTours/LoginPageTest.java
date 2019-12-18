package com.demoaut.MercuryTours;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.objects.LoginPage;
import page.objects.RegisterPage;
import resources.Base;
import resources.Constant;
import resources.ExcelUtils;

public class LoginPageTest extends Base {
	LoginPage lp = new LoginPage(dr);
	RegisterPage rp = new RegisterPage(dr);

	@BeforeTest
	public void initialize() throws Exception {
		dr = initializeDriver();
		dr.get(prop.getProperty("url"));
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void loginOne() throws InterruptedException {

		lp.getSignOn().click();
		lp.getUserName().sendKeys("Pera24");
		lp.getPassword().sendKeys("perica");
		lp.clickLogin();
	}

	@Test
	public void loginExcelDriven() throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.PATH_TESTDATA + Constant.FILE_DATA, Constant.SHEET2);

		lp.getSignOn().click();
		data = ExcelUtils.getCellData(1, 0);
		lp.getUserName().sendKeys(data);
		data = ExcelUtils.getCellData(1, 1);
		lp.getPassword().sendKeys(data);
		lp.clickLogin();
	}

	@AfterMethod(lastTimeOnly = true)
	public void checkLogin() {
		if (lp.logConfirm().isDisplayed()) {
			System.out.println("Login successful");
		} else
			System.out.println("login failed");
	}

	@AfterMethod()
	public void logOut() {
		rp.getSignOff().click();
	}

	@AfterTest
	public void closeDriver() {
		dr.close();
		dr = null;
	}

}
