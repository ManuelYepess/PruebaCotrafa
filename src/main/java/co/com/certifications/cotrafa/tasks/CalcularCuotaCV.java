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

public class CalcularCuotaCV implements Task {
    private String cobertura;
    private String desembolso;
    private  String plazo;
    private String valorInmueble;
    public CalcularCuotaCV(List<InformacionCreditoVivienda> informacion ){
        this.cobertura = informacion.get(0).getCobertura();
        this.valorInmueble = informacion.get(0).getValorInmueble();
        this.desembolso = informacion.get(0).getDesembolso();
        this.plazo = informacion.get(0).getPlazo();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaSimulador.SELECT_VARIABLE),
                Click.on(PaginaSimulador.SELECT_COBERTURA.of(cobertura)),
                Enter.theValue(desembolso).into(PaginaSimulador.INPUT_DESEMBOLSO),
                Enter.theValue(plazo).into(PaginaSimulador.INPUT_PLAZO),
                Enter.theValue(valorInmueble).into(PaginaSimulador.INPUT_VALORINMUEBLE),
                Click.on(PaginaSimulador.BTN_CALCULAR));
    }
    public static CalcularCuotaCV calcular(List<InformacionCreditoVivienda> informacion) {
        return Tasks.instrumented(CalcularCuotaCV.class, informacion);
    }
}
