package com.bridgelabz;
import java.util.ArrayList;

import java.util.*;

/**
 * This is the HotelReservationSystem class
 * @param hotel This is a array list of hotel type
 */
public class HotelReservation {

	public static ArrayList<Hotel> hotel = new ArrayList<Hotel>();

	// This method is used to add hotel
	public boolean addHotel(String hotelName, int rating, int regularCustomerWeekRate, int regularCustomerWeekendRate) {
		hotel.add(new Hotel(hotelName, rating, regularCustomerWeekRate, regularCustomerWeekendRate));
		return true;
	}

}
