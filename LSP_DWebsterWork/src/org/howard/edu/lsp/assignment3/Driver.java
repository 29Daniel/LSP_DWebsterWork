package org.howard.edu.lsp.assignment3;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test 1
		List<Integer[]> results = new ArrayList<Integer[]>();
		int[] data = new int[]{5,5,15,10};
	    int target = 15;
	    Combinations c1 = new Combinations();
	    List<Integer[]> expected = new ArrayList<Integer[]>(Arrays.asList(new Integer[]{0,3}, new Integer[]{1,3}, new Integer[]{2}));
	    results = c1.calculate_combinations(data, target);
		c1.print_results();
		test(results, expected);
		
		//Test 2
		List<Integer[]> results2 = new ArrayList<Integer[]>();
		int[] data2 = new int[]{1,1,1,1,2};
	    int target2 = 10;
	    Combinations c2 = new Combinations();
	    List<Integer[]> expected2 = new ArrayList<Integer[]>();
	    results = c2.calculate_combinations(data2, target2);
		c2.print_results();
		test(results2, expected2);
		
		//Test 3
		List<Integer[]> results3 = new ArrayList<Integer[]>();
		int[] data3 = new int[] {};
	    int target3 = 10;
	    Combinations c3 = new Combinations();
	    List<Integer[]> expected3 = new ArrayList<Integer[]>();
	    results = c3.calculate_combinations(data3, target3);
		c3.print_results();
		test(results3, expected3);
		
		//Test 4
		List<Integer[]> results4 = new ArrayList<Integer[]>();
		int[] data4 = new int[] {1,2,5,6,9};
	    int target4 = 15;
	    Combinations c4 = new Combinations();
	    List<Integer[]> expected4 = new ArrayList<Integer[]>(Arrays.asList(new Integer[] {0,2,4}, new Integer[] {3,4}));
	    results = c4.calculate_combinations(data4, target4);
		c4.print_results();
		test(results4, expected4);
	}
	
	public static void test(List<Integer[]> calculated_res, List<Integer[]> expected_res) {
		assertEquals(calculated_res.size(), expected_res.size());
		for(int x = 0; x < calculated_res.size(); x++) {
			assertArrayEquals(calculated_res.get(x), expected_res.get(x));
		}
	}

}
