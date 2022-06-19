package co.com.certifications.cotrafa.questions;

import co.com.certifications.cotrafa.userinterface.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarLogo implements Question {
    public Object answeredBy(Actor actor){
        return PaginaInicial.LOGO_COTRAFA.resolveFor(actor).isDisplayed();
    }
    public static ValidarLogo logo(){
        return new ValidarLogo();
    }



}
