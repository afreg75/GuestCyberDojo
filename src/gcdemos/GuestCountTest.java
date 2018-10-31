package gcdemos;

import static org.junit.Assert.*;

import org.junit.Test;

public class GuestCountTest {
	//three parts of a test///
		//Arrange
		//Act
		//Assert

		@Test
		public void testCount1() {
			//Arrange
			GuestList guestList = new GuestList();
			guestList.add("David", 47, true);
			
			//Act
			int actual = guestList.getMemberCount();
			
			//Assert
			int expected = 1;
			assertEquals(expected, actual); 
		}
		@Test
		public void testCount2() {
			//Arrange
			GuestList guestList = new GuestList();
			guestList.add("Tim", 103, false);
			
			//Act
			int actual = guestList.getMemberCount();
			
			//Assert
			int expected = 0;
			assertEquals(expected, actual); 
		}
		@Test
		public void testCount3() {
			//Arrange
			GuestList guestList = new GuestList();
			guestList.add("David", 47, true);
			
			//Act
			int actual = guestList.getMemberCount();
			
			//Assert
			int expected = 1;
			assertEquals(expected, actual); 
	}
		@Test
		public void testCount4() {
			//Arrange
			GuestList guestList = new GuestList();
			guestList.add("David", 13,true);
			guestList.add("Tim", 74, false);
			
			//Act
			int actual = guestList.getMemberCount();
			
			//Assert
			int expected = 1;
			assertEquals(expected, actual); 
	}
		@Test
		public void testCount5() {
			//Arrange
			GuestList guestList = new GuestList();
			guestList.add("David", 13,false);
			guestList.add("Tim", 74, false);
			guestList.add("Mike", 13, true);
			guestList.add("Carlos", 35, false);
			guestList.add("Adan", 23, true);
			
			
			//Act
			int actual = guestList.getMemberCount();
			
			//Assert
			int expected = 2;
			assertEquals(expected, actual); 
	}

}
		
