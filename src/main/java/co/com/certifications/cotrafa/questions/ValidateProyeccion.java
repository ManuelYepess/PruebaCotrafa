package co.com.certifications.cotrafa.questions;

import co.com.certifications.cotrafa.userinterface.PaginaSimulador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateProyeccion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return PaginaSimulador.TBL_PROYECCION.resolveFor(actor).isCurrentlyVisible();
    }
    public static ValidateProyeccion validate(){
        return new ValidateProyeccion();
    }
}
