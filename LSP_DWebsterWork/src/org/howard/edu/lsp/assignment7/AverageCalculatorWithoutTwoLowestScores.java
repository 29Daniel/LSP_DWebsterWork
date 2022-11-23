package org.howard.edu.lsp.assignment7;

import java.util.Collections;
import java.util.List;

/**
 * 
 * @author 29Daniel
 *
 */
/**
 * 
 * Implements the AverageStrategy interface and allows for the computing of the inputed grades 
 * without the lowest two scores
 *
 */
public class AverageCalculatorWithoutTwoLowestScores implements AverageStrategy {
	
	/**
	 * Removes the lowest two scores then finds the average of the inputed grades
	 * @param grades the list of grades 
	 * @return an integer of the computed average
	 * @throws EmptyListException to be thrown when the list is empty
	 */
	@Override
	public int compute(List<Integer> grades) throws EmptyListException {
		int sum = 0;
		for (int i = 0; i < 2; i++) {
			if (grades.isEmpty()) {
				throw new EmptyListException();
			}
			grades.remove(Collections.min(grades));
		}
		if (grades.isEmpty()) {
			throw new EmptyListException();
		}
		for (int grade : grades) {
			sum += grade;
		}
		return (sum/grades.size());
	}

}