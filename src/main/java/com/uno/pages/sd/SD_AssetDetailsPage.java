package com.uno.pages.sd;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.uno.baseClass.BaseCode;

public class SD_AssetDetailsPage extends BaseCode {

	public static String serialNumber = null;

	@FindBy(css = "div[id='as_m_strCustomerName']>ul>li")
	public static List<WebElement> lstRowOfHighlightName;

	@FindBy(css = "a>span")
	public static List<WebElement> lstHighlightName;

	// Text box Address1
	@FindBy(css = ".as_warning")
	public static WebElement warning;

	// Initializing Page Object
	public SD_AssetDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	public void createManualAsset(String ddl_BusinessUnit,
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

		for (String Window1 : driver.getWindowHandles()) {

			Select businessUnit = new Select(ddlBusinessUnit);
			businessUnit.selectByValue(ddl_BusinessUnit);
			Thread.sleep(500);
			Select principleCustomer = new Select(ddlPrincipleCustomer);
			principleCustomer.selectByValue(ddl_PrincipleCustomer);
			Thread.sleep(500);

			txtCustomer.sendKeys(txt_Customer);
			Thread.sleep(500);
			int high = lstRowOfHighlightName.size();
			System.out.println("Size: " + high);
			loop: for (int i = 0; i < high; i++) {
				List<WebElement> custName = lstRowOfHighlightName.get(i)
						.findElements(By.cssSelector("a>span"));
				int custSize = custName.size();
				Thread.sleep(200);
				System.out.println("custSize:" + custSize);
				for (int j = 0; j < custSize; j++) {

					String customer = custName.get(j).getText();
					System.out.println("customer: " + customer);
					if (customer.contains(Suggested_Customer)) {
						highLight(custName.get(j));
						Thread.sleep(500);
						custName.get(j).click();
						Thread.sleep(1000);
						break loop;
					}
				}

			}

			btnSearchAssert.click();

			for (String Window : driver.getWindowHandles()) {
				driver.switchTo().window(Window);
			}
			Select siteCode = new Select(ddlSiteCode);
			siteCode.selectByValue(ddl_SiteCode);
			// txtSiteCode.sendKeys(siteCodetxt);
			txtCustomerContactName.sendKeys(txt_CustomerContactName);
			txtCustomerContactNo.sendKeys(txt_CustomerContactNo);
			txtCustomerContactEmailID.sendKeys(txt_CustomerContactEmailID);
			txtCustomerAddress.sendKeys(txt_CustomerAddress);

			Select region = new Select(ddlRegion);
			region.selectByVisibleText(ddl_Region);
			Thread.sleep(1000);
			Select state = new Select(ddlState);
			state.selectByVisibleText(ddl_State);
			Thread.sleep(1000);
			Select popLocation = new Select(ddlPopLocationInGeo);
			popLocation.selectByVisibleText(ddl_PopLocation);
			Thread.sleep(1000);
			Select city = new Select(ddlCityInGeo);
			city.selectByVisibleText(ddl_City);
			Thread.sleep(500);
			txtDistance.sendKeys(txt_Distance);
			Thread.sleep(500);
			txtAverageTravelTime.sendKeys(txt_AverageTravelTime);
			Thread.sleep(500);

			// SLA

			txtCustomerSLA.sendKeys(txt_CustomerSLA);
			txtOurSLA.sendKeys(txt_OurSLA);
			txtResponseTime.sendKeys(txt_ResponseTime);

			// Product
			Select productCategoryInProduct = new Select(
					ddlProductCategoryInProduct);
			productCategoryInProduct
					.selectByVisibleText(ddl_ProductCategoryInProduct);
			Thread.sleep(1000);
			Select productSubCategoryInProduct = new Select(
					ddlProductSubCategoryInProduct);
			productSubCategoryInProduct
					.selectByVisibleText(ddl_ProductSubCategoryInProduct);

			String serialno = "Demo_";
			// Get System Date
			Calendar min1 = new GregorianCalendar();
			int min2 = min1.get(Calendar.MINUTE);
			System.out.println(min2);
			String min3 = Integer.toString(min2);

			// Get System Date
			Calendar hrs1 = new GregorianCalendar();
			int hrs2 = hrs1.get(Calendar.HOUR);
			System.out.println(hrs2);
			String hrs3 = Integer.toString(hrs2);

			String value = min3.concat(hrs3);
			System.out.println("Dynamic Value: " + value);

			serialNumber = serialno.concat(value);
			System.out.println("serialNumber: " + serialNumber);
			txtSerialNo.sendKeys(txt_SerialNo);
			if(txt_SerialNo.equals(""))
			{
			txtSerialNo.sendKeys(serialNumber);
			}
			// txtSerialNo.sendKeys(SerialNoTxt);
			txtAssetId.sendKeys(txt_AssetId);
			txtMakeInProduct.sendKeys(txt_MakeInProduct);
			txtProductModelNo.sendKeys(txt_ProductModelNo);
			// Team

			Select engineerGrade = new Select(ddlEngineerGrade);
			engineerGrade.selectByVisibleText(ddl_EngineerGrade);
			Thread.sleep(1000);
			Select engineer = new Select(ddlEngineer);
			engineer.selectByVisibleText(ddl_Engineer);

			txtEngineerContact.sendKeys(txt_EngineerCode);
			txtEngineerEmail.sendKeys(txt_EngineerEmail);
			txtManager.sendKeys(txt_Manager);
			txtManagerContact.sendKeys(txt_ManagerContact);
			txtManagerEmail.sendKeys(txt_ManagerEmail);
			// Contract

			// Get System Date
			Calendar mydate = new GregorianCalendar();
			int dayOfMonth = mydate.get(Calendar.DAY_OF_MONTH);
			System.out.println(dayOfMonth);
			String currentDay = Integer.toString(dayOfMonth);

			int preDay = Integer.parseInt(currentDay);
			String previousDay = Integer.toString(preDay);

			Select contractReferenceAvailable = new Select(
					ddlContractReferenceAvailable);
			contractReferenceAvailable
					.selectByVisibleText(ddl_ContractReferenceAvailable);

			Thread.sleep(2000);
			// ddlContractRefNo.click();
			Select contractRefNo = new Select(ddlContractRefNo);

			contractRefNo.selectByValue(txt_ContractRefNo);

			WebElement contractReferenceAvailableValue = contractReferenceAvailable
					.getFirstSelectedOption();
			System.out.println("contractReferenceAvailableValue: "
					+ contractReferenceAvailableValue);
			if (contractReferenceAvailableValue.equals("Yes")) {

				Select pmFrequency = new Select(ddlPMFrequency);
				pmFrequency.selectByVisibleText(ddl_PMFrequency);

				calPrincipleWarrantyStartDate.click();

				// select close date and time

				// select Date
				String getDateValue = null;

				for (WebElement ele : dtpPrincipleWarrantyStartDate) {

					String date = ele.getText();

					if (date.equalsIgnoreCase(previousDay)) {
						Thread.sleep(1000);
						ele.click();
						getDateValue = ele.getText();
						System.out.println("Select the date:-" + getDateValue);

						break;
					}

				}

				String getCloseDateValue = txtPrincipleWarrantyStartDate
						.getAttribute("value");

				System.out.println(getCloseDateValue);
				Thread.sleep(2000);
				calPrincipleWarrantyEndDate.click();
				driver.findElement(By.xpath(".//[@id='dp-4-next-year-but']"))
						.click();

				// select Date
				String getDateValue1 = null;

				for (WebElement ele : dtpPrincipleWarrantyEndDate) {

					String date = ele.getText();

					if (date.equalsIgnoreCase(previousDay)) {
						Thread.sleep(1000);
						ele.click();
						getDateValue1 = ele.getText();
						System.out.println("Select the date:-" + getDateValue1);

						break;
					}

				}

				String getCloseDateValue1 = txtPrincipleWarrantyEndDate
						.getAttribute("value");

				System.out.println(getCloseDateValue1);

				// }
				calInstallationDate.click();

				// select close date and time

				// select Date
				String getDateValue2 = null;

				for (WebElement ele : dtpInstallationDate) {

					String date = ele.getText();

					if (date.equalsIgnoreCase(previousDay)) {
						Thread.sleep(1000);
						ele.click();
						getDateValue2 = ele.getText();
						System.out.println("Select the date:-" + getDateValue2);

						break;
					}

				}

				String getCloseDateValue2 = txtInstallationDate
						.getAttribute("value");

				System.out.println(getCloseDateValue2);
			}

			txtIPAddress.sendKeys(txt_IPAddress);
			txtAddressCode.sendKeys(txt_AddressCode);
			txtAddress1.sendKeys(txt_Address1);
			txtRemark1.sendKeys(txt_Remark1);

			Thread.sleep(2000);
			((JavascriptExecutor) driver).executeScript(
					"arguments[0].scrollIntoView(true);", btnGo);
			btnGo.click();

			try {
				Alert alert = driver.switchTo().alert();

				// Get Alert message
				String alertMsg = alert.getText();
				Thread.sleep(1000);
				System.out.println(alertMsg);
				alert.accept();
			} catch (Exception e) {

			}
			int sizeOfAssetId = lstAssetId.size();
			scrollDown(lstAssetId.get(sizeOfAssetId - 1));
			highLight(lstAssetId.get(sizeOfAssetId - 1));
			lstAssetId.get(sizeOfAssetId - 1).click();
			driver.switchTo().window(Window1);
		}
	}

	public void checkCustomerAddress() throws Exception {

		// btnSearchAssert.click();
		Thread.sleep(1000);
		Select businessUnit = new Select(ddlBusinessUnit);
		businessUnit.selectByValue("Diebold");
		Thread.sleep(500);
		Select principleCustomer = new Select(ddlPrincipleCustomer);
		principleCustomer.selectByValue("Demo_Principle");
		Thread.sleep(500);

		txtCustomer.sendKeys("Demo");
		Thread.sleep(200);
		int high = lstRowOfHighlightName.size();
		System.out.println("Size: " + high);
		for (int i = 0; i < high; i++) {
			highLight(lstRowOfHighlightName.get(i));
			String x = lstRowOfHighlightName.get(i).getText();
			System.out.println("X: " + x);

		}
		lstRowOfHighlightName.get(2).click();
		/*
		 * if(highlight.isDisplayed()) { highlight.click();
		 * System.out.println("HighLight Present"); } else if
		 * (warning.isDisplayed()) { System.out.println("Warning Present"); }
		 */
	}

}
