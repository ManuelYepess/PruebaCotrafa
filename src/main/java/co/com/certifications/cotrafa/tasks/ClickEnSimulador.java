package co.com.certifications.cotrafa.tasks;

import co.com.certifications.cotrafa.userinterface.PaginaInicial;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ClickEnSimulador implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(PaginaInicial.BTN_SIMULADOR, WebElementStateMatchers.isClickable()).forNoMoreThan(5).seconds();
        actor.attemptsTo(Click.on(PaginaInicial.BTN_SIMULADOR));
    }
    public static ClickEnSimulador Click(){
        return Tasks.instrumented(ClickEnSimulador.class);
    }
}
