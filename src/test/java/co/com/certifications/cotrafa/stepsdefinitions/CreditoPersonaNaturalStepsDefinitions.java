package co.com.certifications.cotrafa.stepsdefinitions;

import co.com.certifications.cotrafa.models.InformacionCredito;
import co.com.certifications.cotrafa.questions.ValidateCuota;
import co.com.certifications.cotrafa.questions.ValidateProyeccion;
import co.com.certifications.cotrafa.tasks.CalcularCuotaCPN;
import co.com.certifications.cotrafa.userinterface.PaginaSimulador;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class CreditoPersonaNaturalStepsDefinitions {
    @When("el usuario consulta las cuotas")
    public void elUsuarioConsultaLasCuotas(List<InformacionCredito> informacion) {
        OnStage.theActorInTheSpotlight().attemptsTo(CalcularCuotaCPN.calcular(informacion));
    }
    @Then("el usuario puede ver el valor de la cuota")
    public void elUsuarioPuedeVerElValorDeLaCuota() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateCuota.cuota(), Matchers.equalTo(true)));
    }
    @Then("el usuario da click en generar proyeccion")
    public void elUsuarioDaClickEnGenerarProyeccion() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(PaginaSimulador.BTN_GENERAR_PROYECCION));
    }
    @Then("el usuario toma un pantallazo")
    public void elUsuarioTomaUnPantallazo() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateProyeccion.validate(),Matchers.equalTo(true)));
    }

}
