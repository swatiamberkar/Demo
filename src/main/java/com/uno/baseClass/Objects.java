package com.uno.baseClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Objects {

	public static WebDriver driver;

	// Button Save
	@FindBy(css = "input[onclick='Save()']")
	public static WebElement btnSave;

	@FindBy(linkText = "Search Asset")
	public static WebElement btnSearchAssert;

	// Button Reset
	@FindBy(css = "a[onclick='resetFilter()']")
	public static WebElement btnReset;

	// Button Go
	@FindBy(css = "a[class='btn marTp10']")
	public static WebElement btnGo;

	// Calendar Principle Warranty Start Date
	@FindBy(css = "a[id='fd-but-dp-6']")
	public static WebElement calPrincipleWarrantyStartDate;

	// Calendar Contract Start Date
	@FindBy(css = "a[id='fd-but-dp-1']")
	public static WebElement calContractStartDate;

	// Calendar Contract End Date
	@FindBy(css = "a[id='fd-but-dp-2']")
	public static WebElement calContractEndDate;

	// Calendar Principle Warranty End Date
	@FindBy(css = "a[id='fd-but-dp-4']")
	public static WebElement calPrincipleWarrantyEndDate;

	// Calendar Installation Date
	@FindBy(css = "a[id='fd-but-dp-5']")
	public static WebElement calInstallationDate;

	// Drop down Business Unit
	@FindBy(css = "select[name='m_strBusinessUnit']")
	public static WebElement ddlBusinessUnit;

	// Drop down Principle Customer
	@FindBy(css = "#m_strPrincipalCust")
	public static WebElement ddlPrincipleCustomer;

	// Drop down Site Code
	@FindBy(css = "select[name='m_strFilterSiteCode']")
	public static WebElement ddlSiteCode;

	// Drop down Product Category
	@FindBy(css = "select[name='m_strFilterProductCategory']")
	public static WebElement ddlProductCategory;

	// Drop down Product Sub Category
	@FindBy(css = "select[name='m_strFilterProductSubCategory']")
	public static WebElement ddlProductSubCategory;

	// Drop down Make
	@FindBy(css = "select[name='m_strFilterMake']")
	public static WebElement ddlMake;

	// Drop down Product Model No
	@FindBy(css = "select[name='m_strFilterProductModelNo']")
	public static WebElement ddlProductModelNo;

	// Drop down Pop Location
	@FindBy(css = "select[name='m_strFilterPopLocation']")
	public static WebElement ddlPopLocation;

	// Drop down City
	@FindBy(css = "select[name='m_strFilterCity']")
	public static WebElement ddlCity;

	// Drop down Region
	@FindBy(css = "select[name='m_strRegion']")
	public static WebElement ddlRegion;

	// Drop down State
	@FindBy(css = "select[name='m_strState']")
	public static WebElement ddlState;

	// Drop down Pop Location
	@FindBy(css = "select[name='m_strPopLocation']")
	public static WebElement ddlPopLocationInGeo;

	// Drop down City
	@FindBy(css = "select[name='m_strCity']")
	public static WebElement ddlCityInGeo;

	// Drop down Work Profile
	@FindBy(css = "select[name='m_strWorkProfile']")
	public static WebElement ddlWorkProfile;

	// Product

	// Drop down Product Category
	@FindBy(css = "select[name='m_strProductCategory']")
	public static WebElement ddlProductCategoryInProduct;

	// Drop down Product Sub-Category
	@FindBy(css = "select[name='m_strProductSubCategory']")
	public static WebElement ddlProductSubCategoryInProduct;

	// Team
	// Drop down Engineer Grade
	@FindBy(css = "select[name='m_strEngineerGrade']")
	public static WebElement ddlEngineerGrade;

	// Drop down Engineer
	@FindBy(css = "select[name='m_strEngineer']")
	public static WebElement ddlEngineer;

	// Drop down Manager
	@FindBy(css = "select[name='m_strTM']")
	public static WebElement ddlManager;

	// Contract

	// Drop down Contract Reference Available
	@FindBy(css = "select[name='m_strContractRefAvilable']")
	public static WebElement ddlContractReferenceAvailable;

	// Drop down Contract Ref No
	@FindBy(css = "select[name='m_strContractRefNo']")
	public static WebElement ddlContractRefNo;

	// Drop down PM Frequency
	@FindBy(css = "select[name='m_strPmSchedule']")
	public static WebElement ddlPMFrequency;

	// Label Ticket Count in Ticket Table
	@FindBy(css = "div[id='pagination']>strong")
	public static WebElement lblTicketCountInTicketTable;

	// Label Ticket Count in Ticket Table
	@FindBy(css = "a[onclick='submitOpen();']>span[class='badge']")
	public static WebElement lblCountOfRequestOpenTab;

	// Label Ticket Count in Ticket Table
	@FindBy(css = "a[onclick='submitETAassing();']>span[class='badge']")
	public static WebElement lblCountOfAssignedButNoETA;

	@FindBy(css = "a[class='topLnk'][onclick='fireMyPopup()']")
	public static WebElement tabMyView;

	// Ticket Summary Page

	// Select Open Tab
	@FindBy(linkText = "Open")
	public static WebElement tabOpenInTicketSummary;

	// Select Work In Progress Tab
	@FindBy(linkText = "Work In Progress")
	public static WebElement tabWorkInProgressInTicketSummary;

	// Select SLA Tab
	@FindBy(linkText = "SLA")
	public static WebElement tabSLAInTicketSummary;

	// Select Resolved Tab
	@FindBy(linkText = "Resolved")
	public static WebElement tabResolvedInTicketSummary;

	// Select Requests Open Tab
	@FindBy(css = "a[onclick='submitOpen();']")
	public static WebElement tabRequestsOpenInTicketSummary;

	@FindBy(css = "a[onclick='submitETAassing();']")
	public static WebElement tabAssignedButNoETA;

	// Technician Module //

	// Home Tab of Technician
	@FindBy(css = ".home>a")
	public static WebElement tabHomeOfTechnician;

	// Filter
	// Text box Asset Id
	@FindBy(css = "input[name='m_strAssetID']")
	public static WebElement txtAssetId;

	// Text box Serial Number
	@FindBy(css = "#m_strSearchBySerialNumber")
	public static WebElement txtSerialNumber;

	// Text box Customer
	@FindBy(css = "#m_strCustomerName")
	public static WebElement txtCustomer;

	// Geographical Information

	// Text box Site Code
	@FindBy(css = "input[name='m_strSiteCode']")
	public static WebElement txtSiteCode;

	// Text box Customer Contact Name
	@FindBy(css = "input[name='m_strCustomerContactName']")
	public static WebElement txtCustomerContactName;

	// Text box Customer Contact No
	@FindBy(css = "input[name='m_strCustomerContactNo']")
	public static WebElement txtCustomerContactNo;

	// Text box Customer Contact Email ID
	@FindBy(css = "input[name='m_strCustomerContactEmailID']")
	public static WebElement txtCustomerContactEmailID;

	// Text box Customer Address
	@FindBy(css = "#m_strCustomerAddress")
	public static WebElement txtCustomerAddress;

	// Text box Distance
	@FindBy(css = "input[name='m_strDistance']")
	public static WebElement txtDistance;

	// Text box Average Travel Time
	@FindBy(css = "input[name='m_strAvgTravelTime']")
	public static WebElement txtAverageTravelTime;

	// SLA
	// Text box Customer SLA
	@FindBy(css = "input[name='m_strHCILSla']")
	public static WebElement txtCustomerSLA;

	// Text box Our SLA
	@FindBy(css = "input[name='m_strKSYSSla']")
	public static WebElement txtOurSLA;

	// Text box Response Time
	@FindBy(css = "input[name='m_strAssetSLAResolutionTime']")
	public static WebElement txtResponseTime;

	// Text box Serial No
	@FindBy(css = "input[name='m_strSerialNo']")
	public static WebElement txtSerialNo;

	// Text box Asset Id
	@FindBy(css = "input[name='m_strAssetID']")
	public static WebElement txtAssetIdInProduct;

	// Text box Make
	@FindBy(css = "select[name='m_strMake']")
	public static WebElement txtMakeInProduct;

	// Text box Product Model No
	@FindBy(css = "input[name='m_strProductModelNo']")
	public static WebElement txtProductModelNo;

	// Text box Engineer Code
	@FindBy(css = "input[name='m_strEcode']")
	public static WebElement txtEngineerCode;

	// Text box Engineer Contact
	@FindBy(css = "input[name='m_strEngineercontact']")
	public static WebElement txtEngineerContact;

	// Text box Manager Contact
	@FindBy(css = "input[name='m_strTMContact']")
	public static WebElement txtManagerContact;

	// Text box Engineer Email
	@FindBy(css = "input[name='m_strEngineeremail']")
	public static WebElement txtEngineerEmail;

	// Text box Manager Email
	@FindBy(css = "input[name='m_strTM']")
	public static WebElement txtManager;
	
	// Text box Manager Email
	@FindBy(css = "input[name='m_strTMEmail']")
	public static WebElement txtManagerEmail;

	// Text box Principle Warranty Start Date
	@FindBy(css = "input[name='m_strPrincipleWarantyStartDate']")
	public static WebElement txtPrincipleWarrantyStartDate;

	// Text box Contract Start Date
	@FindBy(css = "input[name='m_strContractStartDate']")
	public static WebElement txtContractStartDate;

	// Text box Contract End Date
	@FindBy(css = "input[name='m_strContractEndDate']")
	public static WebElement txtContractEndDate;

	// Text box Principle Warranty End Date
	@FindBy(css = "input[name='m_strPrincipleWarantyEndDate']")
	public static WebElement txtPrincipleWarrantyEndDate;

	// Text box Installation Date
	@FindBy(css = "input[name='m_strInstallationDate']")
	public static WebElement txtInstallationDate;

	// Text box IP Address
	@FindBy(css = "input[name='m_strAdditionalFieldValue1']")
	public static WebElement txtIPAddress;

	// Text box Address Code
	@FindBy(css = "input[name='m_strAdditionalFieldValue2']")
	public static WebElement txtAddressCode;

	// Text box Address1
	@FindBy(css = "input[name='m_strAdditionalFieldValue3']")
	public static WebElement txtAddress1;
	
	// Text box Address1
	@FindBy(css = "input[name='m_strAdditionalFieldValue4']")
	public static WebElement txtRemark1;

	
	// Dates Contract Start Date
	@FindBy(css = "#fd-dp-1>.datePickerTable>tbody>tr>td")
	public static List<WebElement> dtpContractStartDate;

	// Dates Contract End Date
	@FindBy(css = "#fd-dp-2>.datePickerTable>tbody>tr>td")
	public static List<WebElement> dtpContractEndDate;

	// Dates Principle Warranty Start Date
	@FindBy(css = "#fd-dp-6>.datePickerTable>tbody>tr>td")
	public static List<WebElement> dtpPrincipleWarrantyStartDate;

	// Dates Principle Warranty End Date
	@FindBy(css = "#fd-dp-4>.datePickerTable>tbody>tr>td")
	public static List<WebElement> dtpPrincipleWarrantyEndDate;

	// Dates Installation Date
	@FindBy(css = "#fd-dp-5>.datePickerTable>tbody>tr>td")
	public static List<WebElement> dtpInstallationDate;

	@FindBy(css = "#view_property>ul>li>input")
	public static List<WebElement> lstChkMyView;

	// Row in Ticket Table
	@FindBy(css = "table[class='fht-table fht-table-init']>tbody>tr")
	public static List<WebElement> lstRowInTicketTable;

	// Status in Ticket Table
	@FindBy(css = "table[class='fht-table fht-table-init']>tbody>tr>td:nth-of-type(8)")
	public static List<WebElement> lstStatusInTicketTable;

	// Engineer in Ticket Table
	@FindBy(css = "table[class='fht-table fht-table-init']>tbody>tr>td:nth-of-type(26)")
	public static List<WebElement> lstEngineerInTicketTable;

	// Engineer in Ticket Table
	@FindBy(css = "table[class='fht-table fht-table-init']>tbody>tr>td:nth-of-type(31)")
	public static List<WebElement> lstETADateInTicketTable;
	
	@FindBy(xpath = ".//*[@id='form']/div[2]/table/tbody/tr/td[2]/a")
	public static List<WebElement> lstAssetId;

	

	// Initializing Page Object
	public Objects() {
		PageFactory.initElements(driver, this);
	}

}
