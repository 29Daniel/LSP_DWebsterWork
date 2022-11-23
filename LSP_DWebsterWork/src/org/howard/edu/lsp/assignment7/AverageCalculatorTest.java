package org.howard.edu.lsp.assignment7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThrows;

/**
 * 
 * @author 29Daniel
 *
 */
/**
 * 
 * Tests the methods of the AverageCalculator class
 *
 */
class AverageCalculatorTest {

	@DisplayName("Test case for compute when the list is not empty")
	@Test
	void testComputeWithNonEmptyList() throws EmptyListException {
		AverageCalculator averageCalculator = new AverageCalculator();
		List<Integer> grades = new ArrayList<>(Arrays.asList(90, 85, 70, 91));
		try {
			assertEquals(averageCalculator.compute(grades), 84);
		} 
		catch(EmptyListException ele) {
			Assert.fail("List should not be empty");
		}
	}
	
	@DisplayName("Test case for compute when the list is empty")
	@Test
	void testComputeWithEmptyList() throws EmptyListException {
		AverageCalculator averageCalculator = new AverageCalculator();
		List<Integer> grades = new ArrayList<>();
		assertThrows(EmptyListException.class, () -> averageCalculator.compute(grades));
	}

}
