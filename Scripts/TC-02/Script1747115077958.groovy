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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://eklipse.gg/')

WebUI.waitForElementClickable(findTestObject('LoginPage_Object/Page_Eklipse/a_Sign In'), 0)

WebUI.click(findTestObject('LoginPage_Object/Page_Eklipse/a_Sign In'))

WebUI.waitForPageLoad(10)

String loginUrl = WebUI.getUrl()

WebUI.verifyMatch(loginUrl, 'https://app.eklipse.gg/login.*', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/LoginPage_Object/Page_Eklipse/button_Continue with_btn btn-twitch'))

WebUI.verifyElementClickable(findTestObject('Object Repository/LoginPage_Object/Page_Eklipse/button_Continue with_btn-google nic-google'))

WebUI.verifyElementClickable(findTestObject('Object Repository/LoginPage_Object/Page_Eklipse/button_Continue with_kep-login-facebook metro'))

WebUI.verifyElementClickable(findTestObject('LoginPage_Object/Page_Eklipse/button_Continue with_btn btn-xbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/LoginPage_Object/Page_Eklipse/input_OR_username'))

WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage_Object/Page_Eklipse/input_OR_username'), 'Yy9Y8MOdsZH+S77WhTVTV2OImJiatfhg')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage_Object/Page_Eklipse/input_OR_password'), 'P23BKwVnF6dNKL1bSaVYpw==')

WebUI.click(findTestObject('Object Repository/LoginPage_Object/Page_Eklipse/button_Sign In'))

WebUI.waitForPageLoad(10)

WebUI.waitForElementVisible(findTestObject('LoginPage_Object/Page_Eklipse/DashboardHome'), 
    0)

WebUI.verifyMatch(WebUI.getUrl(), 'https://app.eklipse.gg/home.*', true)

WebUI.closeBrowser()

