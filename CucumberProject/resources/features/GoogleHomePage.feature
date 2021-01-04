Feature: Google Homepage
This feature verifies the functionality on Google Homepage

Scenario: Check that main elements on Google Homepage are displayed
Given launch Spicejet on chrome browser
When I open Google Homepage

Then User is able to see relevant list of Flights
