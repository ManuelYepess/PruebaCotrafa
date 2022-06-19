Feature: Yo como usuario del servicio, necesito calcular la cuota de un credito de vivienda

  Background: Abrir la pagina de cotrafa e ir al simulador
    Given el usuario esta en la pagina principal de cotrafa
    And el usuario ingresa al simulador
    And el usuario selecciona Credito de vivienda

  Scenario Outline: Calcular las cuotas
    When el usuario consulta las cuota credito vivienda
      |cobertura          |desembolso|plazo|valorInmueble|
      |<cobertura>          |<desembolso>|<plazo>|<valorInmueble>|

    Then el usuario puede ver el valor de cuota de vivienda
    And el usuario da click en generar proyeccion
    And el usuario toma un pantallazo
    Examples:
      |cobertura     |desembolso|plazo|valorInmueble|
      |S            |55000000  |12   |100000000   |
      |N            |55000000  |12   |100000000   |
      |S            |55000000  |60   |100000000   |
      |N            |55000000  |60   |100000000   |