Feature: Display the list of rides available 

Scenario: As a rider I can see the list of rides available with the following:
Given Rides present in database 
When Open the application, it is default page
Then User able to see posted rides: In tabular format.Start time,Source,Destination,Published ID,Button ("Book")

@goyalTag
Scenario: Display available rides only
Given List available
When Ride Expired
Then Expired rides will be deleted from list automatically.