package co.com.certifications.cotrafa.questions;

import co.com.certifications.cotrafa.userinterface.PaginaSimulador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateCuota implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Integer.parseInt(((PaginaSimulador.LBL_CUOTA_MENSUAL.resolveFor(actor).getText()).replace("$","")).replace(".",""))>0;
    }
    public static ValidateCuota cuota(){
        return new ValidateCuota();
    }
}
