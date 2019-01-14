package com.uno.excelUtility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestResult;

import com.uno.baseClass.BaseCode;



	public class WebEventListener extends BaseCode implements WebDriverEventListener {
		ITestResult result;
		public static WebDriver driver;
	//	SD_LoginPage loginPageOfSdRole;
	//s	SD_HomePage homePageOfSdRole;

	/*	public void beforeNavigateTo(String url, WebDriver driver) {
			System.out.println("Before navigating to: '" + url + "'");
		}

		public void afterNavigateTo(String url, WebDriver driver) {
			System.out.println("Navigated to:'" + url + "'");
		}

		public void beforeChangeValueOf(WebElement element, WebDriver driver) {
			System.out.println("Value of the:" + element.toString() + " before any changes made");
		}

		public void afterChangeValueOf(WebElement element, WebDriver driver) {
			System.out.println("Element value changed to: " + element.toString());
		}

		public void beforeClickOn(WebElement element, WebDriver driver) {
			System.out.println("Trying to click on: " + element.toString());
		}

		public void afterClickOn(WebElement element, WebDriver driver) {
			System.out.println("Clicked on: " + element.toString());
		}

		public void beforeNavigateBack(WebDriver driver) {
			System.out.println("Navigating back to previous page");
		}

		public void afterNavigateBack(WebDriver driver) {
			System.out.println("Navigated back to previous page");
		}

		public void beforeNavigateForward(WebDriver driver) {
			System.out.println("Navigating forward to next page");
		}

		public void afterNavigateForward(WebDriver driver) {
			System.out.println("Navigated forward to next page");
		}*/

		public void onException(Throwable error,  WebDriver driver){
			System.out.println("Exception occured: " + error);
			/*try {
				
				 driver.quit();
	        		initialization();

	        		loginPageOfSdRole = new LoginPageOfSdRole();
	        		homePageOfSdRole = loginPageOfSdRole.login(
	        				properties.getProperty("loginIdForSd"),
	        				properties.getProperty("password"));
	        		Thread.sleep(1000);
				
		         
			} catch ( Exception e) {
				e.printStackTrace();
			}*/
		}

		/*public void beforeFindBy(By by, WebElement element, WebDriver driver) {
			System.out.println("Trying to find Element By : " + by.toString());
		}

		public void afterFindBy(By by, WebElement element, WebDriver driver) {
			System.out.println("Found Element By : " + by.toString());
		}
*/
		/*
		 * non overridden methods of WebListener class
		 */
		public void beforeScript(String script, WebDriver driver) {
		}

		public void afterScript(String script, WebDriver driver) {
		}

		public void beforeAlertAccept(WebDriver driver) {
			// TODO Auto-generated method stub

		}

		public void afterAlertAccept(WebDriver driver) {
			// TODO Auto-generated method stub

		}

		public void afterAlertDismiss(WebDriver driver) {
			// TODO Auto-generated method stub

		}

		public void beforeAlertDismiss(WebDriver driver) {
			// TODO Auto-generated method stub

		}

		public void beforeNavigateRefresh(WebDriver driver) {
			// TODO Auto-generated method stub

		}

		public void afterNavigateRefresh(WebDriver driver) {
			// TODO Auto-generated method stub

		}

		public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
			// TODO Auto-generated method stub

		}

		public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
			// TODO Auto-generated method stub

		}

		@Override
		public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterClickOn(WebElement arg0, WebDriver arg1) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterNavigateBack(WebDriver arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterNavigateForward(WebDriver arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterNavigateTo(String arg0, WebDriver arg1) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeClickOn(WebElement arg0, WebDriver arg1) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeNavigateBack(WebDriver arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeNavigateForward(WebDriver arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void beforeNavigateTo(String arg0, WebDriver arg1) {
			// TODO Auto-generated method stub
			
		}



	}


