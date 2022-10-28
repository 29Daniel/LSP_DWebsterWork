package org.howard.edu.lsp.midterm.problem2;

/**
 * Daniel Webster
 * @author 29Daniel
 */
/**
 * Allows for the storing of data about a person
 */
public class Person {
	/**
	 * stores name of person
	 */
	private String name; 
	
	/**
	 * stores age of person
	 */
	private int age; 
	
	/**
	 * stores social security number of person
	 */
	private String socialSecurityNumber;
	
	/**
	 * Default Constructor
	 */
	Person(String name,int age, String socialSecuirtyNumber) {
		this.name = name;
		this.age = age;
		this.socialSecurityNumber = socialSecuirtyNumber;
	}
	
	/**
	 * Overriding toString() method of String class
	 */
    @Override
    public String toString() {
        return "Name: " + name + " " + "Age: " + age + " " + "SSN: " + socialSecurityNumber;
    }
	
    /**
     * Overriding equals() method of String class
     */
    @Override
    public boolean equals(Object o) {
    	Person personTwo = (Person) o;
    	if(socialSecurityNumber == personTwo.socialSecurityNumber) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

}
