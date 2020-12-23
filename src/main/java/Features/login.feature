#without example keyword
Feature: Demo Wordpress Login Feature
#Scenario:  Demo Wordpress Test Scenario
#Given user is already on Login Page
#When title of login page is WordPRess Login
#Then user enters "admin" and "demo123"
#Then user clicks on login button
#Then user is on home page
#Then Close the browser


#with example keyword

Scenario Outline:  Demo Wordpress Test Scenario
Given user is already on Login Page
When title of login page is WordPRess Login
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then Close the browser

#Scenario: user is able to create a new contact
#Given user already on homePage
#When user mover houver on contact link
#Then user click on Concact link
#Then user enter firstname
#Then user enter lastname
#Then user click on save
#Then user verify contact created

Examples:

	|username|password|
	|admin	 |scipio |

