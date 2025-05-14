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
import auth.Login as Login

Login login = new Login()

login.loginToEklipse()

WebUI.verifyElementClickable(findTestObject('AccountSetting_Page_Object/Page_Eklipse/User_Icon'))

WebUI.click(findTestObject('AccountSetting_Page_Object/Page_Eklipse/User_Icon'))

WebUI.verifyElementVisible(findTestObject('AccountSetting_Page_Object/Page_Eklipse/Account_Profile'))

WebUI.click(findTestObject('AccountSetting_Page_Object/Page_Eklipse/button_Account Settings'))

String AccountSet = WebUI.getUrl()

WebUI.verifyMatch(AccountSet, 'https://app.eklipse.gg/account.*', true)

WebUI.verifyElementVisible(findTestObject('AccountSetting_Page_Object/Page_Eklipse/AccountSetting_Dashboard'))

WebUI.verifyElementVisible(findTestObject('AccountSetting_Page_Object/Page_Eklipse/Personal_Details'))

WebUI.verifyElementVisible(findTestObject('AccountSetting_Page_Object/Page_Eklipse/Plugin_Setting'))

WebUI.click(findTestObject('AccountSetting_Page_Object/Page_Eklipse/Plugin_Setting'))

WebUI.verifyElementVisible(findTestObject('AccountSetting_Page_Object/Page_Eklipse/Game_Setting'))

WebUI.click(findTestObject('AccountSetting_Page_Object/Page_Eklipse/Game_Setting'))

WebUI.click(findTestObject('AccountSetting_Page_Object/Page_Eklipse/Personal_Details'))

WebUI.click(findTestObject('AccountSetting_Page_Object/Page_Eklipse/button_Connect'))

WebUI.waitForPageLoad(0)

WebUI.back()

WebUI.click(findTestObject('AccountSetting_Page_Object/Page_Eklipse/User_Icon'))

WebUI.click(findTestObject('AccountSetting_Page_Object/Page_Eklipse/button_Account Settings'))

WebUI.scrollToElement(findTestObject('AccountSetting_Page_Object/Page_Eklipse/Profile_Setting'), 0)

WebUI.click(findTestObject('AccountSetting_Page_Object/Page_Eklipse/input_Name'))

WebUI.setText(findTestObject('AccountSetting_Page_Object/Page_Eklipse/input_Name'), 'TestDummy')

WebUI.click(findTestObject('AccountSetting_Page_Object/Page_Eklipse/button_Save Changes'))

WebUI.waitForElementVisible(findTestObject('AccountSetting_Page_Object/Page_Eklipse/UpdatedProfile_PopUp'), 0)

WebUI.click(findTestObject('AccountSetting_Page_Object/Page_Eklipse/button_Continue'))

WebUI.executeJavaScript('window.scrollTo(0, 0);', null)

WebUI.delay(1)

WebUI.closeBrowser()

