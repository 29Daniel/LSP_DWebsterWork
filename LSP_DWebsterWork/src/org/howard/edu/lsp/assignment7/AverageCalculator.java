package org.howard.edu.lsp.assignment7;

import java.util.List;

/**
 * 
 * @author 29Daniel

 *
 */
/**
 * 
 * Implements the AverageStrategy interface and allows for the computing of the inputed grades
 *
 */
public class AverageCalculator implements AverageStrategy {
	
	/**
	 * Finds the average of the inputed grades
	 * @param grades the list of grades 
	 * @return an integer of the computed average
	 * @throws EmptyListException to be thrown when the list is empty
	 */
	@Override
	public int compute(List<Integer> grades) throws EmptyListException {
		int sum = 0;
		if (grades.isEmpty()) {
			throw new EmptyListException();
		}
		for (int grade : grades) {
			sum += grade;
		}
		return (sum/grades.size());
	}

}
