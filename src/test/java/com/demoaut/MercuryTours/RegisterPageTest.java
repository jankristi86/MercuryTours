package com.demoaut.MercuryTours;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.objects.RegisterPage;
import resources.Base;
import resources.Constant;
import resources.ExcelUtils;

public class RegisterPageTest extends Base {
	RegisterPage rp = new RegisterPage(dr);

	@BeforeTest
	public void initialize() throws IOException {
		dr = initializeDriver();
		dr.get(prop.getProperty("url"));
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void registerOne() {
		rp.getRegisterBtn().click();
		rp.getFirstName().sendKeys("Mitar");
		rp.getLastName().sendKeys("Miric");
		rp.getPhone().sendKeys("38160008008");
		rp.getEmail().sendKeys("mitarmiric@yahoo.com");
		rp.getAddress().sendKeys("Denkova bara");
		rp.getCity().sendKeys("Beograd");
		rp.getState().sendKeys("Beograd");
		rp.getPostalCode().sendKeys("11080");
		rp.chooseSelectCountry("str");
		rp.getUserName().sendKeys("mita");
		rp.getPassword().sendKeys("mita008");
		rp.getConfirmPass().sendKeys("mita008");
		rp.getSubmit().click();

	}

	@Test
	public void registerExcelDriven() throws Exception {
		String data;
		ExcelUtils.setExcelFile(Constant.PATH_TESTDATA + Constant.FILE_DATA, Constant.SHEET1);
		rp.getRegisterBtn().click();
		data = ExcelUtils.getCellData(1, 0);
		rp.getFirstName().sendKeys(data);
		data = ExcelUtils.getCellData(1, 1);
		rp.getLastName().sendKeys(data);
		data = ExcelUtils.getCellData(1, 2);
		rp.getPhone().sendKeys(data);
		data = ExcelUtils.getCellData(1, 3);
		rp.getEmail().sendKeys(data);
		data = ExcelUtils.getCellData(1, 4);
		rp.getAddress().sendKeys(data);
		data = ExcelUtils.getCellData(1, 5);
		rp.getCity().sendKeys(data);
		data = ExcelUtils.getCellData(1, 6);
		rp.getState().sendKeys(data);
		data = ExcelUtils.getCellData(1, 7);
		rp.getPostalCode().sendKeys(data);
		rp.chooseSelectCountry("str");
		data = ExcelUtils.getCellData(1, 8);
		rp.getUserName().sendKeys(data);
		data = ExcelUtils.getCellData(1, 9);
		rp.getPassword().sendKeys(data);
		data = ExcelUtils.getCellData(1, 10);
		rp.getConfirmPass().sendKeys(data);
		rp.clickSubmit();

	}

	@AfterMethod(lastTimeOnly = true)
	public void checkRegistration() {
		if (rp.getRegConfirmation().isDisplayed()) {
			System.out.println("Registration pass");
		} else
			System.out.println("registration Failed");
	}

	@AfterMethod
	public void signOff() {
		rp.getSignOff().click();
	}

	@AfterTest
	public void closeDriver() {
		dr.close();
		dr = null;
	}

}
