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

WebUI.clearText(findTestObject('Login/UserName'))

WebUI.sendKeys(findTestObject('Login/UserName'), 'chazki_peru')

WebUI.sendKeys(findTestObject('Login/Contrasena'), '12345678')

WebUI.click(findTestObject('Login/button_Ingresar'))

WebUI.delay(5)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Menu/ExpandirMenu'))

WebUI.delay(5)

WebUI.click(findTestObject('Operaciones/Operaciones'))

WebUI.delay(5)

WebUI.click(findTestObject('Operaciones/Planeamiento'))

WebUI.delay(7)

WebUI.click(findTestObject('Operaciones/Opciones-Planeamiento/label_Servicio'))

WebUI.delay(5)

WebUI.click(findTestObject('Operaciones/Opciones-Planeamiento/Opciones-Planeamiento/Seleccionar-Servicio'))

WebUI.delay(5)

WebUI.click(findTestObject('Operaciones/Opciones-Planeamiento/Opciones-Planeamiento/label_Cliente'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Operaciones/Opciones-Planeamiento/Opciones-Planeamiento/Ingresar-Cliente'), 'tuenti')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Ataribox/Seleccionar-Cliente'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Operaciones/Opciones-Planeamiento/button_Buscar'))

WebUI.delay(2)

WebUI.click(findTestObject('Operaciones/Opciones-Planeamiento/OfertarRuta/Button-AgregarTodo'))

WebUI.delay(5)

WebUI.click(findTestObject('Operaciones/Opciones-Planeamiento/OfertarRuta/PuntoDeInicio'))

WebUI.delay(2)

WebUI.click(findTestObject('Operaciones/Opciones-Planeamiento/OfertarRuta/Button-GenerarRuta'))

WebUI.click(findTestObject('Operaciones/Opciones-Planeamiento/OfertarRuta/button_Yes'))

WebUI.delay(5)

WebUI.click(findTestObject('Operaciones/Opciones-Planeamiento/OfertarRuta/A-RUTAS-GENERADAS/RutasGeneradas'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 500)

WebUI.delay(5)

WebUI.click(findTestObject('Operaciones/Opciones-Planeamiento/OfertarRuta/button-PrevisualizacionDeLaRuta'))

WebUI.delay(5)

WebUI.click(findTestObject('Operaciones/Opciones-Planeamiento/OfertarRuta/label_Vehculos'))

WebUI.delay(2)

WebUI.click(findTestObject('Operaciones/Opciones-Planeamiento/OfertarRuta/Motocicleta'))

WebUI.delay(5)

WebUI.click(findTestObject('Operaciones/Opciones-Planeamiento/OfertarRuta/Close'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Operaciones/Opciones-Planeamiento/OfertarRuta/IngresarMotorizado'), 'loli')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Operaciones/Opciones-Planeamiento/OfertarRuta/IngresarMotorizado'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Operaciones/Opciones-Planeamiento/OfertarRuta/Ofertar'))

WebUI.delay(5)

WebUI.click(findTestObject('Operaciones/Opciones-Planeamiento/OfertarRuta/Yes-Ofertar/button_Yes'))

