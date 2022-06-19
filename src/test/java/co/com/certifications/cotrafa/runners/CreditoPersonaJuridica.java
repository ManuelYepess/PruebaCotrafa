package co.com.certifications.cotrafa.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/credito_persona_juridica.feature",
        glue = "co.com.certifications.cotrafa.stepsdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "")
public class CreditoPersonaJuridica {
}
