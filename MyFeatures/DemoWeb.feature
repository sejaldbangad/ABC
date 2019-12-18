Feature: my validation on DemoWebShop


Background: Launch the DemoWebShop
Given application is lauched by user  

@Smokez
Scenario: user access to Registration in website
Given user verifies the DemoWebShop website 
And user clicks on Register button
When user enters proper information
Then clicks on submit button for Registration button
And clikcs on logout and close the browser
 
@Smokez
Scenario Outline: user access to Login for shopping
Given registered user clicks on Login link
Then he provides valid username "<username>"
And provides valid password "<password>"
Then verifies Login status

Examples: 
		|username|password|
		|paa@raa.com|123456|
		|abc@efg.com|123456|
		|namrata@s.com|147258|

@Sanity
Scenario: user access Search Item
Given user clicks on Search Item box
Then he types which item he want to buy
And clicks on search button
Then the item which user selected is displayed

@Smoke 
Scenario: user access Add cart
Given user searched item is displayed
Then user selects the required item 
And clicks on add to cart button
Then selected item is added to the cart
