Feature: Search product and place order on web page

@PlaceOrder
Scenario Outline: Search if main product are available in both page home page 
Given User is on GreenCart Landing page
When User search with shortname <Name> and  Extract the actual name from product
And Added "3" items of the selected product to cart
Then User proceeds to checkout and validate the name of item in checkout page
And Verify user has ability to enter promo code and place the order

Examples:
| Name |
| Tom  |
