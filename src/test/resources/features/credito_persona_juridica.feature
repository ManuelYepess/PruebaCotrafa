Feature: Yo como usuario del servicio, necesito calcular la cuota de un credito a persona natural.

  Background: Abrir la pagina de cotrafa e ir al simulador
    Given el usuario esta en la pagina principal de cotrafa
    And el usuario ingresa al simulador
    And el usuario selecciona Credito persona juridica

  Scenario Outline: Calcular las cuotas
    When el usuario consulta las cuota de persona juridica
      |Tamano          |desembolso|plazo|
      |<tamano>     |<desembolso>|<plazo>|

    Then el usuario puede ver el valor de la cuota
    And el usuario da click en generar proyeccion
    And el usuario toma un pantallazo
    Examples:
      |tamano          |desembolso|plazo|
      |M               |55000000  |12   |
      |PMG             |55000000  |12   |