package gcdemos;

import static org.junit.Assert.*;

import org.junit.Test;

public class GuesListSumTest {

	@Test
	public void testSum1() {
		//Arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 47, true);
		
		//Act
		int actual = guestList.getSum();
		
		//Assert
		int expected = 47;
		assertEquals(expected, actual); 	
	}
	@Test
	public void testSum2() {
		//Arrange
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);
		
		//Act
		int actual = guestList.getSum();
		
		//Assert
		int expected = 103;
		assertEquals(expected, actual); 	
	}
	@Test
	public void testSum3() {
		//Arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 47, true);
		guestList.add("Tim", 103, false);
		
		//Act
		int actual = guestList.getSum();
		
		//Assert
		int expected = 150;
		assertEquals(expected, actual); 	
	}
	@Test
	public void testSum4() {
		//Arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 47, true);
		guestList.add("Tim", 103, false);
		guestList.add("Adan", -75, false);
		int actual = guestList.getSum();
		
		//Assert
		int expected = 75;
		assertEquals(expected, actual); 	
	}
}