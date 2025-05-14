package auth

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Login {

	@Keyword
	def loginToEklipse() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://app.eklipse.gg/login/')
		
		WebUI.waitForPageLoad(10)

		// Optional: wait for login input to load
		WebUI.waitForElementVisible(findTestObject('LoginPage_Object/Page_Eklipse/input_OR_username'), 10)

		WebUI.setEncryptedText(findTestObject('LoginPage_Object/Page_Eklipse/input_OR_username'), 'Yy9Y8MOdsZH+S77WhTVTV2OImJiatfhg')
		WebUI.setEncryptedText(findTestObject('LoginPage_Object/Page_Eklipse/input_OR_password'), 'P23BKwVnF6dNKL1bSaVYpw==')
		WebUI.click(findTestObject('LoginPage_Object/Page_Eklipse/button_Sign In'))

		WebUI.waitForPageLoad(10)

		WebUI.waitForElementVisible(findTestObject('LoginPage_Object/Page_Eklipse/DashboardHome'),
				0)

		WebUI.verifyMatch(WebUI.getUrl(), 'https://app.eklipse.gg/home.*', true)

		WebUI.click(findTestObject('Dashboard-Object/Page_Eklipse/button_Skip for now'))

		WebUI.click(findTestObject('Dashboard-Object/Page_Eklipse/button_Accept'))
	}
}