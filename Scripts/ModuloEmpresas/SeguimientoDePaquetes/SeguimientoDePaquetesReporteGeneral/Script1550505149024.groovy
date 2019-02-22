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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://sandbox.chazki.com/')

WebUI.clearText(findTestObject('SeguimientoPaquetes/Page_Ataribox/UserName'))

WebUI.sendKeys(findTestObject('SeguimientoPaquetes/Page_Ataribox/UserName'), 'chazki_peru')

WebUI.sendKeys(findTestObject('SeguimientoPaquetes/Page_Ataribox/Password'), 'hviveso02')

WebUI.maximizeWindow()

WebUI.click(findTestObject('SeguimientoPaquetes/Page_Ataribox/button_Ingresar'))

WebUI.click(findTestObject('SeguimientoPaquetes/Page_Ataribox/Button_menu'))

WebUI.click(findTestObject('SeguimientoPaquetes/Page_Ataribox/Mdulo de Empresa'))

WebUI.delay(5)

WebUI.click(findTestObject('SeguimientoPaquetes/Page_Ataribox/Seguimiento de Paquetes'))

WebUI.delay(10)

WebUI.click(findTestObject('SeguimientoPaquetes/Page_Ataribox/label_1SPOT E.I.R.L.'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('SeguimientoPaquetes/Page_Ataribox/Page_Ataribox/Page_Ataribox/Empresa'), 'Claro')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('SeguimientoPaquetes/Page_Ataribox/Page_Ataribox/Page_Ataribox/Empresa'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('SeguimientoPaquetes/Page_Ataribox/Page_Ataribox/Page_Ataribox/Sucursal'))

WebUI.delay(5)

WebUI.click(findTestObject('SeguimientoPaquetes/Page_Ataribox/Page_Ataribox/Page_Ataribox/Todas_Sucursal'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('SeguimientoPaquetes/Page_Ataribox/Page_Ataribox/Page_Ataribox/Page_Ataribox/Page_Ataribox/Codigo de seguimiento'), 
    '9674289852019-01-14 16:57:09R')

WebUI.delay(2)

WebUI.click(findTestObject('SeguimientoPaquetes/Page_Ataribox/Page_Ataribox/Page_Ataribox/Page_Ataribox/Page_Ataribox/button_BUSCAR'))

