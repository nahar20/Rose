# Author
@userlogin
Feature: User wants to Sign in to Hilton 

In order to sign in 
As a registered user
I want to enter E-mail address, password and click sign in to login

@sc1
Scenario Outline: Positive login 

Given user visiting homepage
And user click on Sign in button
When user enter valid "<E-mail address>" and "<Password>"
And user click on sign in button
Then user successfully sign in to the system

Examples:
|E-mail Address|Password|
|naharny@gmail.com|ABC123|
