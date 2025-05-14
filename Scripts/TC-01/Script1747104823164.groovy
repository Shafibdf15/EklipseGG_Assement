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

WebUI.verifyMatch(WebUI.getWindowTitle(), 'Eklipse - Convert Twitch Clip To TikTok, Reels, & Shorts For Free', false)

WebUI.verifyElementVisible(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/header'))

WebUI.verifyElementClickable(findTestObject('Object Repository/LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/img_Features_logo-desktop'))

WebUI.verifyElementClickable(findTestObject('Object Repository/LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/span_Features'))

WebUI.click(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/span_Features'))

WebUI.back()

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Object Repository/LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/span_Use Case'))

WebUI.click(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/span_Use Case'))

WebUI.verifyElementClickable(findTestObject('Object Repository/LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/span_Discovery'))

WebUI.click(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/span_Discovery'))

WebUI.verifyElementClickable(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/a_Premium'))

WebUI.click(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/a_Premium'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('LandingPage_Object/Page_Eklipse Premium - Level up with Eklipse Premium/Eklipse_Plan'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementClickable(findTestObject('Object Repository/LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/a_Sign In'))

WebUI.verifyElementClickable(findTestObject('Object Repository/LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/a_Sign Up For Free'))

WebUI.verifyElementPresent(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/Tagline_Obejct'), 
    0)

WebUI.scrollToElement(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/a_Download App'), 
    0)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/a_Download App'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/AiPowered_Clips'), 
    0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/features'), 
    0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/Studio'), 
    0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/ContentPlanner'), 
    0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/Premium_Features'), 
    0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/QA_Sec'), 0)

WebUI.waitForElementVisible(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/QA_Sec'), 
    5)

WebUI.click(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/Q2'))

WebUI.click(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/Q3'))

WebUI.scrollToElement(findTestObject('LandingPage_Object/Page_Eklipse - Convert Twitch Clip To TikTo_e9e049/TrialAdvert'), 
    5)

WebUI.closeBrowser()

