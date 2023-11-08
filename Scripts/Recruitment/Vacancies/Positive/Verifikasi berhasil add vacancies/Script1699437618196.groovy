import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.verifyElementClickable(findTestObject('Recruitment/label_menuRecruitment'))

WebUI.click(findTestObject('Recruitment/label_menuRecruitment'))

WebUI.verifyElementClickable(findTestObject('Recruitment/Vacancies/label_vacancies'))

WebUI.click(findTestObject('Recruitment/Vacancies/label_vacancies'))

WebUI.verifyElementClickable(findTestObject('Recruitment/Vacancies/button_add'))

WebUI.click(findTestObject('Recruitment/Vacancies/button_add'))

WebUI.verifyElementVisible(findTestObject('Recruitment/Vacancies/textbox_vacancyName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Recruitment/Vacancies/textbox_vacancyName'), 'QA Manual')

WebUI.click(findTestObject('Recruitment/Vacancies/dropdown_job'))

WebUI.waitForElementVisible(findTestObject('Recruitment/Vacancies/dropdown_selectedJob'), 0)

WebUI.click(findTestObject('Recruitment/Vacancies/dropdown_selectedJob'))

WebUI.verifyElementVisible(findTestObject('Recruitment/Vacancies/textarea_description'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Recruitment/Vacancies/textarea_description'), 'Ini adalah vacancy khusus untuk QA Manual dibawah naungan QA Engineer')

WebUI.verifyElementVisible(findTestObject('Recruitment/Vacancies/textbox_hiringManager'))

WebUI.setText(findTestObject('Recruitment/Vacancies/textbox_hiringManager'), 'Linda')

WebUI.waitForElementVisible(findTestObject('Recruitment/Vacancies/textbox_hiringManagerName'), 0)

WebUI.sendKeys(findTestObject('Recruitment/Vacancies/textbox_hiringManager'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Recruitment/Vacancies/textbox_hiringManager'), Keys.chord(Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('Recruitment/Vacancies/textbox_nop'))

WebUI.setText(findTestObject('Recruitment/Vacancies/textbox_nop'), '19')

WebUI.verifyElementClickable(findTestObject('Recruitment/Vacancies/button_submit'))

WebUI.click(findTestObject('Recruitment/Vacancies/button_submit'))

WebUI.verifyElementPresent(findTestObject('Recruitment/Vacancies/label_successAdd'), 0)

