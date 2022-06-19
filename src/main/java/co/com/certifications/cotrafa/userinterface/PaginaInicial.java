package co.com.certifications.cotrafa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicial {
    public static final Target LOGO_COTRAFA = Target.the("Logo de cotrafa").
            located(By.id("logo"));
    public static final  Target BTN_SIMULADOR = Target.the("Boton Simulador").
            located(By.xpath("//div[@class='item']/a[1]"));

}
