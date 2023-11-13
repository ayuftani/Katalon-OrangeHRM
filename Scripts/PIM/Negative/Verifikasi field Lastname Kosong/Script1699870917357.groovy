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

WebUI.verifyElementVisible(findTestObject('PIM/label_menuPIM'))

WebUI.click(findTestObject('PIM/label_menuPIM'))

WebUI.verifyElementClickable(findTestObject('PIM/label_addEmployee'))

WebUI.click(findTestObject('PIM/label_addEmployee'))

WebUI.verifyElementVisible(findTestObject('PIM/textbox_firstName'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('PIM/textbox_firstName'), firstname)

WebUI.verifyElementVisible(findTestObject('PIM/textbox_middleName'))

WebUI.setText(findTestObject('PIM/textbox_middleName'), middlename)

WebUI.verifyElementVisible(findTestObject('PIM/textbox_lastName'))

WebUI.setText(findTestObject('PIM/textbox_lastName'), '')

WebUI.verifyElementVisible(findTestObject('PIM/textbox_employeeId'))

WebUI.setText(findTestObject('PIM/textbox_employeeId'), employeeid)

WebUI.verifyElementClickable(findTestObject('PIM/button_Save'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('PIM/button_Save'))

WebUI.verifyElementVisible(findTestObject('PIM/label_lastnameRequired'))

WebUI.takeScreenshot()

