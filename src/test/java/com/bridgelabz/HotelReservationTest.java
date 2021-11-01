package com.bridgelabz;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * 
 * @author Sandhya Test case for reservation
 *
 */

public class HotelReservationTest {

	private HotelReservation object;

	@Test
	public void whenAddedHotelSuccessfullyReturnTrue() {
		HotelReservation object = new HotelReservation();
		boolean hotelEntry = object.addHotel("Lakewood", 3, 110, 90);
		assertTrue(true, hotelEntry);
	}

	private void assertTrue(boolean b, boolean hotelEntry) {
		boolean hotelEntry1 = object.addHotel("Lakewood", -3, 110, 90);
		assertTrue(false, hotelEntry1);

	}

}
