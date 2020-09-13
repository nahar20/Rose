# Author
@userlogin
Feature: User wants to Sign on & Signoff from Oscommerce

In order to sign in and sign off from account
As a registered user
I want to enter E-mail Address, password click sign in to login
and click signoff for signout

@sc1
Scenario Outline: Positive login and logout with valid E-mail address and Password

Given user visiting homepage
And user click My Account button
When user enter valid "<E-mail address>" and "<Password>"
And user click on sign in button
Then user successfully sign in to the system
And user click on log off button for logout

Examples:
|E-Mail Address|Password|
|pat@yahoo.com|ABC123|


#negative login scenario
@sc2
Scenario Outline: negative login and logout with invalid E-mail address and Password

Given user visiting homepage
And user click My Account button
When user enter invalid "<E-mail address>" and "<Password>"
And user click on sign in button
Then user successfully sign in to the system
And user click on log off button for logout

Examples:
|E-Mail Address|Password|
|pa@yahoo.com|ABC123|