package day18;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class HikerTest {

	@Test
	public void test1() {
		//arrange
		String number = "";
		
		//act
		String actual = Hiker.add(number);
		
		//assert
		String expected ="0";
		assertEquals(expected, actual);
	}
	@Test
	public void test2() {
		//arrange
		String number = "2";
		String number2 = "4";
		
		//act
		String actual = Hiker.add(number, number2);
		
		//assert
		String expected ="6";
		assertEquals(expected, actual);
	}

}
