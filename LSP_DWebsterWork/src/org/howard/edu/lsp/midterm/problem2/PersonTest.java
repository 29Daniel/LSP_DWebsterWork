package org.howard.edu.lsp.midterm.problem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 
 * Class to test public methods in Person class
 *
 */
class PersonTest {

	@DisplayName("Test case for toString function")
	@Test
	void testToString() {
		Person personOne = new Person("Thomas",17 ,"112-24-2022");
		assertEquals(personOne.toString(), "Name: Thomas Age: 17 SSN: 112-24-2022");
	}
	
	@DisplayName("Test case for equals function when the two objects are equal")
	@Test
	void testEqualsWhenTwoObjectsAreEqual() {
		Person personOne = new Person("Thomas",17 ,"112-24-2022");
		Person personTwo = new Person("Thomas",17 ,"112-24-2022");
		assertTrue(personOne.equals(personTwo));
	}
	
	@DisplayName("Test case for equals function when the two objects are not equal")
	@Test
	void testEqualsWhenTwoObjectsAreNotEqual() {
		Person personOne = new Person("Thomas",17 ,"112-24-2022");
		Person personTwo = new Person("Thomas",17 ,"112-24-1738");
		assertTrue(!personOne.equals(personTwo));
	}

}
