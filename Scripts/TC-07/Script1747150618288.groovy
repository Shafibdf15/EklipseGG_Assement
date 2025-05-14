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

WebUI.click(findTestObject('Object Repository/AiEdit_Object/Page_Eklipse/div_AI Edit BetaEdit your clips using AI'))

WebUI.click(findTestObject('Object Repository/AiEdit_Object/Page_Eklipse/button_Start AI Edit_1'))

WebUI.waitForElementVisible(findTestObject('Object Repository/AiEdit_Object/Page_Eklipse/div_AI EditBetaInstantly add memes, auto-ca_23ddba'), 
    0)

WebUI.click(findTestObject('Object Repository/AiEdit_Object/Page_Eklipse/BrowseClip Library'))

WebUI.verifyElementVisible(findTestObject('Object Repository/AiEdit_Object/Page_Eklipse/div_Browse Clips for AI EditEdit your clips_0115c4'))

WebUI.click(findTestObject('Object Repository/AiEdit_Object/Page_Eklipse/button_Browse Clips for AI Edit_close-modal'))

WebUI.click(findTestObject('Object Repository/AiEdit_Object/Page_Eklipse/LocalUpload'))

WebUI.verifyElementClickable(findTestObject('Object Repository/AiEdit_Object/Page_Eklipse/button_Upload a Video'))

WebUI.click(findTestObject('Object Repository/AiEdit_Object/Page_Eklipse/button_Browse Clips for AI Edit_close-modal'))

WebUI.click(findTestObject('Object Repository/AiEdit_Object/Page_Eklipse/button_Get Clip'))

WebUI.verifyElementVisible(findTestObject('Object Repository/AiEdit_Object/Page_Eklipse/div_Invalid UrlPlease input the valid clip _feb151'))

WebUI.click(findTestObject('Object Repository/AiEdit_Object/Page_Eklipse/button_Understood'))

WebUI.click(findTestObject('AiEdit_Object/Page_Eklipse/SelectClip_FromTwitch'))

WebUI.verifyElementVisible(findTestObject('AiEdit_Object/Page_Eklipse/SearchStreamer_Modal'))

WebUI.setText(findTestObject('AiEdit_Object/Page_Eklipse/input'), 'Valorant')

WebUI.click(findTestObject('AiEdit_Object/Page_Eklipse/button_Search'))

WebUI.delay(2)

WebUI.click(findTestObject('AiEdit_Object/Page_Eklipse/img_Valorant_channel-avatar'))

WebUI.waitForElementVisible(findTestObject('AiEdit_Object/Page_Eklipse/ClipFound_object'), 0)

WebUI.click(findTestObject('AiEdit_Object/Page_Eklipse/img_Valorant_clip-thumbnail'))

WebUI.waitForPageLoad(0)

WebUI.delay(30)

WebUI.getUrl()

WebUI.verifyElementClickable(findTestObject('Object Repository/AiEdit_Object/Page_Eklipse/button_Generate AI Edit'))

WebUI.closeBrowser()

