Feature: Home Page verification

Scenario: User has option to register on home page
Given User has clicked on Sign in link on launch Page
Then User can register himself


Scenario: User has option to login into the application
When User enters valid credentials
|username | password |
|raut@test.com| Peakyblinders@123|
Then User can login into the application