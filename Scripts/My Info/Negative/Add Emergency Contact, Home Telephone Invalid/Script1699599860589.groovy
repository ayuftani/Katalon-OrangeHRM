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

'memastikan bahwa page sudah terload dan komponen textbox sudah ada'
WebUI.verifyElementVisible(findTestObject('My Info/label_emergencyContact'))

'click komponen textbox'
WebUI.click(findTestObject('My Info/label_emergencyContact'))

'click button add emergency contact'
WebUI.click(findTestObject('My Info/button_addEmergencyContact'), FailureHandling.STOP_ON_FAILURE)

'screenshot sebelum pengisian field'
WebUI.takeScreenshot()

'verifikasi field relationship sudah tampil'
WebUI.verifyElementVisible(findTestObject('My Info/textbox_nameEmergencyContact'))

'click textbox relationship'
WebUI.click(findTestObject('My Info/textbox_nameEmergencyContact'))

'set text \'Mary\' pada textbox Name'
WebUI.setText(findTestObject('My Info/textbox_nameEmergencyContact'), 'Mary')

'click textbox relationship'
WebUI.click(findTestObject('My Info/textbox_relationshipEmergencyContact'))

'set text \'Wife\' pada textbox relationship'
WebUI.setText(findTestObject('My Info/textbox_relationshipEmergencyContact'), 'Wife')

'click textbox home telephone'
WebUI.click(findTestObject('My Info/textbox_homeTelephoneEmergencyContact'))

'set text textbox home telephone'
WebUI.setText(findTestObject('My Info/textbox_homeTelephoneEmergencyContact'), '08123123123@@')

'click textbox mobile emergency contact'
WebUI.click(findTestObject('My Info/textbox_mobileEmergencyContact'))

'set text home telephone emergency  contact'
WebUI.setText(findTestObject('My Info/textbox_mobileEmergencyContact'), '08456456456##')

'click textbox work emergency contact'
WebUI.click(findTestObject('My Info/textbox_workEmergencyContact'))

'set text work emergency contact'
WebUI.setText(findTestObject('My Info/textbox_workEmergencyContact'), '08789789789%%')

'screenshot setelah pengisian semua field'
WebUI.takeScreenshot()

'click button save emergency contact'
WebUI.click(findTestObject('My Info/button_saveEmergencyContact'))

WebUI.comment('Akan tampil notifikasi input nomor telepon invalid')

