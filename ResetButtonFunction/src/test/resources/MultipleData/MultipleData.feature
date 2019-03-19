#Author: your.email@your.domain.com

Feature: Reset functionality on login page of Application

Scenario: Verification of Reset Button with Number of Credentials

		Given Open the Fireofx and launch the Apllication
    When Enter  the Username and Password
      | user1 |  password11 |
      | user2 |  password22 |
      | user3 |  password33 |

    Then Restet the Credentials
 
