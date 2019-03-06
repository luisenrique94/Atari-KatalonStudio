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

WebUI.delay(5)

WebUI.click(findTestObject('Asociados/Vehiculos/RegistroVehiculo/Asociado_Ingresar'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Asociados/Vehiculos/RegistroVehiculo/Asociado_Ingresar'), 'CHAVEZ PORROA')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Asociados/Vehiculos/RegistroVehiculo/Asociado_Ingresar'), Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Asociados/Vehiculos/RegistroVehiculo/Tipo-Vehiculo/TipoDeVehiculo'))

WebUI.delay(2)

WebUI.click(findTestObject('Asociados/Vehiculos/RegistroVehiculo/Tipo-Vehiculo/Motocicleta'))

WebUI.delay(2)

WebUI.click(findTestObject('Asociados/Vehiculos/RegistroVehiculo/Marca/Marca'))

WebUI.sendKeys(findTestObject('Asociados/Vehiculos/RegistroVehiculo/Marca/IngresarMarcaDeVehiculo'), 'HONDA')

WebUI.sendKeys(findTestObject('Asociados/Vehiculos/RegistroVehiculo/Marca/IngresarMarcaDeVehiculo'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Asociados/Vehiculos/RegistroVehiculo/Modelo/Modelo'))

WebUI.sendKeys(findTestObject('Asociados/Vehiculos/RegistroVehiculo/Modelo/IngresarModeloDeVehiculo'), 'CB')

WebUI.sendKeys(findTestObject('Asociados/Vehiculos/RegistroVehiculo/Modelo/IngresarModeloDeVehiculo'), Keys.chord(Keys.ARROW_DOWN, 
        Keys.ENTER))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Asociados/Vehiculos/RegistroVehiculo/NumeroDePlaca'), '789654')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Asociados/Vehiculos/RegistroVehiculo/NumeroTarjetaPropiedad'), '12345678912')

WebUI.click(findTestObject('Asociados/Vehiculos/RegistroVehiculo/RegistrarVehiculo'))

WebUI.delay(2)

WebUI.click(findTestObject('Asociados/Vehiculos/RegistroVehiculo/ConfirmarRegistro'))

