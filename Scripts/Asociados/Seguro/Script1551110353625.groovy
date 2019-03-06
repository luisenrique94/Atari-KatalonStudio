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

WebUI.click(findTestObject('Asociados/Seguro/Seguro'))

WebUI.delay(6)

WebUI.click(findTestObject('Asociados/Seguro/BotonNuevo'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Asociados/Seguro/NuevoSeguroVehiculos/Asociado'), 'chavez porroa')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Asociados/Seguro/NuevoSeguroVehiculos/Asociado'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Asociados/Seguro/NuevoSeguroVehiculos/Vehiculo'))

WebUI.delay(5)

WebUI.click(findTestObject('Asociados/Seguro/NuevoSeguroVehiculos/Honda-Cb110'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Asociados/Seguro/NuevoSeguroVehiculos/FechaVencimientoSeguro'), '06/03/2019')

WebUI.click(findTestObject('Asociados/Seguro/NuevoSeguroVehiculos/TipoDeSeguro'))

WebUI.click(findTestObject('Asociados/Seguro/NuevoSeguroVehiculos/TiposDeSeguro/Cobertura50'))

WebUI.click(findTestObject('Asociados/Seguro/NuevoSeguroVehiculos/CompaniaDeSeguro/CompaniaDeSeguro'))

WebUI.click(findTestObject('Asociados/Seguro/NuevoSeguroVehiculos/CompaniaDeSeguro/Rimac'))

WebUI.sendKeys(findTestObject('Asociados/Seguro/NuevoSeguroVehiculos/NumeroDeSeguro'), '1234567895')

WebUI.delay(3)

WebUI.click(findTestObject('Asociados/Seguro/NuevoSeguroVehiculos/Boton_Guardar'))

WebUI.delay(3)

WebUI.click(findTestObject('Asociados/Seguro/NuevoSeguroVehiculos/AceptarRegistro'))

