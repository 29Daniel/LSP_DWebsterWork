package org.howard.edu.lsp.assignment7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThrows;

/**
 * 
 * @author 29Daniel
 *
 */
/**
 * 
 * Tests the methods of the AverageCalculatorWithoutTwoLowestScores class
 *
 */
class AverageCalculatorWithoutTwoLowestScoresTest {

	@DisplayName("Test case for compute when the list is not empty")
	@Test
	void testComputeWithNonEmptyList() throws EmptyListException {
		AverageCalculatorWithoutTwoLowestScores averageCalculator = new AverageCalculatorWithoutTwoLowestScores();
		List<Integer> grades = new ArrayList<>(Arrays.asList(85, 68, 85, 90, 95, 87));
		try {
			assertEquals(averageCalculator.compute(grades), 89);
		} 
		catch(EmptyListException ele) {
			Assert.fail("List should not be empty");
		}
	}
	
	@DisplayName("Test case for compute when the list is empty")
	@Test
	void testComputeWithEmptyList() throws EmptyListException {
		AverageCalculatorWithoutTwoLowestScores averageCalculator = new AverageCalculatorWithoutTwoLowestScores();
		List<Integer> grades = new ArrayList<>();
		assertThrows(EmptyListException.class, () -> averageCalculator.compute(grades));
	}
	
	@DisplayName("Test case for compute when the list is almost empty")
	@Test
	void testComputeWithAlmostEmptyList() throws EmptyListException {
		AverageCalculatorWithoutTwoLowestScores averageCalculator = new AverageCalculatorWithoutTwoLowestScores();
		List<Integer> grades = new ArrayList<>(Arrays.asList(85, 68));
		assertThrows(EmptyListException.class, () -> averageCalculator.compute(grades));
	}

}