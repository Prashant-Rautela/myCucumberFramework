@tag
Feature: Launch Page
  

  @tag1
  Scenario: Title of the launch page
    When User enters website URL
    Then Title of the page is "My Store"

  Scenario: Sign in link is present
  When User enters website URL
  Then Sign in link is visible
  
  Scenario: Contact us link is present
  When User enters website URL
  Then Contact Us link is visible
  