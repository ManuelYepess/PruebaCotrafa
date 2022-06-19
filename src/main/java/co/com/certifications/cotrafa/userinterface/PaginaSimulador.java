package co.com.certifications.cotrafa.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaSimulador {
    public static final Target BTN_CEDITO_VIVIENDA = Target.the("Seleccionar credito de vivienda").
            located(By.xpath(" //li[@class='leaf active menu-mlid-788']"));
    public static final Target BTN_CEDITO_PJ = Target.the("Seleccionar credito de vivienda").
            located(By.xpath(" //li[@class='leaf active menu-mlid-787']"));
    public static final Target BTN_CEDITO = Target.the("Seleccionar credito de vivienda").
            located(By.xpath("//li[@class='first expanded menu-mlid-793']"));
    public static final Target BTN_CALCULAR = Target.the("Boton Calcular").
            located(By.name("calcular"));
    public static final Target BTN_GENERAR_PROYECCION = Target.the("Boton Generar Proyeccion").
            located(By.xpath("//div[@class='buttons-container']/input[2]"));
    public static final Target SELECT_VARIABLE = Target.the("Selector de variable a calcular").
            located(By.xpath("//select[@id='edit-submitted-variable-a-calcular']/option[2]"));
    /*public static final Target SELECT_OCUPACION = Target.the("Selector de ocupacion").
            located(By.xpath("//select[@id='edit-submitted-ocupacion']/option[2]"));
    public static final Target SELECT_FORMA_PAGO = Target.the("Selecto de forma de pago").
            located(By.xpath("//select[@id='edit-submitted-forma-de-pago']/option[2]"));*/
    public static final Target SELECT_COBERTURA = Target.the("Selector de ocupacion").
            locatedBy(" //select[@id='edit-submitted-cobertura-frech']/option[@value='{0}']");

    public static final Target SELECT_OCUPACION = Target.the("Selector de ocupacion").
            locatedBy("//*[contains(text(),'{0}')]");
    public static final Target SELECT_FORMA_PAGO = Target.the("Selecto de forma de pago").
            locatedBy(" //option[@value='{0}']");
    public static final Target SELECT_TAMANO = Target.the("Selector de Tamano empresa").
            locatedBy(" //select[@id='edit-submitted-tamano-empresa']/option[@value='{0}']");
    public static final Target INPUT_DESEMBOLSO = Target.the("ingresar valor a desembolsar").
            located(By.id("edit-submitted-desembolso"));
    public static final Target INPUT_PLAZO = Target.the("ingresar valor a desembolsar").
            located(By.id("edit-submitted-plazo"));
    public static final Target INPUT_VALORINMUEBLE = Target.the("ingresar valor a desembolsar").
            located(By.id("edit-submitted-valor-inmueble"));
    public static final Target LBL_CUOTA_MENSUAL = Target.the("Valor de la cuota mensual").
            located(By.xpath(" //div[@class='valorCuota result-value']"));
    public static final Target LBL_CUOTA_VIVIENDA = Target.the("Valor cuota vivienda").
            located(By.xpath("//div[@class='valorCuotaTotalSinSubsidio result-value']"));
    public static final Target TBL_PROYECCION = Target.the("Tabla de proyeccion Credito").
            located(By.xpath("//table[@id='proyeccion']"));
}
