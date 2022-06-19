#Author Manuel Yepes
Feature: Yo como usuario del servicio necesito entrar al simulador y comprobar que los botones calcular
   y generar proyeccion existan.
  Background: Abrir la pagina de cotrafa
    Given el usuario esta en la pagina principal de cotrafa

  @logo
  Scenario: Validar que el logo de cotrafa este visible
    Then el usuario visualiza correctamente el logo de Contrafa

  @botonCalcular
  Scenario: Validar la existencia del boton Calcular
    When el usuario ingresa al simulador
    Then el usuario visualiza el boton Calcular

  @botonGenerarProyeccion
  Scenario: Validar la existencia del boton Generar Proyeccion
    When el usuario ingresa al simulador
    Then el usuario visualiza el boton Generar Proyeccion
