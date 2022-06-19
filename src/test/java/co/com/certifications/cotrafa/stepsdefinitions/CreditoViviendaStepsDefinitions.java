package co.com.certifications.cotrafa.stepsdefinitions;

import co.com.certifications.cotrafa.models.InformacionCredito;
import co.com.certifications.cotrafa.models.InformacionCreditoVivienda;
import co.com.certifications.cotrafa.questions.ValidateCuota;
import co.com.certifications.cotrafa.questions.ValidateCuotaVivienda;
import co.com.certifications.cotrafa.tasks.CalcularCuotaCPN;
import co.com.certifications.cotrafa.tasks.CalcularCuotaCV;
import co.com.certifications.cotrafa.userinterface.PaginaSimulador;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class CreditoViviendaStepsDefinitions {
    @Given("^el usuario selecciona Credito de vivienda$")
    public void elUsuarioSeleccionaCreditoDeVivienda() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(PaginaSimulador.BTN_CEDITO),
                Click.on(PaginaSimulador.BTN_CEDITO_VIVIENDA));
    }

    @When("^el usuario consulta las cuota credito vivienda$")
    public void elUsuarioConsultaLasCuotaCreditoVivienda(List<InformacionCreditoVivienda> informacion) {
        OnStage.theActorInTheSpotlight().attemptsTo(CalcularCuotaCV.calcular(informacion));
    }

    @Then("^el usuario puede ver el valor de cuota de vivienda$")
    public void elUsuarioPuedeVerElValorDeCuotaDeVivienda() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateCuotaVivienda.cuota(), Matchers.equalTo(true)));
    }
}
