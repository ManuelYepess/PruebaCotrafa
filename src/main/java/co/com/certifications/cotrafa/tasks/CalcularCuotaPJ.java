package co.com.certifications.cotrafa.tasks;

import co.com.certifications.cotrafa.models.InformacionCreditoPJ;
import co.com.certifications.cotrafa.userinterface.PaginaSimulador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class CalcularCuotaPJ implements Task {
    private String tamano;
    private String desembolso;
    private String plazo;
    public CalcularCuotaPJ(List<InformacionCreditoPJ> informacion ){
        this.tamano = informacion.get(0).getTamano();
        this.desembolso = informacion.get(0).getDesembolso();
        this.plazo = informacion.get(0).getPlazo();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaSimulador.SELECT_VARIABLE),
                Click.on(PaginaSimulador.SELECT_TAMANO.of(tamano)),
                Enter.theValue(desembolso).into(PaginaSimulador.INPUT_DESEMBOLSO),
                Enter.theValue(plazo).into(PaginaSimulador.INPUT_PLAZO),
                Click.on(PaginaSimulador.BTN_CALCULAR));
    }
    public static CalcularCuotaPJ calcular(List<InformacionCreditoPJ> informacion){
        return Tasks.instrumented(CalcularCuotaPJ.class, informacion);
    }
}
