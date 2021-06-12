Feature: Verify login page


Scenario: Verify Login Page title
Given User is on login page
Then Title of the page is "My Store"



Scenario: Verify forgot password link is working or not
Given User is on login page
Then User verifies forgot password link



Scenario: Verify that user is able to login
Given User is on login page
When User enters "test@prashant.com"
And user enters "Welcome@123"
And User clicks on login button
Then User gets the title of the home page is "My account - My Store"


