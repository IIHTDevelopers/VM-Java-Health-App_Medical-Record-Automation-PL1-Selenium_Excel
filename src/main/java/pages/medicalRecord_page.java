package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class medicalRecord_page extends StartupPage {

	public By getUsernameTextfieldLocator() {
		return By.id("  ");
	}

	public By getPasswordTextboxLocator() {
		return By.xpath("  ");
	}

	public By getSignInButtonLocator() {
		return By.xpath("  ");
	}

	public By getMedicalRecordLocator() {
		return By.xpath("  ");
	}

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

	public By calendarFromDropdown() {
		return By.xpath("  ");
	}

	public By calendarToDropdown() {
		return By.xpath("  ");
	}

	public By getButtonLocatorsBytext(String buttonName) {
		return By.xpath("  ");
	}

	public By searchBarId() {
		return By.id("  ");
	}

	public By getStarIconLocator() {
		return By.xpath("  ");
	}

	public By getAnchorTagLocatorByText(String anchorTagName) {
		return By.xpath("  ");
	}

	public By getRowsOfResult() {
		return By.xpath("  ");
	}

	public By getActualAppointmentDates() {
		return By.xpath("  ");
	}

	public By getDateRangeButton() {
		return By.cssSelector("  ");
	}

	public By getDoctorFilterField() {
		return By.xpath("  ");
	}

	public By getDepartmentFilterDropdown() {
		return By.cssSelector("  ");
	}

	public By getActualDoctorsInResult() {
		return By.xpath("  ");
	}

	public By getActualDepartmentsInResult() {
		return By.xpath("  ");
	}

	public By getDoctorNameOptionInFilter(String doctorName) {
		return By.xpath("  ");
	}

	public By getDoctorFilterDropdownLocator() {
		return By.xpath("  ");
	}

	public By getDepartmentFilterDropdownLocator() {
		return By.xpath("  ");
	}

	public By getDiagnosisDropdownLocator() {
		return By.cssSelector("  ");
	}

	public By getDiagnosisCheckBoxIsSelectedLocator() {
		return By.xpath("  ");
	}

	public By getDiagnosisPendingCheckBoxIsSelectedLocator() {
		return By.xpath("  ");
	}

	public By getDiseaseCategoryDropdownLocator() {
		return By.xpath("  ");
	}

	public By getAllCheckBoxIsSelectedLocator() {
		return By.xpath("  ");
	}

	public By getCurrentPage() {
		return By.xpath("  ");
	}

	public By getInpatientSeviceRequest() {
		return By.cssSelector("  ");
	}

	public By getBirthDetailsHeading() {
		return By.xpath("  ");
	}

	public By getPopUpMessageText(String msgStatus, String messageText) {
		return By.xpath("  ");
	}

	public By popupCloseButton() {
		return By.cssSelector("  ");
	}

	public By getCertificateButtonLocator(String patientName) {
		return By.xpath("  ");
	}

	public By getBirthCertificateModalHeading() {
		return By.cssSelector("   ");
	}

	public By getLocatorById(String id) {
		return By.id(null);
	}

	public By getBirthListTableLocator() {
		return By.xpath("  ");
	}

	public By getFinalDiagTextLocator() {
		return By.xpath("  ");
	}

	public By getAddFinalDiagnosisButtonForPatient(String patientName) {
		return By.xpath(" ");
	}

	public By getAddFinalDiagnosisModalCancelButton() {
		return By.xpath("  ");
	}

	public By getEditFinalDiagnosisButtonForPatient(String patientName) {
		return By.xpath("  ");
	}

	public By getDiagnosisDropdownLocatorInModal() {
		return By.xpath("  ");
	}

	public By favouriteOrStarIconMedicalRecord() {
		return By.xpath("  ");
	}

	public By getAppointmentTabLocator() {
		return By.xpath("  ");
	}

	public By getCounters() {
		return By.xpath("  ");
	}

	public By getNewPatientFirstNameField() {
		return By.xpath("  ");
	}

	public By getNewPatientLastNameField() {
		return By.xpath("  ");
	}

	public By getReligionSelectDropdown() {
		return By.xpath("  ");
	}

	public By getAgeFieldInModal() {
		return By.xpath("  ");
	}

	public By getGenderSelectDropdown() {
		return By.xpath("  ");
	}

	public By getPhoneNumberField() {
		return By.xpath("  ");
	}

	public By getDoctorFieldInModal() {
		return By.xpath("  ");
	}

	public By getBillReceipt() {
		return By.xpath("  ");
	}

	public By getAllRows() {
		return By.xpath("  ");
	}

	public By getPrintInvoiceButton() {
		return By.xpath("  ");
	}

	public By getPatientNameInOutPatientByIndex(int index) {
		return By.xpath("  ");
	}

	public By getDepartmentInOutPatientByIndex(int index) {
		return By.xpath("  ");
	}

	public By getDoctorNameInOutPatientByIndex(int index) {
		return By.xpath("  ");
	}

	public By getAddFinalDiagLocator() {
		return By.xpath("  ");
	}

	public By getEditFinalDiagLocator() {
		return By.xpath("  ");
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
	 * @Test4.2 @Test7.2 about this method
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
	 * @Test5 @Test6.1 @Test7.1 about this method
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
	 * @Test7.3 about this method verifyResultsAppointmentDateFallsWithin()
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
	 * @Test8 about this method applyDepartmentFilterAndVerifyResults()
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

	
}
