Feature:Merchant Dashboard Feature

  @NotDemo
  Scenario Outline: Merchant Application - Dashboard Page
    Given Login to Merchant Application using user <username> and password <password>
    Then Validate Login Successful
    And Exit Application
    Examples:
    |username                 |password |
    |"aperez@safetypay.com"   |"123123"   |
    |"ctrevino@safetypay.com" |"123123"   |
