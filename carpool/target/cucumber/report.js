$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DisplayRide.feature");
formatter.feature({
  "line": 1,
  "name": "Display the list of rides available",
  "description": "",
  "id": "display-the-list-of-rides-available",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "As a rider I can see the list of rides available with the following:",
  "description": "",
  "id": "display-the-list-of-rides-available;as-a-rider-i-can-see-the-list-of-rides-available-with-the-following:",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Rides present in database",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Open the application, it is default page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User able to see posted rides: In tabular format.Start time,Source,Destination,Published ID,Button (\"Book\")",
  "keyword": "Then "
});
formatter.match({
  "location": "DisplayRides.Rides_present_in_database()"
});
formatter.result({
  "duration": 184076462,
  "status": "passed"
});
formatter.match({
  "location": "DisplayRides.Open_the_application_it_is_default_page()"
});
formatter.result({
  "duration": 1254311,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Book",
      "offset": 101
    }
  ],
  "location": "DisplayRides.User_able_to_see_posted_rides_In_tabular_format_Start_time_Source_Destination_Published_ID_Button_(String)"
});
formatter.result({
  "duration": 2739722,
  "status": "passed"
});
});