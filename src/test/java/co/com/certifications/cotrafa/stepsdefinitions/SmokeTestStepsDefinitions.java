package co.com.certifications.cotrafa.stepsdefinitions;


import co.com.certifications.cotrafa.questions.ValidarBotonCalcular;
import co.com.certifications.cotrafa.questions.ValidarBotonGenerar;
import co.com.certifications.cotrafa.questions.ValidarLogo;
import co.com.certifications.cotrafa.tasks.ClickEnSimulador;
import co.com.certifications.cotrafa.userinterface.PaginaSimulador;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class SmokeTestStepsDefinitions {
    @Managed
    private WebDriver driver;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActorCalled("Usuario");
    }
    @Given("el usuario esta en la pagina principal de cotrafa")
    public void elUsuarioEstaEnLaPaginaPrincipalDeCotrafa() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.cotrafa.com.co/"));
    }

    @Then("el usuario visualiza correctamente el logo de Contrafa")
    public void elUsuarioVisualizaCorrectamenteElLogoDeContrafa() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarLogo.logo(), Matchers.equalTo(true)));
    }

    @When("el usuario ingresa al simulador")
    public void elUsuarioIngresaAlSimulador() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickEnSimulador.Click());
    }
    @Then("el usuario visualiza el boton Calcular")
    public void elUsuarioVisualizaElBotonCalcular() {
        OnStage.theActorInTheSpotlight().attemptsTo(Scroll.to(PaginaSimulador.BTN_CALCULAR));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarBotonCalcular.name(), Matchers.equalTo("Calcular")));
    }

    @Then("el usuario visualiza el boton Generar Proyeccion")
    public void elUsuarioVisualizaElBotonGenerarProyeccion() {
        OnStage.theActorInTheSpotlight().attemptsTo(Scroll.to(PaginaSimulador.BTN_GENERAR_PROYECCION));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarBotonGenerar.name(), Matchers.containsString("Generar Proy")));
    }



}
