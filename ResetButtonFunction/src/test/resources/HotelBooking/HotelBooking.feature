#Author: Satyapal Kumar

@Hotelbooking
Feature: HotelBooking

Background: User has already logged in with valid credentials
and is navigated to hotelBooking page.


Scenario: Check the title
Given User is on Hotel Booking Page
Then Check the title of the page


Given User is on Hotel Booking Page
When User enters all valid data
Then Navigate to Welcome Page


Scenario: Failure in Hotel Booking on leaving the First Name empty
Given User is on Hotel Booking Page
When User leaves First Name blank
And clicks the Submit button
Then Display the Alert Message


Scenario: Failure in Hotel Booking on leaving the Last Name empty
Given User is on Hotel Booking Page
When user leaves Last Name blank
And clicks the Submit button
Then Display the Alert Message

Scenario: Failure in Hotel Booking on leaving the Last Name empty
Given User is on Hotel Booking Page
When user leaves Last Name blank
And clicks the Submit button
Then Display the Alert Message


Scenario: Failure in Hotel Booking on leaving the Email blank
Given User is on Hotel Booking Page
When user leaves Email blank 
And clicks the button 
Then Display the Alert Message

Scenario: Failure in Hotel Booking on incorrect Eamil format
Given User is on Hotel Booking Page
When user enters all data
But user enters incorrect email format 
And clicks the button
Then Display the Alert Message


Scenario: Failure in Hotel Booking on leaving the Mobile blank
Given User is on Hotel Booking Page
When user leaves Mobile blank 
And clicks the button 
Then Display the Alert Message

Scenario: Failure in Hotel Booking on incorrect mobile no. format
Given User is on Hotel Booking Page
When user enters incorrect mobileno format 
And clicks the button
|7897987754|
|0218900979|
|2345678978|
|87465|
|77722005566|
| |
Then Display the Alert Message

Scenario: Failure in Hotel Booking on not selecting the city
Given User is on Hotel Booking Page
When user does not select city 
Then Display the Alert Message


Scenario: Failure in Hotel Booking on not selecting the state
Given User is on Hotel Booking Page
When user does not select state
Then Display the Alert Message

Scenario Outline: Validate the number of rooms alloted
Given User is on Hotel Booking Page
When user enters <numberOfGuests>
Then allocate rooms such that 1 room for minimum 3 guests
Examples:
|numberOfGuests|
|2|
|6|
|9|


Scenario: Failure in Hotel Booking on leaving the CardHolderName blank
Given User is on Hotel Booking Page
When user leaves CardHolderName blank 
And clicks the button 
Then Display the Alert Message
 
Scenario: Failure in Hotel Booking on leaving the DebitCardNo blank
Given User is on Hotel Booking Page
When user leaves DebitCardNo blank 
And clicks the button  
Then Display the Alert Message

Scenario: Failure in Hotel Booking on leaving the ExpirationMonth blank
Given User is on Hotel Booking Page
When user leaves ExpirationMonth blank 
And clicks the button  
Then Display the Alert Message

Scenario: Failure in Hotel Booking on leaving the ExpirationYr blank
Given User is on Hotel Booking Page
When user leaves ExpirationYr blank 
And clicks the button  
Then Display the Alert Message


