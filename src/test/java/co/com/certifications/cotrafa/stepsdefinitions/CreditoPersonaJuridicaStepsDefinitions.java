package co.com.certifications.cotrafa.stepsdefinitions;

import co.com.certifications.cotrafa.models.InformacionCreditoPJ;
import co.com.certifications.cotrafa.models.InformacionCreditoVivienda;
import co.com.certifications.cotrafa.tasks.CalcularCuotaCV;
import co.com.certifications.cotrafa.tasks.CalcularCuotaPJ;
import co.com.certifications.cotrafa.userinterface.PaginaSimulador;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class CreditoPersonaJuridicaStepsDefinitions {
    @Given("^el usuario selecciona Credito persona juridica$")
    public void elUsuarioSeleccionaCreditoPersonaJuridica() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(PaginaSimulador.BTN_CEDITO),
                Click.on(PaginaSimulador.BTN_CEDITO_PJ));
    }

    @When("^el usuario consulta las cuota de persona juridica$")
    public void elUsuarioConsultaLasCuotaDePersonaJuridica(List<InformacionCreditoPJ> informacion) {
        OnStage.theActorInTheSpotlight().attemptsTo(CalcularCuotaPJ.calcular(informacion));
    }
}
