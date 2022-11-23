Feature:Validation of hotel bookking on Adaction

Scenario Outline:TC_01 Validation of order id and hotel booking
Given user launches Adaction web application
Then user verfies Adaction home page url
When user enters valid "<username>" and "<password>"
And user clicks login button
Then user verfies search hotel url
When user enters valid "<location>","<hotel>","<roomtype>","<no.of rooms>","<Cin date>"
When user enters valid "<Cout date>","<Adultroom>","<Childroom>"
And user clicks Search
Then user verifies select hotel url
When user selects hotel
And user clicks continue
Then user verifies bookhotel page is displayed
When user enters valid "<Fname>" , "<Lname>" , "<Address>" , "<Cno>" , "<Ctype>" ,  "<Expmonth>" , "<Expyear>","<Cvv>"
And user clicks book now
Then user verifies order id url 
Then user verifies order id is displayed

Examples:
|username      |password  |location   |hotel       |roomtype|no.of rooms|Cin Date  |Cout date |Adultroom|Childroom|Fname|Lname|Address|Cno             |Ctype       |Expmonth|Expyear|Cvv|
|Ajithkumar1759|saajipoomy|Sydney     |Hotel Creek |Standard|1 - One    |23/11/2022|24/11/2022|1 - One  | 2 - Two  |Ajith|kumar|Annur  |1234567890123456|VISA        |December|2022   |123|
