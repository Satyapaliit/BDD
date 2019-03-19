#Author: Satyapal Kumar

Feature: Reset functionality on login page Aplication

Scenario Outline: Verification of reset button

Given Open the firefox and launch the Application

When Enter the Username<username> and Password<password>

Then Reset the credentials

Examples:

|username |password|
|"username1" |"password1"			|
|"username2" |"password2"			|
|"username3" |"password3"			|
|"username4" |"password4"			|
