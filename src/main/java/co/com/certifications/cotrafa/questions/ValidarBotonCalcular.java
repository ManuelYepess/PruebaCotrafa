package co.com.certifications.cotrafa.questions;

import co.com.certifications.cotrafa.userinterface.PaginaSimulador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarBotonCalcular implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return PaginaSimulador.BTN_CALCULAR.resolveFor(actor).getAttribute("value");
    }
    public static ValidarBotonCalcular name(){
        return new ValidarBotonCalcular();
    }
}
