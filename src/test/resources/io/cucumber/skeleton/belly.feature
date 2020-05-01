Feature: Belly

  Scenario: a few cukes case 1
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl

  Scenario: a few cukes case 2
    Given I have 22 cukes in my belly
    When I wait 11 hour
    Then my belly should growl

  Scenario: test items Menu
    Given in the menu these items available
      | File    |
      | Edit    |
      | About   |
    Then this text will be seen
    """
    You will have ne e-mail
    Check new code
    Send it me
    """