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

//Click Menu Explore
WebUI.click(findTestObject('Object Repository/Explore/exploreMenu'))

//Verify Card Content Present
WebUI.verifyElementPresent(findTestObject('Object Repository/Explore/cardChart'), 0)

//Click Card Chart
WebUI.click(findTestObject('Object Repository/Explore/cardChart'))

//Verify Chart Content Present
WebUI.verifyElementPresent(findTestObject('Object Repository/Explore/filterByCountryChart'), 0)

//Choose Country
WebUI.click(findTestObject('Object Repository/Explore/filterByCountryChart'))

//Scroll Country
WebUI.scrollToElement(findTestObject('Object Repository/Explore/chooseCountry'), 0)

//Click Country
WebUI.click(findTestObject('Object Repository/Explore/chooseCountry'))

WebUI.delay(5)

//Verify Content Section Present
WebUI.scrollToElement(findTestObject('Object Repository/Explore/carouselGenres'), 0)

//Verify Chart
WebUI.verifyTextPresent("United States", false)

//Close Browser
WebUI.closeBrowser()