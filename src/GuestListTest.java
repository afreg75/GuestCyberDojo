import static org.junit.Assert.*;

import org.junit.Test;

import gcdemos.GuestList;

public class GuestListTest {
	//three parts of a test///
	//Arrange
	//Act
	//Assert

	@Test
	public void testGetCount1() {
		//Arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 47, true);
		
		//Act
		int actual = guestList.getCount();
		
		//Assert
		int expected = 1;
		assertEquals(expected, actual); 
	}
	@Test
	public void testGetCount2() {
		//Arrange
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);
		
		//Act
		int actual = guestList.getCount();
		
		//Assert
		int expected = 1;
		assertEquals(expected, actual); 
	}
	@Test
	public void testGetCount3() {
		//Arrange
		GuestList guestList = new GuestList();
		guestList.add("Pops", -13, true);
		
		//Act
		int actual = guestList.getCount();
		
		//Assert
		int expected = 1;
		assertEquals(expected, actual); 
	}
	@Test
	public void testGetCount4() {
		//Arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 13, true);
		guestList.add("Tim", 14, false);
		
		//Act
		int actual = guestList.getCount();
		
		//Assert
		int expected = 2;
		assertEquals(expected, actual); 
	}
	@Test
	public void testGetCount5() {
		//Arrange
		GuestList guestList = new GuestList();
			
		//Act
		int actual = guestList.getCount();
		
		//Assert
		int expected = 0;
		assertEquals(expected, actual); 
	}
}
