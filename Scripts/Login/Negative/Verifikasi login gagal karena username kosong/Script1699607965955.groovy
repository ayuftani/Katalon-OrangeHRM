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

'Membuka web browser'
WebUI.openBrowser('')

'Memperbesar layar web browser'
WebUI.maximizeWindow()

'Masuk ke link yang di tuju'
WebUI.navigateToUrl(GlobalVariable.url)

'Screenshot page login'
WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

'Verifikasi muncul field username'
WebUI.verifyElementVisible(findTestObject('Login/textbox_Username'), FailureHandling.STOP_ON_FAILURE)

'Masukkan username'
WebUI.setText(findTestObject('Login/textbox_Username'), '')

'Screenshot input username'
WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

'Verifikasi muncul field password'
WebUI.verifyElementVisible(findTestObject('Login/textbox_Password'), FailureHandling.STOP_ON_FAILURE)

'Masukkan password'
WebUI.setText(findTestObject('Login/textbox_Password'), GlobalVariable.password)

'Screenshot input password'
WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

'Verifikasi muncul tombol login'
WebUI.verifyElementVisible(findTestObject('Login/button_Login'))

'Verifikasi tombol login bisa di klik'
WebUI.verifyElementClickable(findTestObject('Login/button_Login'))

'Klik tombol login'
WebUI.click(findTestObject('Login/button_Login'))

WebUI.verifyElementVisible(findTestObject('Login/label_requiredUsername'), FailureHandling.STOP_ON_FAILURE)

