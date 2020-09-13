# Author Nahar
@userlogin
Feature: User wants to open an account in Chase Bank

In order to open an account
As a  new user
I want to visit Chase homepage

@sc1
Scenario: Validation of open an account button
Given user visits homepage
When hover on open an account button and click on credit card
Then user successfullLy redirect to credit card page

