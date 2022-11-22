Feature: Login Feature 
To verify the whether user login successfully

Scenario: Login using valid credentials
Given user opens the url
When user enter the valid credentials -username
And user enter the valid credentials -password
Then user clicks the submit button

#write the feature of to tested
#jerkins values cannot be repeated in same scenario in same project
#given - can be repeated in same scenario
#when - can be repeated in same scenario
#then - 
#and
#but - cannot be repeated in same scenario