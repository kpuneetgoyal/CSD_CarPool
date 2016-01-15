package com.org.carpool;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Date;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DisplayRides {
	
	ArrayList<Ride> rides = new ArrayList<Ride>();
	
		public void addRide(String source, String destination, String starttime, int availableSeats){
			Ride ride = new Ride();
			ride.setAvailableSeats(availableSeats);
			ride.setDestination(destination);
			ride.setSource(source);
			ride.setStarttime(starttime);
			rides.add(ride);
		}
		
		public void displayRide(ArrayList<Ride> rides){
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
			for (Ride ride : rides) {
				System.out.println("Ride ******** ");
				System.out.println(ride.getSource());
				System.out.println(ride.getDestination());
				System.out.println(ride.getAvailableSeats());
				System.out.println(ride.getStarttime());
			}
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
		
		public void displayRideTabular(ArrayList<Ride> rides){
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
			for (Ride ride : rides) {
				System.out.println("Ride ******** ");
				System.out.println(ride.getSource()+"|"+ride.getDestination()+"|"+ride.getAvailableSeats()+"|"+ride.getStarttime());
			}
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
		}
	
		@Given("^Rides present in database$")
		public void Rides_present_in_database() throws Throwable {
			addRide("BACI","Dwarka sec29", "10:30 PM" ,3);
			addRide("GGN Sec 52","BACI", "10:30 AM" ,4);
			addRide("Laxmi Nagar","BACI", "09:30 AM" ,2);
			addRide("BACI","GGN sec29", "10:30 PM" ,3);
		    if(rides.size()>0)
		    	System.out.println("Some Rides are available");
		}

		@When("^Open the application, it is default page$")
		public void Open_the_application_it_is_default_page() throws Throwable {
		    if(rides.size()>0){
		    	displayRide(rides);
		    }
		}

		@Then("^User able to see posted rides: In tabular format.Start time,Source,Destination,Published ID,Button \\(\"([^\"]*)\"\\)$")
		public void User_able_to_see_posted_rides_In_tabular_format_Start_time_Source_Destination_Published_ID_Button_(String arg1) throws Throwable {
			 if(rides.size()>0){
			    	displayRideTabular(rides);
			    }
		}

		@Given("^List available$")
		public void List_available() throws Throwable {
			assertNotNull(rides);displayRide(rides);
		}

		@When("^Ride Expired$")
		public void Ride_Expired() throws Throwable {
		    // Express the Regexp above with the code you wish you had
		    throw new PendingException();
		}

		@Then("^Expired rides will be deleted from list automatically.$")
		public void Expired_rides_will_be_deleted_from_list_automatically() throws Throwable {
		    // Express the Regexp above with the code you wish you had
		    throw new PendingException();
		}

		@Given("^No Data present in database$")
		public void No_Data_present_in_database() throws Throwable {
		    // Express the Regexp above with the code you wish you had
		    throw new PendingException();
		}

		@Then("^\"([^\"]*)\" pop up appear$")
		public void pop_up_appear(String arg1) throws Throwable {
		    // Express the Regexp above with the code you wish you had
		    throw new PendingException();
		}

		@Given("^Data is present in tables$")
		public void Data_is_present_in_tables() throws Throwable {
		    // Express the Regexp above with the code you wish you had
		    throw new PendingException();
		}

		@When("^More then (\\d+) rides available at a time$")
		public void More_then_rides_available_at_a_time(int arg1) throws Throwable {
		    // Express the Regexp above with the code you wish you had
		    throw new PendingException();
		}

		@Then("^Pagination must be present if more than (\\d+) rows. Maximum (\\d+) rows should be present at each page$")
		public void Pagination_must_be_present_if_more_than_rows_Maximum_rows_should_be_present_at_each_page(int arg1, int arg2) throws Throwable {
		    // Express the Regexp above with the code you wish you had
		    throw new PendingException();
		}

		@Given("^Entries present in database$")
		public void Entries_present_in_database() throws Throwable {
		    // Express the Regexp above with the code you wish you had
		    throw new PendingException();
		}

		@When("^If we want to navigate from list page to details page$")
		public void If_we_want_to_navigate_from_list_page_to_details_page() throws Throwable {
		    // Express the Regexp above with the code you wish you had
		    throw new PendingException();
		}

		@Then("^Hyper link is present in published id. Non workable as of now$")
		public void Hyper_link_is_present_in_published_id_Non_workable_as_of_now() throws Throwable {
		    // Express the Regexp above with the code you wish you had
		    throw new PendingException();
		}



}
