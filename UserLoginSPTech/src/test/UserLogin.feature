Feature: login in http://test.sptech.pl/

  Scenario: User login
    Given a user in a test.sptech.pl page
    When the user clicks on login
    And the user type "korzeniec.rafal90@cyberia.pl"
    And type "1234qwer"
    And press login button
    Then the user go to account panel

    Scenario Outline: User login
      Given a user in a test.sptech.pl page
      When the user clicks on login
      And the user type "text"
      And type "text2"
      And press login button
      Then the user go to account panel
