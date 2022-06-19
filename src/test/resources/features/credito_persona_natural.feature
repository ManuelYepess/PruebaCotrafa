Feature: Yo como usuario del servicio, necesito calcular la cuota de un credito a persona natural.

  Background: Abrir la pagina de cotrafa e ir al simulador
   Given el usuario esta en la pagina principal de cotrafa
    And el usuario ingresa al simulador

  Scenario Outline: Calcular las cuotas
    When el usuario consulta las cuotas
    |ocupacion          |formaPago|desembolso|plazo|
    |<ocupacion>          |<formaPago>|<desembolso>|<plazo>|

    Then el usuario puede ver el valor de la cuota
    And el usuario da click en generar proyeccion
    And el usuario toma un pantallazo
    Examples:
      |ocupacion          |formaPago|desembolso|plazo|
      |Empleado           |DAC      |55000000  |12   |
      |Empleado           |N        |55000000  |12   |
      |Pensionado/Jubilado|DAC      |55000000  |12   |
      |Pensionado/Jubilado|N        |55000000  |12   |
      |Independiente      |DAC      |55000000  |12   |
      |Independiente      |N        |55000000  |12   |



