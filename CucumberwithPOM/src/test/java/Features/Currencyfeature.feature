Feature: Labelval and textbox value verification

Scenario: Verifying right count of values appearance on screen
Given Login to currency screen
When Check the values availability on the screen
Then Check the right count of values appearance on the screen

Scenario: Verifying the amounts are greater than 0.0
Given Login to currency screen
When Check the amounts availability on the screen
Then Check the amounts appeared are greater than 0.0

Scenario: Verifying the total balance is correct based on the values listed on the screen
Given Login to currency screen
When Check the total balance field is appeared
Then Check the total balance is correct

Scenario: Verifying amounts appeared are currency formatted
Given Login to currency screen
When Check all the amounts appeared
Then Check the amounts are prefixed with dollar symbol

Scenario: Verifying the total balance matches the sum of values
Given Login to currency screen
When Check all the amounts appeared
Then Check Total matches with summation of all the amounts

# creating the mockup of what the results would look like assuming all steps passed 