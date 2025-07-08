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



WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BlazeDemo/select_Paris            Philadelphia       _54ada8'), 
    'Portland', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BlazeDemo/select_Buenos Aires            Rome        _b23956'), 
    'Rome', true)

WebUI.click(findTestObject('Object Repository/Page_BlazeDemo/input_Choose your destination city_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_BlazeDemo - reserve/input_432.98_btn btn-small'))

WebUI.setText(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_Name_inputName'), 'new')

WebUI.setText(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_Address_address'), 'tester')

WebUI.setText(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_City_city'), 'brazil')

WebUI.setText(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_State_state'), 'san siro')

WebUI.setText(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_Zip Code_zipCode'), '2345')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BlazeDemo Purchase/select_Visa                American Express_d3f7e8'), 
    'amex', true)

WebUI.setText(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_Credit Card Number_creditCardNumber'), '214646272992')

WebUI.setText(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_Year_creditCardYear'), '2026')

WebUI.setText(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_Name on Card_nameOnCard'), 'new tester')

WebUI.click(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_Remember me_rememberMe'))

WebUI.click(findTestObject('Object Repository/Page_BlazeDemo Purchase/input_Remember me_btn btn-primary'))



