package org.howard.edu.lsp.assignment7;

import java.util.List;
/**
 * 
 * @author 29Daniel
 *
 */
/*
 * Interface for strategy pattern. Allows for different implementations of the compute method.
 */
public interface AverageStrategy {
	/*
	 * 
	 */
	public int compute(List<Integer> grades) throws EmptyListException;
}
