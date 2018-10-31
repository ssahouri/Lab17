package day18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GuestListTest {

	@Test
	public void testGetCount1() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 47, true);
		
		//act
		int actual = guestList.getCount();
		
		//assert
		int expected =1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetCount2() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);
		
		//act
		int actual = guestList.getCount();
		
		//assert
		int expected = 1;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCount3() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("Pops", -13, true);
		
		//act
		int actual = guestList.getCount();
		
		//assert
		int expected = 1;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetCount4() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 13, true);
		guestList.add("Tim", 14, false);
		
		//act
		int actual = guestList.getCount();
		
		//assert
		int expected = 2;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMemberCount1() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 47, true);
		
		//act
		int actual = guestList.getMemberCount();
		
		//assert
		int expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetMemberCount2() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("Tim", 103, false);
		
		//act
		int actual = guestList.getMemberCount();
		
		//assert
		int expected = 0;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMemberCount3() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 13, true);
		guestList.add("Tim", 103, false);
		
		//act
		int actual = guestList.getMemberCount();
		
		//assert
		int expected = 1;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMemberCount4() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 13, true);
		guestList.add("Tim", 103, true);
		
		//act
		int actual = guestList.getMemberCount();
		
		//assert
		int expected = 2;
		assertEquals(expected, actual);
	}
	@Test
	public void testGetMemberCount5() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 13, false);
		guestList.add("Tim", 13, false);
		guestList.add("Christa", 143, true);
		guestList.add("Sophia", 346, true);
		guestList.add("Joe", 1, false);
		
		//act
		int actual = guestList.getMemberCount();
		
		//assert
		int expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetSum1() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("David", 13, false);
		
		//act
		int actual = guestList.getSum();
		
		//assert
		int expected = 13;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetSum2() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("Time", 47, true);
		
		//act
		int actual = guestList.getSum();
		
		//assert
		int expected = 47;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetSum3() {
		//arrange
		GuestList guestList = new GuestList();
		guestList.add("Time", -4, true);
		
		//act
		int actual = guestList.getSum();
		
		//assert
		int expected = -4;
		assertEquals(expected, actual);
	}
	
	
	

}
