Feature: Deal data creation 

Scenario: Free CRM Create a new deal scenario 

	Given user is already on Login Page 
	When title of login page is Free CRM 
	Then user enters username and password 
		| username | password|
		| admin | scipio |
		
	Then user clicks on login button 
	Then user is on home page 
	Then user moves to new deal page 
	Then user enters deal details 
		| Description | Fixed Cost | Variable Cost |Per Milli Second |
		| test 		  | 1000 	   | 50			   | 10   			 |
		| test2 	  | 54000 	   | 55 		   | 21 			 |

		
	Then Close the browser