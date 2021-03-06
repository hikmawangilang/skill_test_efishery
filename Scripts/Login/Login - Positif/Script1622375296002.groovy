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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//Open Youtube Music
WebUI.openBrowser("https://music.youtube.com/")

//Maximize Window
WebUI.maximizeWindow()

//Click button Sign In
WebUI.click(findTestObject('Object Repository/btnSignIn'))

//Input Username
WebUI.setText(findTestObject('Object Repository/fieldEmailSignIn'), 'akbargilang98@gmail.com')

WebUI.closeBrowser()

////Click Button Next
//WebUI.click(findTestObject('Object Repository/btnNextSignIn'))
//
////Input Password
//WebUI.setText(findTestObject('Object Repository/fieldPassSignIn'), 'lalalala')
//
////Click Button Next
//WebUI.click()(findTestObject('Object Repository/btnNextPass'))
//
////Close Browser
//WebUI.closeBrowser()
