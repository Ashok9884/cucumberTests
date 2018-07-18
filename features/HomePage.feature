Feature: Transavia Home Page

@Smoke
Scenario: Verify that user can search for flights

Given user is on application home page
When user select "Amsterdam (Schiphol), Netherlands" in From field
And user select "Alicante, Spain" in To field
And user select date "19 Jul 2018" in Depart on field
And user select date "20 Jul 2018" in Return on field
And user select adults, children, babies in who will be travelling field
|  Adults    | Children | Babies |
| 2          | 1        | 1      | 
And user check the option for Show prices in flying Blue Miles
And user click Search button
Then user is navigated to Book a flight page

@Regression
Scenario: Verify that user is able to navigate to login page from header login link 

Given user is on application home page
When user clicks on Login link
Then user is navigated to application logon page


Scenario: Verify that user is able to navigate to login page from header login link

Given user is on application home page
When user clicks on Create account link
Then user is navigated to Sign up for My Transavia page


Scenario: Verify that user is able to see the suggestions drop down box in From field

Given user is on application home page
When user clicks and enter keyword "Ams" in From field
Then suggestions drop down box is displayed most relevant options
And user selects the option from drop down
And the selected option is displayed in the From field


Scenario: Verify that user is able to see the suggestions drop down box in To field

Given user is on application home page
When user clicks and enter keyword "Spain" in To field
Then suggestions drop down box is displayed with most relevant options
And user selects the option from drop down
And the selected option is displayed in the To field


Scenario: Verify that User is able to change the application language

Given user is on application home page
When user clicks on country link from header
And user selects "United Kingdom" from select your country pop-up overlay
Then United Kingdom is displayed as country in header
And application language changes to english


Scenario: Verify that User is able to change the currency

Given user is on application home page
When user clicks on currency link from header
And user selects "GBP" from select currency pop-up overlay
Then GBP is displayed as currency in header
And from 

Scenario: Verify that User is able to navigate to Frequently Asked Questions page

Given user is on application home page
When user scrolls down to the bottom of the application
And user clicks on search button in  Can we help you section
Then user is navigated to Frequently Asked Questions page









