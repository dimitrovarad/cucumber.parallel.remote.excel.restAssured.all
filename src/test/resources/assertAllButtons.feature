Feature: Assert all buttons

  @testContacts
  Scenario Outline: Successful find all buttons from Homepage
    Given browser "<browser>"
    When website loaded this address: "https://progressbg.net"
    Then I should verify all buttons
    And click on Contacts page to verify the title
    And  click ok Grafik page to verify text

    Examples:
      | browser |
      | chrome  |
      | firefox |