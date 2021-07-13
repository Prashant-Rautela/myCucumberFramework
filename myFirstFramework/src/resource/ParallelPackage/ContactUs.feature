Feature: Contact Us

Scenario Outline: Contact Us scenario with different set of test data
Given User navigates to Contact us page
When user fills the form from given sheet "<SheetName>" and row number <rownum>
And User clicks on Submit button
Then Successful message "Your message has been successfully sent to our team."

Examples:
|SheetName|rownum|
|ContactUs|0|
|ContactUs|1|
