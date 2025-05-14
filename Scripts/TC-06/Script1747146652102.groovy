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

WebUI.click(findTestObject('EklipseStudio_Object/Page_Eklipse/Editsubmenu'))

WebUI.click(findTestObject('EklipseStudio_Object/Page_Eklipse/a_Edited Clips'))

WebUI.verifyElementVisible(findTestObject('EklipseStudio_Object/Page_Eklipse/EditedClip_Section'))

WebUI.click(findTestObject('EklipseStudio_Object/Page_Eklipse/button_Understand'))

WebUI.click(findTestObject('EklipseStudio_Object/Page_Eklipse/button_Convert to TikTok  Shorts  Reels'))

String studioEkl = WebUI.getUrl()

WebUI.verifyMatch(studioEkl, 'https://studio.eklipse.gg/.*', true)

WebUI.verifyElementVisible(findTestObject('EklipseStudio_Object/Page_Eklipse studio/AddClip'))

WebUI.click(findTestObject('EklipseStudio_Object/Page_Eklipse studio/InputClip_Url'))

WebUI.setText(findTestObject('EklipseStudio_Object/Page_Eklipse studio/InputClip_Url'), 'test')

WebUI.click(findTestObject('EklipseStudio_Object/Page_Eklipse studio/button_Get Clip'))

WebUI.click(findTestObject('EklipseStudio_Object/Page_Eklipse studio/button_Understood'))

WebUI.verifyElementClickable(findTestObject('EklipseStudio_Object/Page_Eklipse studio/button_From Your Local'))

WebUI.click(findTestObject('EklipseStudio_Object/Page_Eklipse studio/button_From Twitch'))

WebUI.verifyElementVisible(findTestObject('EklipseStudio_Object/Page_Eklipse studio/SearchStreamer_Modal'))

WebUI.setText(findTestObject('EklipseStudio_Object/Page_Eklipse studio/Search_Channel'), 'Valorant')

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('EklipseStudio_Object/Page_Eklipse studio/li_VALORANT'))

WebUI.waitForElementVisible(findTestObject('EklipseStudio_Object/Page_Eklipse studio/Recent_Vod'), 0)

WebUI.click(findTestObject('EklipseStudio_Object/Page_Eklipse studio/preview'))

WebUI.verifyElementVisible(findTestObject('EklipseStudio_Object/Page_Eklipse studio/EditingSection'))

WebUI.waitForElementClickable(findTestObject('EklipseStudio_Object/Page_Eklipse studio/button_Export'), 3)

WebUI.click(findTestObject('EklipseStudio_Object/Page_Eklipse studio/button_Export'))

WebUI.verifyElementVisible(findTestObject('EklipseStudio_Object/Page_Eklipse studio/ExportConfirmation'))

WebUI.verifyElementClickable(findTestObject('EklipseStudio_Object/Page_Eklipse studio/button_Cancel'))

WebUI.verifyElementClickable(findTestObject('EklipseStudio_Object/Page_Eklipse studio/button_Confirm Export'))

WebUI.click(findTestObject('EklipseStudio_Object/Page_Eklipse studio/button_Cancel'))

WebUI.closeBrowser()

