package pages;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class medicalRecord_page extends StartupPage {
	
	public By getPageBarFixedLocator(String navBarName) {
		if (navBarName.equalsIgnoreCase("mr outpatient list")) {
			navBarName = "MR Outpatient List";
		} else if (navBarName.equalsIgnoreCase("mr inpatient list")) {
			navBarName = "MR Inpatient List";
		} else if (navBarName.equalsIgnoreCase("birth list")) {
			navBarName = "Birth List";
		} else if (navBarName.equalsIgnoreCase("death list")) {
			navBarName = "Death List";
		} else if (navBarName.equalsIgnoreCase("reports")) {
			navBarName = "Reports";
		} else if (navBarName.equalsIgnoreCase("emergency patient list")) {
			navBarName = "Emergency Patient List";
		}
		return By.xpath("  ");

	}
	
	public By getAnchorTagLocatorByText(String anchorTagName) {
		return By.xpath(" ");
	}


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
		
		return false;
	}

	/**
	 * @Test3 about this method verifyUrlMedicalRecordModule()
	 * 
	 * @description This method verifies that the "MR Inpatient List" tab is present
	 *              in the MedicalRecord module and returns the current URL of the
	 *              page.
	 * @return String - The current URL of the page after verifying the "MR
	 *         Inpatient List "tab.
	 * @throws Exception - If there is an issue locating the "MR Inpatient List" tab
	 *                   or verifying its text.
	 * @autor YAKSHA
	 */
	public String verifyUrlMedicalRecordModule() throws Exception {
			return null;
	}

	/**
	 * @Test4.1 about this method clickAnchorButtonByText()
	 * 
	 * @param : null
	 * @description : Clicks Anchor button through its text
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public boolean clickAnchorButtonByText(String textOfAnchorButton) throws Exception {
		return false;
	}

	/**
	 * @Test4.2 @Test7.2 @Test11.1 @Test14.1 @Test15.1 about this method
	 * applyDateFilter()
	 * 
	 * @param : String, String
	 * @description : Applies the date filter with date range
	 * @return : void
	 * @throws : Exception - if there is an issue finding or filling the date fields
	 * @author : YAKSHA
	 */
	public boolean applyDateFilter(String fromDate, String toDate) throws Exception {
		
		return false;
	}

	/**
	 * @Test4.3 about this method
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
				return false;
	}

	/**
	 * @Test5 @Test6.1 @Test7.1 @Test8.1 @Test9.1 about this method
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
		return false;
	}

	/**
	 * @Test6.2 about this method searchAndVerifyKeywordInEveryResult()
	 * 
	 * @param keywordToVerify : String - The text or keyword to search for and
	 *                        verify in the results.
	 * @description : This method searches with the provided keyword and verifies if
	 *              every row in the result contains at least one cell that includes
	 *              the keyword.
	 * @return : boolean - true if the keyword is found in every row, otherwise
	 *         false.
	 * @throws : Exception - if there is an issue finding the search bar or
	 *           verifying the results.
	 * @author : YAKSHA
	 */
	public boolean searchAndVerifyKeywordInEveryResult(String keywordToVerify) throws Exception {
		return false;
		
	}

	/**
	 * @Test8.2 about this method clickDateRangeDropdownAndSelect()
	 * 
	 * @param valueToSelect : String - The text of the value to select from the
	 *                      dropdown.
	 * @description : This method clicks on the date range button, selects a value
	 *              by its text, and verifies if the selection was successful.
	 * @return : boolean - true if the intended value is successfully selected,
	 *         otherwise false.
	 * @throws : Exception - if there is an issue finding the dropdown or its
	 *           values.
	 * @author : YAKSHA
	 */
	public boolean clickDateRangeDropdownAndSelect(String valueToSelect) throws Exception {
		return false;
		
	}

	/**
	 * @Test7.3 @Test8.3 about this method verifyResultsAppointmentDateFallsWithin()
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
		return false;
	}

	/**
	 * @Test9.2 about this method applyDoctorFilterAndVerifyResults()
	 * 
	 * @param doctorName : String - Name of the Doctor to filter by.
	 * @description : This method applies a doctor filter by the specified name and
	 *              verifies if the results contain only the selected doctor.
	 * @return : boolean - true if all results contain the selected doctor's name,
	 *         otherwise false.
	 * @throws : Exception - if there is an issue finding the dropdown or its
	 *           values.
	 * @author : YAKSHA
	 */
	public boolean applyDoctorFilterAndVerifyResults(String doctorName) throws Exception {
		return false;
	}

	/**
	 * @Test10 about this method applyDepartmentFilterAndVerifyResults()
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
		return false;
		
	}

	/**
	 * @Test11.2 about this method scrollAllTheWayDown()
	 * 
	 * @param : null
	 * @description : This method vertically scrolls the screen to the bottom
	 * @return : boolean - true if successfully scrolled down and false if not
	 *         scrolled
	 * @throws : Exception - if there is an issue while scrolling
	 * @author : YAKSHA
	 */
	public boolean scrollAllTheWayDown() throws Exception {
		return false;
		
	}

	/**
	 * @Test11.4 @Test11.6 about this method clickButtonByText()
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
		return false;
		
	}

	/**
	 * @Test11.3 @Test11.5 about this method verifyCurrentPageIs()
	 * 
	 * @param expectedCurrentPage : String - The expected text that should be
	 *                            present on the current page to verify its
	 *                            correctness.
	 * @description : This method verifies whether the current page matches the
	 *              expected page by checking the text of a specific element. If the
	 *              text matches the expected value, the method returns true,
	 *              otherwise it returns false.
	 * @return : boolean - true if the current page matches the expected page, false
	 *         otherwise.
	 * @throws : Exception - if there is an issue finding the element or performing
	 *           the text comparison.
	 * @author : YAKSHA
	 */
	public boolean verifyCurrentPageIs(String expectedCurrentPage) throws Exception {
		return false;	
		
	}

	/**
	 * @Test12 about this method verifyDataIsFilteredAccordingToSelectedDiagnosis()
	 * 
	 * @param diagCode               - The diagnosis code to filter the data.
	 * @param expectedFinalDiagvalue - The expected final diagnosis value to verify
	 *                               against.
	 * @description : This method verifies that the data is filtered according to
	 *              the selected diagnosis code.
	 * @return : boolean - Returns true if the data is correctly filtered, otherwise
	 *         false.
	 * @throws : Exception - If there is an issue finding or interacting with
	 *           elements, a meaningful error message is thrown.
	 * @author : YAKSHA
	 */
	public boolean verifyDataIsFilteredAccordingToSelectedDiagnosis(String diagCode, String expectedFinalDiagvalue) {
		return false;
		
	}

	/**
	 * @Test13 about this method verifyDiagnosisAddedCheckboxFunctionality()
	 * 
	 * @param diagCode               : String - The diagnosis code to be selected
	 *                               and filtered.
	 * @param expectedFinalDiagvalue : String - The expected final diagnosis value
	 *                               that should be present after filtering.
	 * @description : This method verifies that the data in the MR Inpatient and MR
	 *              Outpatient lists is correctly filtered according to the selected
	 *              diagnosis code.
	 * @return : boolean - Returns true if the data is filtered correctly, otherwise
	 *         false.
	 * @throws : Exception - If any issue occurs during the filtering process.
	 * @author : YAKSHA
	 */
	public boolean verifyDiagnosisAddedCheckboxFunctionality(String expectedBtnName) {
		return false;	
		
	}

	/**
	 * @Test14.2 about this method
	 * clickAddFinalDiadnosisAndVerifyModalOpensAndCloseIt()
	 * 
	 * @param null
	 * @description : This method clicks on the Add Diadnosis button, verifies that
	 *              the Add Final Diagnosis modal is open and closes it
	 * @return : boolean - Returns true if the modal is visible and false if it is
	 *         not
	 * @throws : Exception - If there is an issue finding the button or the modal
	 * @author : YAKSHA
	 */
	public boolean clickAddFinalDiadnosisAndVerifyModalOpensAndCloseIt() throws Exception {
		return false;
		
	}

	/**
	 * @Test15.2 about this method
	 * clickEditFinalDiadnosisAndVerifyModalOpensAndCloseIt()
	 * 
	 * @param null
	 * @description : This method clicks on the Edit Diadnosis button, verifies that
	 *              the Edit Final Diagnosis modal is open and closes it
	 * @return : boolean - Returns true if the modal is visible and false if it is
	 *         not
	 * @throws : Exception - If there is an issue finding the button or the modal
	 * @author : YAKSHA
	 */
	public boolean clickEditFinalDiadnosisAndVerifyModalOpensAndCloseIt() throws Exception {
		return false;
	}

	
}
