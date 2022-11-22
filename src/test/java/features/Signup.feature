Feature: itera problem 1

Scenario: Enter values to text columns
Given open browser
When loadurl https://itera-qa.azurewebsites.net/home/automation
And Enter values to text box
And Click submit button
Then Close browser

