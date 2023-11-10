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

'click label my info'
WebUI.click(findTestObject('My Info/label_myInfo'))

'screenshot sebelum perubahan'
WebUI.takeScreenshot()

'memastikan bahwa page sudah terload dan komponen textbox sudah ada'
WebUI.verifyElementVisible(findTestObject('My Info/textbox_employeeId'))

'click komponen textbox'
WebUI.click(findTestObject('My Info/textbox_employeeId'))

'keys ctrl+a untuk select all value di textbox'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.CONTROL, 'a'))

'keys backspace untuk delete input textbox yang sudah ada'
WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.BACK_SPACE))

'set text \'1800\' untuk mengganti employee id'
WebUI.setText(findTestObject('My Info/textbox_employeeId'), '1800')

'click button save untuk menyimpan perubahan'
WebUI.click(findTestObject('My Info/button_save'))

WebUI.delay(3)

'screenshot'
WebUI.takeScreenshot()

WebUI.delay(2)

