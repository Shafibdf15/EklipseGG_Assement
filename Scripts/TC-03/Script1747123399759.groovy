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

WebUI.waitForElementVisible(findTestObject('Dashboard-Object/Page_Eklipse/Eklipse_Dashboard'), 0)

WebUI.waitForElementVisible(findTestObject('Dashboard-Object/Page_Eklipse/DashboardHeader'), 0)

WebUI.waitForElementClickable(findTestObject('Dashboard-Object/Page_Eklipse/user_nav'), 0)

WebUI.click(findTestObject('Dashboard-Object/Page_Eklipse/home_nav'))

WebUI.click(findTestObject('Dashboard-Object/Page_Eklipse/Import_Streams'))

WebUI.waitForElementVisible(findTestObject('Dashboard-Object/Page_Eklipse/ImportStream_Modal'), 0)

WebUI.click(findTestObject('Dashboard-Object/Page_Eklipse/Upload_video_option'))

WebUI.waitForElementVisible(findTestObject('Dashboard-Object/Page_Eklipse/Upload_Modal'), 0)

WebUI.click(findTestObject('Dashboard-Object/Page_Eklipse/import_close'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Dashboard-Object/Page_Eklipse/AI_Edit'))

WebUI.click(findTestObject('Dashboard-Object/Page_Eklipse/close_button'))

WebUI.click(findTestObject('Dashboard-Object/Page_Eklipse/ConvertVertical_Format'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Dashboard-Object/Page_Eklipse/SharePost'))

WebUI.waitForElementVisible(findTestObject('Dashboard-Object/Page_Eklipse/close_button'), 0)

WebUI.click(findTestObject('Dashboard-Object/Page_Eklipse/close_button'))

WebUI.click(findTestObject('Dashboard-Object/Page_Eklipse/input_url'))

WebUI.click(findTestObject('Dashboard-Object/Page_Eklipse/VideoList'))

WebUI.click(findTestObject('Dashboard-Object/Page_Eklipse/button_Import'))

WebUI.waitForElementVisible(findTestObject('Dashboard-Object/Page_Eklipse/ImportVod'), 0)

WebUI.click(findTestObject('Dashboard-Object/Page_Eklipse/button_Cancel'))

WebUI.verifyElementVisible(findTestObject('Dashboard-Object/Page_Eklipse/Connect_for_ultimate_experience'))

WebUI.click(findTestObject('Dashboard-Object/Page_Eklipse/Connect_for_ultimate_experience'))

WebUI.verifyElementVisible(findTestObject('Dashboard-Object/Page_Eklipse/ConnectAccount_Modal'))

WebUI.click(findTestObject('Dashboard-Object/Page_Eklipse/button_Connect'))

WebUI.waitForPageLoad(0)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.closeBrowser()

