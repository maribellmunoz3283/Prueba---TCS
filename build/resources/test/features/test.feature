#Maribell Muñoz

@Runner

Feature: Register User
  As User
  I want to login
  To register on the platform

  @Shopping
  Scenario: Register User

    Given wants to access the Web Automation Demo Site

    When he performs the login on the page


    Then verifies that the screen is loading with text ORDER PAYMENT

  @Register

  Scenario: Register User

    Given she quiere registrar sus datos en the Web Automation advantageonlines

    When she enter your personal data
      |userName|email|password|confirm_password|first_Name|last_name|phone_Number|country|city|address|state|postal_Code|
      |Maribell|mary198mx@gmail.com|Daniel22*|Daniel22*|maribell|Munoz|3006295223|Colombia    |Medellin|Carrera 12 12-15|Antioquia|10120|

    Then verifies that is loading with text ORDER PAYMENT



  @Loguin

  Scenario: Loguin User

    Given that she wants to enter the system

    When she enters username and password
      |userName|password|
      |Maribell|Daniel22*|

    Then verifies that is loading Maribell
