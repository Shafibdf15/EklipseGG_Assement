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

WebUI.click(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/a_Clip Library'))

WebUI.waitForElementClickable(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/button_Understand'), 0)

WebUI.click(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/button_Understand'))

WebUI.click(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/a_StreamVideo'))

WebUI.waitForElementPresent(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/StreamDashboard'), 0)

WebUI.click(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/ConnectStreamService'))

WebUI.verifyElementVisible(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/ConnectAccount_Modal'))

WebUI.click(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/button_Connect'))

WebUI.waitForPageLoad(0)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/a_StreamVideo'))

WebUI.click(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/ExternalSource_Vod'))

WebUI.verifyElementVisible(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/ImportStream_Modal'))

WebUI.click(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/Upload_video_options'))

WebUI.verifyElementVisible(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/UploadSections_modal'))

WebUI.verifyElementClickable(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/Upload_button'))

WebUI.click(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/SelectGame'))

WebUI.selectOptionByValue(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/SelectGame'), '231', false)

WebUI.setText(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/input_Video Title_formStreamTitle'), 'TestRun_Vod')

WebUI.click(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/ConfirmVideo_Authorization'))

WebUI.click(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/button_Import Now'))

WebUI.waitForElementVisible(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/Alert_Please choose VoD File'), 0)

WebUI.verifyElementPresent(findTestObject('StreamsLibrary_Section_Object/Page_Eklipse/Alert_Please choose VoD File'), 0)

WebUI.delay(1)

WebUI.closeBrowser()

