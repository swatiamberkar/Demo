package com.uno.pages.sd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.uno.baseClass.BaseCode;




public class SD_TicketPage extends BaseCode {
//Select create new Tab
	@FindBy(css="a[href='/erprmwise/IncidentAction.do']")
	WebElement tab_CreateNew;
	
	@FindBy(xpath="//a[@href='/erprmwise/SearchIncidentPage.do?MenuClick=ViewIncident']")
	WebElement tab_ViewTicket;
	
	@FindBy(css="a[href='/erprmwise/ViewTicketWiseSubTicket.do?MenuClick=ViewIncident']")
	WebElement tab_ViewSubTicket;
	
	@FindBy(css="a[href='/erprmwise/ViewRequests2.do']")
	WebElement tab_ViewTicket_2;
	
	@FindBy(css="a[href='/erprmwise/DailyActivity.do']")
	WebElement tab_DailyActivity;
	
	@FindBy(css="a[href='/erprmwise/ToDoList.do']")
	WebElement tab_ToDo;
	
	@FindBy(css="a[href='/erprmwise/EngineerActivityAddActionNew.do']")
	WebElement tab_EngineerActivity;
	
	// SD Activity tab
	@FindBy(css="a[href='/erprmwise/TMActivityAddAction.do']")
	WebElement tab_SDActivity;
	
	// Reports tab
	@FindBy(css="a[href='/erprmwise/ReportsLink.do']")
	WebElement tab_Reports;
	
	// SD Activity tab
	@FindBy(css="a[href='/erprmwise/TMActivityAddAction.do']")
	WebElement tab_TechnicianBulkAssigned;
	

	
//Initializing Page Object
	public SD_TicketPage()
	{
		PageFactory.initElements(driver, this);
	}
	
//Click on Create New Tab
	public SD_AssetDetailsPage createNewTab()
	{
		tab_CreateNew.click();
		return new SD_AssetDetailsPage();
	}

	
	

}
