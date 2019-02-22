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

WebUI.maximizeWindow()

WebUI.clearText(findTestObject('CargaDeCSV/UserName'))

WebUI.sendKeys(findTestObject('CargaDeCSV/UserName'), 'chazki_peru')

WebUI.sendKeys(findTestObject('CargaDeCSV/Contrasena'), '12345678')

WebUI.click(findTestObject('CargaDeCSV/button_Ingresar'))

WebUI.click(findTestObject('CargaDeCSV/ExpandirMenu'))

WebUI.delay(5)

WebUI.click(findTestObject('CargaDeCSV/Operaciones'))

WebUI.click(findTestObject('CargaDeCSV/Cargar CSV'))

WebUI.delay(5)

WebUI.click(findTestObject('CargaDeCSV/button_Nuevo'))

WebUI.delay(5)

WebUI.click(findTestObject('CargaDeCSV/SeleccioneNegocio'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('CargaDeCSV/IngresarSocioNegocio'), 'tuenti')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('CargaDeCSV/IngresarSocioNegocio'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('CargaDeCSV/SeleccioneAlmacen'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('CargaDeCSV/IngresarAlmacen'), 'TUENTI')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('CargaDeCSV/IngresarAlmacen'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('CargaDeCSV/input_Subir CSV_ng-star-insert'), 'C:\\\\Users\\\\Administrator\\\\Desktop\\\\TUENTI_13.csv')

WebUI.delay(2)

WebUI.click(findTestObject('CargaDeCSV/Subir CSV'))

WebUI.delay(2)

WebUI.click(findTestObject('CargaDeCSV/Page_Ataribox/button_Continuar'))

WebUI.delay(2)

WebUI.click(findTestObject('CargaDeCSV/Page_Ataribox/button_Yes'))

WebUI.delay(2)

WebUI.click(findTestObject('CargaDeCSV/Page_Ataribox/button_Finalizar'))

WebUI.delay(2)

WebUI.click(findTestObject('CargaDeCSV/Page_Ataribox/button_Yes'))

WebUI.acceptAlert()

