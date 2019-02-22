import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bhfl--qav4.cs76.my.salesforce.com/')

WebUI.setText(findTestObject('Object Repository/Page_Login  Salesforce/input_Username_username'), 'mayur.nikam_v2@bajajfinserv.in.qav4')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_pw'), '5rqNrLVzz35XOy6DzKaLBw==')

WebUI.click(findTestObject('Object Repository/Page_Login  Salesforce/input_Password_Login'))

WebUI.click(findTestObject('Object Repository/Page_Salesforce - Enterprise Editio/a_Prospects'))

WebUI.click(findTestObject('Object Repository/Page_Prospects Home  Salesforce - E/a_PR-0000000950'))

WebUI.click(findTestObject('Object Repository/Page_Prospect PR-0000000950  Salesf/input_Identification Details_n'))

WebUI.click(findTestObject('Object Repository/Page_Identification Edit New Identi/span_--None--Driver LicenseRat'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Identification Edit New Identi/select_--None--Driver LicenseR'), 
    'Voter ID', true)

WebUI.click(findTestObject('Object Repository/Page_Identification Edit New Identi/input_Auto Created_cancel'))

WebUI.closeBrowser()

WebUI.executeJavaScript('', [])

WebUI.authenticate('', '', '', 0)

