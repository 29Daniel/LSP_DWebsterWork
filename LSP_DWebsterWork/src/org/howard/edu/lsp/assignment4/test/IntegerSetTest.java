package org.howard.edu.lsp.assignment4.test;

import org.howard.edu.lsp.assignment4.implementation.*;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Class to test public methods of IntegerSet
 */
class IntegerSetTest {

	@DisplayName("Test case for clear method with non empty set")
	@Test
	void testClear() {
		IntegerSet integerSetA = new IntegerSet();
		integerSetA.add(0);
		integerSetA.clear();
		assertEquals(integerSetA.toString(),"{}");
	}
	
	@DisplayName("Test case for clear method with empty set")
	@Test
	void testClearEmptySet() {
		IntegerSet integerSetA = new IntegerSet();
		integerSetA.clear();
		assertEquals(integerSetA.toString(),"{}");
	}
	
	@DisplayName("Test case for length method with non empty set")
	@Test
	void testLength() {
		IntegerSet integerSetA = new IntegerSet();
		integerSetA.add(1);
		integerSetA.add(0);
		assertEquals(integerSetA.length(), 2);
	}
	
	@DisplayName("Test case for length method with empty set")
	@Test
	void testLengthEmptySet() {
		IntegerSet integerSetA = new IntegerSet();
		assertEquals(integerSetA.length(), 0);
	}
	
	@DisplayName("Test case for equals method with 2 equal sets")
	@Test
	void testEquals() {
		IntegerSet integerSetA = new IntegerSet();
		IntegerSet integerSetB = new IntegerSet();
		integerSetA.add(10);
		integerSetA.add(23);
		integerSetB.add(23);
		integerSetB.add(10);
		assertEquals(integerSetA.equals(integerSetB), true);
	}

	@DisplayName("Test case for equals method with 2 unequal sets")
	@Test
	void testEqualsUnequalSets() {
		IntegerSet integerSetA = new IntegerSet();
		IntegerSet integerSetB = new IntegerSet();
		integerSetA.add(10);
		integerSetA.add(23);
		integerSetB.add(23);
		assertEquals(integerSetA.equals(integerSetB), false);
	}

	@DisplayName("Test case for isempty method with empty set")
	@Test
	void testIsEmptyWithEmptySet() {
		IntegerSet integerSetA = new IntegerSet();
		assertEquals(integerSetA.isEmpty(), true);
	}
	
	@DisplayName("Test case for isempty method with non empty set")
	@Test
	void testIsEmptyWithNonEmptySet() {
		IntegerSet integerSetA = new IntegerSet();
		integerSetA.add(0);
		assertEquals(integerSetA.isEmpty(), false);
	}
	
	@DisplayName("Test case for contains method when the set contains the element")
	@Test
	void testContains0() {
		IntegerSet integerSetA = new IntegerSet();
		integerSetA.add(0);
		integerSetA.add(7);
		assertEquals(integerSetA.contains(7), true);
	}
	
	@DisplayName("Test case for contains method when the set doesn't contain the element")
	@Test
	void testContains1() {
		IntegerSet integerSetA = new IntegerSet();
		integerSetA.add(0);
		integerSetA.add(7);
		assertEquals(integerSetA.contains(8), false);
	}
	
	@DisplayName("Test case for smallest method")
	@Test
	void testSmallestWithNonEmptySet() {
		IntegerSet integerSetA = new IntegerSet();
		integerSetA.add(8);
		integerSetA.add(1);
		integerSetA.add(2);
		try {
			assertEquals(integerSetA.smallest(), 1);
		}
		catch(IntegerSetException ise) {
			Assert.fail("Set should not be empty");
		}
	}
	
	@DisplayName("Test case for smallest method when the set is empty")
	@Test
	void testSmallestWithEmptySet() {
		IntegerSet integerSetA = new IntegerSet();
		assertThrows(IntegerSetException.class, () -> integerSetA.smallest());
	}
	
	@DisplayName("Test case for largest method when the set is empty")
	@Test
	void testLargestWithEmptySet() {
		IntegerSet integerSetA = new IntegerSet();
		assertThrows(IntegerSetException.class, () -> integerSetA.largest());
	}
	
	@DisplayName("Test case for largest method")
	@Test
	void testLargestWithNonEmptySet() {
		IntegerSet integerSetA = new IntegerSet();
		integerSetA.add(8);
		integerSetA.add(1);
		integerSetA.add(2);
		try {
			assertEquals(integerSetA.largest(), 8);
		}
		catch(IntegerSetException ise) {
			Assert.fail("Set should not be empty");
		}
	}
	
	@DisplayName("Test case for add method")
	@Test
	void testAdd() {
		IntegerSet integerSetA = new IntegerSet();
		integerSetA.add(44);
		integerSetA.add(44);
		assertEquals(integerSetA.toString(), "{44}");
	}
	
	@DisplayName("Test case for remove method")
	@Test
	void testRemove() {
		IntegerSet integerSetA = new IntegerSet();
		integerSetA.add(44);
		integerSetA.add(56);
		integerSetA.remove(44);
		assertEquals(integerSetA.toString(), "{56}");
	}
	
	@DisplayName("Test case for remove method when element is not present")
	@Test
	void testRemoveWhenElementNotPresent() {
		IntegerSet integerSetA = new IntegerSet();
		integerSetA.add(0);
		integerSetA.remove(44);
		assertEquals(integerSetA.toString(), "{0}");
	}
	
	@DisplayName("Test case for union method")
	@Test
	void testUnion() {
		IntegerSet integerSetA = new IntegerSet();
		IntegerSet integerSetB = new IntegerSet();
		integerSetB.add(0);
		integerSetB.add(10);
		integerSetA.add(0);
		integerSetA.add(5);
		integerSetA.union(integerSetB);
		assertEquals(integerSetA.toString(), "{0, 5, 10}");
	}
	
	@DisplayName("Test case for intersect method")
	@Test
	void testIntersect() {
		IntegerSet integerSetA = new IntegerSet();
		IntegerSet integerSetB = new IntegerSet();
		integerSetB.add(0);
		integerSetB.add(10);
		integerSetA.add(0);
		integerSetA.add(5);
		integerSetA.intersect(integerSetB);
		assertEquals(integerSetA.toString(), "{0}");
	}
	
	@DisplayName("Test case for diff method")
	@Test
	void testDiff() {
		IntegerSet integerSetA = new IntegerSet();
		IntegerSet integerSetB = new IntegerSet();
		integerSetB.add(0);
		integerSetB.add(10);
		integerSetA.add(0);
		integerSetA.add(5);
		integerSetA.diff(integerSetB);
		assertEquals(integerSetA.toString(), "{5}");
	}

	
}
