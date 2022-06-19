package co.com.certifications.cotrafa.questions;

import co.com.certifications.cotrafa.userinterface.PaginaSimulador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarBotonGenerar implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return PaginaSimulador.BTN_GENERAR_PROYECCION.resolveFor(actor).getAttribute("value");
    }
    public static ValidarBotonGenerar name(){
        return new ValidarBotonGenerar();
    }
}
