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

WebUI.waitForElementVisible(findTestObject('Login/label_Dashboard'), 0)

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Admin/Add User/button_menuAdmin'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Admin/Add User/button_menuAdmin'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/Add User/button_menuAdmin'))

WebUI.takeScreenshot()

WebUI.waitForElementVisible(findTestObject('Admin/Add User/label_menuAdmin'), 0)

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Admin/Add User/button_addUser'))

WebUI.verifyElementClickable(findTestObject('Admin/Add User/button_addUser'))

WebUI.click(findTestObject('Admin/Add User/button_addUser'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Admin/Add User/select_userRole'))

WebUI.click(findTestObject('Admin/Add User/select_userRole'))

WebUI.sendKeys(findTestObject('Admin/Add User/select_userRole'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Admin/Add User/select_userRole'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Admin/Add User/select_Status'))

WebUI.click(findTestObject('Admin/Add User/select_Status'))

WebUI.sendKeys(findTestObject('Admin/Add User/select_Status'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Admin/Add User/select_Status'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot()

WebUI.setText(findTestObject('Admin/Add User/textbox_employeeName'), 'Paul')

WebUI.waitForElementVisible(findTestObject('Admin/Add User/select_employeeName'), 0)

WebUI.click(findTestObject('Admin/Add User/select_employeeName'))

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Admin/Add User/textbox_Password'))

WebUI.setText(findTestObject('Admin/Add User/textbox_Password'), 'testing2023')

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Admin/Add User/textbox_confirmPassword'))

WebUI.setText(findTestObject('Admin/Add User/textbox_confirmPassword'), 'testing2023')

WebUI.takeScreenshot()

WebUI.verifyElementVisible(findTestObject('Admin/Add User/button_Save'))

WebUI.verifyElementClickable(findTestObject('Admin/Add User/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/Add User/button_Save'))

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Admin/Add User/label_requiredUsername'), 0)

WebUI.delay(10)

WebUI.takeScreenshot()

