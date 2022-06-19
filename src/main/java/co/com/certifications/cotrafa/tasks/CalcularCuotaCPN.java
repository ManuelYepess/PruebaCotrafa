package co.com.certifications.cotrafa.tasks;

import co.com.certifications.cotrafa.models.InformacionCredito;
import co.com.certifications.cotrafa.models.InformacionCreditoVivienda;
import co.com.certifications.cotrafa.userinterface.PaginaSimulador;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.util.List;

public class CalcularCuotaCPN implements Task {
    private String ocupacion;
    private String formaPago;
    private String desembolso;
    private String plazo;
    public CalcularCuotaCPN(List<InformacionCredito> informacion ){
        this.ocupacion = informacion.get(0).getOcupacion();
        this.formaPago = informacion.get(0).getFormaPago();
        this.desembolso = informacion.get(0).getDesembolso();
        this.plazo = informacion.get(0).getPlazo();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaSimulador.SELECT_VARIABLE),
                Click.on(PaginaSimulador.SELECT_OCUPACION.of(ocupacion)),
                Click.on(PaginaSimulador.SELECT_FORMA_PAGO.of(formaPago)),
                Enter.theValue(desembolso).into(PaginaSimulador.INPUT_DESEMBOLSO),
                Enter.theValue(plazo).into(PaginaSimulador.INPUT_PLAZO),
                Click.on(PaginaSimulador.BTN_CALCULAR));
    }
    public static CalcularCuotaCPN calcular(List<InformacionCredito> informacion){
        return Tasks.instrumented(CalcularCuotaCPN.class, informacion);
    }
}

