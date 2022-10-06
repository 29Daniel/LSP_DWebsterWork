package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * Daniel Webster
 * @author 29Daniel
 */
/**
 * Allows for the creation and manipulation of sets
 */
public class IntegerSet  {
	/**
	 * List to store contents of set
	 */
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * Default Constructor
	 */
	public IntegerSet() {};
	
	/**
	 * Clears the contents of the set
	 */
    public void clear() {
        if(!set.isEmpty()) {
            set.clear();
        }
    };

    /**
     * Returns the length of the set
     * @return the length of the set as an integer
     */
    public int length() {
        return set.size();
    };

    /*
                  * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order.
    */
    /**
     * Returns true if the content of the 2 sets are equal else returns false
     * @param integerSetB the object of the being compared
     * @return a boolean value depending on if the 2 sets are equal or not
     */
    public boolean equals(IntegerSet integerSetB) {
        if(set.containsAll(integerSetB.set) && length() == integerSetB.length()) {
            return true;
        }
        else {
            return false;
        }
    }; 
    
    /**
     * Checks if the set is empty and returns true if it is or false if it isn't
     * @return a boolean value 
     */
    boolean isEmpty() {
        if(set.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }; 

    /**
     * Checks if the inputed value is contained within the set.
     * Returns true if it is or false if it isn't
     * @param value being checked for its presence in the set
     * @return a boolean value
     */
    public boolean contains(int value) {
        if(set.contains(value))
            return true;
        else
            return false;
    };    

    /**
     * Finds and returns the largest value contained within the set. If
     * the list is empty then an IntegerSetException is thrown
     * @return the largest value in the set
     * @throws IntegerSetException thrown when the list is empty
     */
    public int largest() throws IntegerSetException {
        if(isEmpty()) {
            throw new IntegerSetException();
        }
        else {
            List<Integer> tempSet = new ArrayList<Integer>(set);
            Collections.sort(tempSet);
            return tempSet.get(length()-1);
        }
    }; 

    /**
     * Finds and returns the smallest value contained within the set. If
     * the list is empty then an IntegerSetException is thrown
     * @return the smallest value in the set
     * @throws IntegerSetException thrown when the list is empty
     */
    public int smallest() throws IntegerSetException {
       if(isEmpty()) {
           throw new IntegerSetException();
       }
       else {
            List<Integer> tempSet = new ArrayList<Integer>(set);
            Collections.sort(tempSet);
            return tempSet.get(0);
       }
    };
    
	/**
	 * Adds an item to the set. If the item already exists then the item won't be added to the set.	
	 * @param item integer to be added to the set
	 */
 	public void add(int item) {
 	    if(!contains(item)) {
 	        set.add(item);
 	    }
 	};

    /**
     * Removes the inputed item from the set. If the item is not found then
     * nothing is removed from the set
     * @param item integer to be removed from the set
     */
    public void remove(int item) {
        if(contains(item)) {
            set.remove(Integer.valueOf(item));
        }
    }; 

    /**
     * Forms a union between the 2 sets. If there are items that intersect in the sets,
     * then the extra item is not included in the union
     * @param integerSetB set object to form union with
     */
    public void union(IntegerSet integerSetB) {
        List<Integer> tempSet = new ArrayList<Integer>(integerSetB.set);
        tempSet.removeAll(set);
        set.addAll(tempSet);
    };
    
    /**
     * Forms an intersection the items that overlap between 2 sets.
     * @param integerSetB set object to form intersection with
     */
    public void intersect(IntegerSet integerSetB) {
        set.retainAll(integerSetB.set);
    }; 
    
    /**
     * Gets the difference between two sets. In other words the unique contents
     * of a set
     * @param integerSetB set object used in finding difference
     */
    public void diff(IntegerSet integerSetB) {
        List<Integer> tempSet = new ArrayList<Integer>(set);
        set.removeAll(integerSetB.set);
    };

    /**
     * Converts and returns set(stored as a List) to a string
     * @return a string of the set
     */
    public String toString() {
        String output = "{";
        for(int index = 0; index < length();index++) {
            output += set.get(index);
            if(index != length()-1){
                output += ", ";
            }
        }   
        output+= "}";
        return output;
    };
}