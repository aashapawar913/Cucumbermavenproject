Feature: Search product and place order on web page

#Scenario: Search for product in both page home page and offers page
#
#Given User is on GreenCart Landing page
#When User search with shortname "Tom" and  Extract the actual name from product
#Then User searched for "Tom" shortname in offers page to check if product exists 
#And Verify offer page product name matched with Landing page

@OffersPage
Scenario Outline: Search if main product are available in both page home page 

Given User is on GreenCart Landing page
When User search with shortname <Name> and  Extract the actual name from product
Then User searched for <Name> shortname in offers page to check if product exists 
And Verify offer page product name matched with Landing page

Examples:
| Name |
| Tom  |
| beet |
