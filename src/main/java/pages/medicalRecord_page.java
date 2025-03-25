package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class medicalRecord_page extends StartupPage {

//	TC-1 Locators
	public By getUsernameTextfieldLocator = null;
	public By getPasswordTextboxLocator = null;
	public By getSignInButtonLocator = null;
	public By getMedicalRecordLocator = null;
//	TC-2 Locators
	public By getAnchorTagLocatorByText = null;
	public By calendarFromDropdown = null;
	public By calendarToDropdown = null;	
	public By getButtonLocatorsBytext = null;
	public By searchBarId = null;
//	TC-4 Locators
	public By getRowsOfResult = null;
//	TC-5 Locators
	public By getActualAppointmentDates = null;
//	TC-6 Locators
	public By getDepartmentFilterDropdownLocator = null;
	public By getDepartmentFilterDropdown = null;
	public By getActualDepartmentsInResult = null;
	
	public medicalRecord_page(WebDriver driver) {
		super(driver);
	}

	/**
	 * @Test1.1 about this method loginTohealthAppByGivenValidCredetial()
	 * 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in
	 *              button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		//write your logic here
		return false;
	}
	
	/**
	 * @Test1.2 about this method visitMedicalRecordTab()
	 * 
	 * @param : null
	 * @description : verify the medicalRecord tab and click it
	 * @return : String
	 * @author : YAKSHA
	 */
	public void visitMedicalRecordTab() throws Exception {
		//write your logic here
	}
	

	/**
	 * @Test1.3 about this method verifyMedicalRecordPageUrl()
	 * 
	 * @param : null
	 * @description : verify medicalRecord page url
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyMedicalRecordPageUrl() throws Exception {
		//write your logic here
				return null;
	}

	/**
	 * @Test2 about this method highlightAndVerifyWhetherElementIsDisplayed
	 * 
	 * @param element : By - Locator of the element to be highlighted and verified
	 * @description : This method verifies whether an element is displayed on the
	 *              page, highlights it if displayed, and returns true if displayed.
	 * @return : boolean - true if the element is displayed, otherwise false
	 * @author : YAKSHA
	 */
	public boolean highlightAndVerifyWhetherElementIsDisplayed(By element) {
		//write your logic here
				return false;
	}



	/**
	 * @Test3.1 about this method clickAnchorButtonByText()
	 * 
	 * @param : null
	 * @description : Clicks Anchor button through its text
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public boolean clickAnchorButtonByText(String textOfAnchorButton) throws Exception {
		//write your logic here
				return false;
	}
	
	/**
	 * about this method clickButtonByText()
	 * 
	 * @param buttonText : String - The text of the button to be clicked
	 * @description : This method locates a button using its text and performs a
	 *              click action on it. If the button is found, it is highlighted
	 *              before the click action. In case of failure (e.g., button not
	 *              found or click error), an error message is printed and an
	 *              exception is thrown.
	 * @return : boolean - Returns true if the button is successfully clicked.
	 * @throws : Exception - if there is an issue finding the button or performing
	 *           the click action.
	 * @author : YAKSHA
	 */
	public boolean clickButtonByText(String buttonText) throws Exception {
		//write your logic here
				return false;
	}
	
	/**
	 * @Test3.2, @test5.2 about this method
	 * applyDateFilter()
	 * 
	 * @param : String, String
	 * @description : Applies the date filter with date range
	 * @return : void
	 * @throws : Exception - if there is an issue finding or filling the date fields
	 * @author : YAKSHA
	 */
	public boolean applyDateFilter(String fromDate, String toDate) throws Exception {
		//write your logic here
				return false;
	}
	
	/**
	 * @Test3.3 about this method
	 * verifyIfInputFieldsDropdownsAndCheckboxesAreVisibleOrNot()
	 * 
	 * @param : null
	 * @description : This method verifies the visibility of various UI components
	 *              on the page, including buttons, input fields, dropdowns, and
	 *              checkboxes.
	 * @return : boolean - Returns true if all specified UI components are
	 *         displayed, otherwise false.
	 * @throws : Exception - if there is an issue finding any of the UI components.
	 * @author : YAKSHA
	 */
	public boolean verifyIfInputFieldsDropdownsAndCheckboxesAreVisibleOrNot() throws Exception {
		//write your logic here
				return false;
	}





	/**
	 * @Test4, @test5.1 about this method
	 *        verifyUrlContains()
	 * 
	 * @param buttonName      : String - The name of the button that will be clicked
	 *                        to navigate to a different URL.
	 * @param urlTextToVerify : String - The partial URL text to verify after
	 *                        clicking the button.
	 * @description : This method locates a button by its text, clicks on it, and
	 *              then checks if the resulting URL contains the specified text. It
	 *              ensures that the correct navigation has occurred.
	 * @return : boolean - Returns true if the URL contains the specified text,
	 *         otherwise false.
	 * @throws : Exception - if there is an issue finding the button, clicking it,
	 *           or verifying the URL.
	 * @author : YAKSHA
	 */
	public boolean verifyUrlContains(String buttonName, String urlTextToVerify) throws Exception {
		//write your logic here
				return false;
	}



	/**
	 * @Test5.3 about this method verifyResultsAppointmentDateFallsWithin()
	 * 
	 * @param fromDate : String - The starting date of the range in "dd-MM-yyyy"
	 *                 format.
	 * @param toDate   : String - The ending date of the range in "dd-MM-yyyy"
	 *                 format.
	 * @description : This method verifies that all appointment dates in the result
	 *              fall within the specified date range.
	 * @return : boolean - true if all appointment dates are within the specified
	 *         range, otherwise false.
	 * @throws : Exception - if there is an issue parsing the dates or verifying the
	 *           results.
	 * @author : YAKSHA
	 */
	public boolean verifyResultsAppointmentDateFallsWithin(String fromDate, String toDate) throws Exception {
		//write your logic here
				return false;
	}



	/**
	 * @Test6 about this method applyDepartmentFilterAndVerifyResults()
	 * 
	 * @param departmentName - The name of the department to filter by.
	 * @description : This method applies a department filter by department name and
	 *              verifies if the results contain only the selected department.
	 * @return boolean - true if all results contain the selected department name,
	 *         otherwise false.
	 * @throws Exception - if there is an issue finding the dropdown, selecting its
	 *                   values, or verifying the results.
	 * @author : YAKSHA
	 */
	public boolean applyDepartmentFilterAndVerifyResults(String departmentName) throws Exception {
		//write your logic here
				return false;
	}

	
}