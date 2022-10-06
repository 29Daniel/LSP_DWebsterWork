package org.howard.edu.lsp.assignment4;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Daniel Webster
 * @author 29Daniel
 *
 */
/**
 * Runs and tests methods in Integer 
 */
public class Driver {
    /**
     * Helper function to print contents of two sets
     * @param setOne IntegerSet object
     * @param setTwo IntegerSet object
     */
    public static void printContentOfSets(IntegerSet setOne, IntegerSet setTwo) {
        System.out.println("Contents of Set One: " + setOne.toString());
        System.out.println("Contents of Set Two: " + setTwo.toString());
	}
    /**
     * Main function where the code is run
     * @param args default arguments for main function 
     */
	public static void main(String[] args) {
	    IntegerSet setOne = new IntegerSet();
	    IntegerSet setTwo = new IntegerSet();
	    
	    // Checking if the sets are empty
	    System.out.println("--Printing Empty Sets--");
	    printContentOfSets(setOne, setTwo);
	    System.out.println("Is Set One Empty: " + setOne.isEmpty());
	    System.out.println("Is Set Two Empty: " + setTwo.isEmpty());
	    setOne.add(6);
	    setOne.add(9);
	    setOne.add(1);
	    setTwo.add(6);
	    setTwo.add(10);
	    setTwo.add(0);
	    setTwo.add(1);
	    setTwo.add(1); // Added extra 1 to Set Two- no additional 1 will be shown 
	    // Populating the sets
	    System.out.println("\n--Adding elements--");
	    printContentOfSets(setOne, setTwo);
	    System.out.println("Length of Set One: " + setOne.length());
	    System.out.println("Length of Set Two: " + setTwo.length());
	    // Checking for elements in set
	    System.out.println("\n--Contains a certain element--");
	    System.out.println("Does Set One contain 9: " + setOne.contains(1));
	    System.out.println("Does Set One contain 0: " + setOne.contains(0));
	    // Removing desired element from the sets
	    System.out.println("\n--Remove element--");
	    printContentOfSets(setOne, setTwo);
	    setOne.remove(9);
	    setTwo.remove(10);
	    System.out.println("After removing 9 from Set One and 10 from Set Two:");
	    printContentOfSets(setOne, setTwo);
	    // Checking if the two sets are equal to each other
	    System.out.println("\n--Checking if two Sets are equal--");
	    printContentOfSets(setOne, setTwo);
	    System.out.println("Are Set 1 and Set 2 equal: " + setOne.equals(setTwo));
	    setTwo.remove(0);
	    printContentOfSets(setOne, setTwo);
	    System.out.println("Are Set 1 and Set 2 equal: " + setOne.equals(setTwo));
	    // Clearing out all the elements within a set
	    System.out.println("\n--Clearing Elements--");
	    System.out.println("Contents of Set Two: " + setTwo.toString());
	    setTwo.clear();
	    System.out.println("Contents of Set Two: " + setTwo.toString());
	    //Checking for the largest and smallest elements in a set
	    System.out.println("\n--Checking for largest and smallest elements--");
        // Try catch block of largest element in Set One
	    try {
	        System.out.print("Largest element in Set One: ");
	        System.out.println(setOne.largest());
	    }
	    catch(IntegerSetException ise) {
	        System.out.print("List is empty");
	    }
	    // Try catch block of smallest element in Set One
	    try {
	       System.out.print("Smallest element in Set One: ");
	       System.out.println(setOne.smallest());
	    }
	    catch(IntegerSetException ise) {
	        System.out.print("List is empty");
	    }
	    // Try catch block of largest element in Set Two
	    try {
	        System.out.print("Largest element in Set Two: ");
	        System.out.println(setTwo.largest());
	    }
	    catch(IntegerSetException ise) {
	        System.out.println("List is empty");
	    }
	    // Try catch block of smallest element in Set Two
	    try {
	       System.out.print("Smallest element in Set Two: ");
	       System.out.println(setTwo.smallest());
	    }
	    catch(IntegerSetException ise) {
	        System.out.println("List is empty");
	    }
	    // Checking for when two sets form a union with each other
	    setTwo.add(6);
	    setTwo.add(10);
	    setTwo.add(0);
	    setTwo.add(1);
	    System.out.println("\n--Union of Sets--");
	    System.out.println("Members of Set One: " + setOne.toString());
	    System.out.println("Members of Set Two: " + setTwo.toString());
	    setOne.union(setTwo);
	    System.out.println("Union: " + setOne.toString());
	    // Checking for when two sets intersect each other
	    System.out.println("\n--Intersection of Sets--");
	    setOne.clear();
	    setOne.add(6);
	    setOne.add(9);
	    setOne.add(1);
	    System.out.println("Members of Set One: " + setOne.toString());
	    System.out.println("Members of Set Two: " + setTwo.toString());
	    setOne.intersect(setTwo);
	    System.out.println("Intersection: " + setOne.toString());
	    // Checking for the difference of two sets each other
	    System.out.println("\n--Difference of Sets--");
	    setOne.clear();
	    setOne.add(6);
	    setOne.add(9);
	    setOne.add(1);
	    System.out.println("Members of Set One: " + setOne.toString());
	    System.out.println("Members of Set Two: " + setTwo.toString());
	    setOne.diff(setTwo);
	    System.out.println("Difference: " + setOne.toString());    
	}
}