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

WebUI.openBrowser('https://sandbox.chazki.com/#/login')

WebUI.maximizeWindow()

WebUI.clearText(findTestObject('Login/UserName'))

WebUI.sendKeys(findTestObject('Login/UserName'), 'chazki_peru')

WebUI.sendKeys(findTestObject('Login/Contrasena'), '12345678')

WebUI.click(findTestObject('Login/button_Ingresar'))

WebUI.click(findTestObject('Menu/ExpandirMenu'))

WebUI.delay(2)

WebUI.click(findTestObject('Asociados/ModuloAsociados'))

WebUI.delay(3)

WebUI.click(findTestObject('Asociados/Afiliacion/Afiliacion'))

WebUI.delay(5)

WebUI.click(findTestObject('Asociados/Afiliacion/button_Nuevo'))

WebUI.delay(5)

WebUI.click(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/ComboBox-TipoDocumento'))

WebUI.delay(5)

WebUI.click(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/ComboBox-DNI'))

WebUI.delay(2)

WebUI.clearText(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/NumeroDeDocumento-Obligatorio'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/NumeroDeDocumento-Obligatorio'), '1234567891234567')

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/Nombres-Obligatorio'), 'luis')

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/Apelldio Paterno-Obligatorio'), 'chavez')

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/ApellidoMaterno-Obligatorio'), 'porroa')

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/CorreoElectronico-Obligatorio'), 'luisc@chazki.com')

WebUI.click(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/EstadoAsociado-Obligatorio'))

WebUI.click(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/ComboBox-EstadoAsociado-Habilitado'))

WebUI.click(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/Pais-Obligatorio'))

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/IngresePais-Obligatorio'), 'Peru')

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/IngresePais-Obligatorio'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/Departamento-Obligatorio'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/IngreseDepartamento-Obligatorio'), 'LIMA')

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/IngreseDepartamento-Obligatorio'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/Provincia-Obligatorio'))

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/IngreseProvincia-Obligatorio'), 'LIMA')

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/IngreseProvincia-Obligatorio'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/Distrito-Obligatorio'))

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/IngreseDistrito-Obligatorio'), 'LIMA')

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/IngreseDistrito-Obligatorio'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/IngreseCelular-Obligatorio'), '999046712')

WebUI.delay(5)

WebUI.click(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/SeleccioneCategoria-Obligatorio'))

WebUI.delay(2)

WebUI.click(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/Licencia-Categoria-A1'))

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/IngreseLicencia-Obligatorio'), '1234567899')

WebUI.delay(2)

WebUI.clearText(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/FechaVencimientoLicencia-Obligatorio'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/FechaVencimientoLicencia-Obligatorio'), '01/03/2019')

WebUI.delay(2)

WebUI.scrollToPosition(0, 400)

WebUI.delay(3)

WebUI.click(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/TipoDeAsociado-Obligatorio'))

WebUI.delay(5)

WebUI.click(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/Tipo-Asociado-Fijo'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/Contrasena-Obligatorio'), 'CHAZKI2019')

WebUI.delay(2)

WebUI.click(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/Button-Guardar'))

WebUI.click(findTestObject('Asociados/Afiliacion/Nuevo-Asociado/Button_Guardar_REGISTRO_YES'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Asociados/Afiliacion/VerificarRegistroAsociado/DNI'), '1234567891234567')

WebUI.click(findTestObject('Asociados/Afiliacion/VerificarRegistroAsociado/Button_Buscar'))

WebUI.delay(2)

WebUI.verifyTextPresent('1234567891234567', true)

