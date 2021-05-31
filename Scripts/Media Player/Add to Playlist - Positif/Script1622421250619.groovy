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

//Open Youtube Music
WebUI.openBrowser("https://music.youtube.com/")

//Maximize Window
WebUI.maximizeWindow()

//Click Menu Home
WebUI.click(findTestObject('Object Repository/Home/menuHome'))

//Scroll to Element
WebUI.scrollToElement(findTestObject('Object Repository/Media Player/scrollElement'),0)

//Click Media Banner
WebUI.click(findTestObject('Object Repository/Home/mediaBanner'))

//Wait Media Player Present
WebUI.waitForElementPresent(findTestObject('Object Repository/Home/mediaPlayer'), 0)

//Wait Ads
WebUI.delay(15)

//Click button Option
WebUI.waitForElementPresent(findTestObject('Object Repository/Media Player/optionBtn'), 0)
WebUI.click(findTestObject('Object Repository/Media Player/optionBtn'))

//Add to Playlist
WebUI.click(findTestObject('Object Repository/Media Player/addPlaylist'))

//Wait Notif Present
WebUI.waitForElementPresent(findTestObject('Object Repository/Media Player/notifAddQueue'), 0)

//Close Browser
WebUI.closeBrowser()