package co.com.certifications.cotrafa.questions;

import co.com.certifications.cotrafa.userinterface.PaginaSimulador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateCuotaVivienda implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Integer.parseInt(((PaginaSimulador.LBL_CUOTA_VIVIENDA.resolveFor(actor).getText()).
                replace("$","")).replace(".",""))>0;
    }
    public static ValidateCuotaVivienda cuota(){
        return new ValidateCuotaVivienda();
    }
}
