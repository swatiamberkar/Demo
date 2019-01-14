package com.uno.test.sd;

import java.io.File;
import java.lang.reflect.Method;
import java.text.ParseException;

import io.qameta.allure.Description;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.uno.baseClass.BaseCode;
import com.uno.excelUtility.TestUtil;
import com.uno.pages.sd.SD_AssetDetailsPage;
import com.uno.pages.sd.SD_HomePage;
import com.uno.pages.sd.SD_LoginPage;
import com.uno.pages.sd.SD_TicketPage;

public class SD_AssetDetailsTest extends BaseCode {

	public static int count;
	SD_LoginPage sd_LoginPage;
	SD_HomePage sd_HomePage;
	SD_TicketPage sd_TicketPage;
	SD_AssetDetailsPage sd_AssetDetailsPage;

	public static String methodName = null;
	String currentDir = System.getProperty("user.dir");

	String xlFilePath = "D:\\UnoPoint\\UnoPoint\\src\\main\\java\\com\\uno\\excelFile\\AssetData.xlsx";
	String sheetId = "Sheet1";

	public SD_AssetDetailsTest() {

		super();

	}

	// @Parameters("browserName")
	@BeforeClass(alwaysRun = true)
	public void Login() throws Exception {
		initialization();

		sd_LoginPage = new SD_LoginPage();
		Thread.sleep(1000);
		sd_HomePage = sd_LoginPage.login(
				properties.getProperty("loginIdForSd"),
				properties.getProperty("password"));

	}

	@BeforeMethod(alwaysRun = true)
	public void SelectCreateNewTab(Method method) throws Exception {

		String path = currentDir + "/Recording/" + method.getName();
		startRecording(path, method.getName());

		sd_HomePage = new SD_HomePage();
		sd_TicketPage = sd_HomePage.ticketTab();
		Thread.sleep(1000);
		sd_AssetDetailsPage = sd_TicketPage.createNewTab();
		Thread.sleep(1000);

	}

	@DataProvider
	public String[][] assetData() throws Exception {
		TestUtil data = new TestUtil();
		// Object data[][] = TestUtility.getSheetdata(sheetName);
		return data.getCellData(xlFilePath, sheetId);

	}

	// invocationCount = 10
	@Test(priority = 1, dataProvider = "assetData", groups = { "Basic Flow" })
	public void CreateManualAsset(String ddl_BusinessUnit,
			String ddl_PrincipleCustomer, String txt_Customer,
			String Suggested_Customer, String ddl_SiteCode,
			String txt_CustomerContactName, String txt_CustomerContactNo,
			String txt_CustomerContactEmailID, String txt_CustomerAddress,
			String ddl_Region, String ddl_State, String ddl_PopLocation,
			String ddl_City, String txt_Distance, String txt_AverageTravelTime,
			String txt_CustomerSLA, String txt_OurSLA, String txt_ResponseTime,
			String ddl_ProductCategoryInProduct,
			String ddl_ProductSubCategoryInProduct, String txt_SerialNo,
			String txt_AssetId, String txt_MakeInProduct,
			String txt_ProductModelNo, String ddl_EngineerGrade,
			String ddl_Engineer, String txt_EngineerCode,
			String txt_EngineerContact, String txt_EngineerEmail,
			String txt_Manager, String txt_ManagerContact,
			String txt_ManagerEmail, String ddl_PMFrequency,
			String ddl_ContractReferenceAvailable, String txt_ContractRefNo,
			String txt_IPAddress, String txt_AddressCode, String txt_Address1,
			String txt_Remark1) throws Exception {
		sd_AssetDetailsPage.createManualAsset(ddl_BusinessUnit,
				ddl_PrincipleCustomer, txt_Customer, Suggested_Customer,
				ddl_SiteCode, txt_CustomerContactName, txt_CustomerContactNo,
				txt_CustomerContactEmailID, txt_CustomerAddress, ddl_Region,
				ddl_State, ddl_PopLocation, ddl_City, txt_Distance,
				txt_AverageTravelTime, txt_CustomerSLA, txt_OurSLA,
				txt_ResponseTime, ddl_ProductCategoryInProduct,
				ddl_ProductSubCategoryInProduct, txt_SerialNo, txt_AssetId,
				txt_MakeInProduct, txt_ProductModelNo, ddl_EngineerGrade,
				ddl_Engineer, txt_EngineerCode, txt_EngineerContact,
				txt_EngineerEmail, txt_Manager, txt_ManagerContact,
				txt_ManagerEmail, ddl_PMFrequency,
				ddl_ContractReferenceAvailable, txt_ContractRefNo,
				txt_IPAddress, txt_AddressCode, txt_Address1, txt_Remark1);
	}

	@Test(priority = 1, groups = { "Basic Flow" })
	public void checkCustomerAddress() throws Exception {
		sd_AssetDetailsPage.checkCustomerAddress();
	}

	@AfterMethod
	public void writeResult(ITestResult result, Method method) throws Exception {
		stopRecording();
		String path = currentDir + "/Recording/" + method.getName();
		changeFileName(path, method.getName());

		try {
			if (result.getStatus() == ITestResult.SUCCESS) {
				System.out.println("================");
				System.out.println(result.getMethod().getMethodName());
				System.out.println("======PASS======");
			} else if (result.getStatus() == ITestResult.FAILURE) {
				System.out.println("================");
				System.out.println(result.getMethod().getMethodName());
				System.out.println("======FAIL======");

				// TestUtil.takeScreenshotAtEndOfTest();
				File scrFile = ((TakesScreenshot) driver)
						.getScreenshotAs(OutputType.FILE);

				String currentDir = System.getProperty("user.dir");

				FileUtils.copyFile(scrFile, new File(currentDir
						+ "/Screenshots/" + result.getMethod().getMethodName()
						+ ".jpg"));

				driver.quit();
				initialization();

				sd_LoginPage = new SD_LoginPage();
				sd_HomePage = sd_LoginPage.login(
						properties.getProperty("username"),
						properties.getProperty("password"));

			} else if (result.getStatus() == ITestResult.SKIP) {
				System.out.println("================");
				System.out.println(result.getMethod().getMethodName());
				System.out.println("======Skip======");

			}
		} catch (Exception e) {
			driver.quit();
			initialization();

			sd_LoginPage = new SD_LoginPage();
			sd_HomePage = sd_LoginPage.login(
					properties.getProperty("username"),
					properties.getProperty("password"));
			sd_HomePage = new SD_HomePage();
			sd_TicketPage = sd_HomePage.ticketTab();
			Thread.sleep(1000);
			sd_AssetDetailsPage = sd_TicketPage.createNewTab();
			Thread.sleep(1000);

		}

	}

	@AfterClass
	public void tearDown() {

		driver.quit();

	}
}
