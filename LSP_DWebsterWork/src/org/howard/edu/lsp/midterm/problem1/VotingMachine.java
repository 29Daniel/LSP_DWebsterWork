package org.howard.edu.lsp.midterm.problem1;

import java.util.HashMap;
/**
 * Daniel Webster
 * @author 29Daniel
 */
/**
 * Allows for the casting and tracking of votes
 */
public class VotingMachine {
	/**
	 * Holds the names of the candidates and many votes each one got
	 */
	private HashMap<String, Integer> candidates = new HashMap<String, Integer>();
	
	/**
	 * Adds a candidate to the voting machine
	 * @param name a String of the candidate entered in
	 */
	public void addCandidate(String name) {
		if(!candidates.containsKey(name.toLowerCase())) {
			candidates.put(name.toLowerCase(), 0);
		}
	}
	
	/**
	 * Adds votes to the candidate that has been inputed
	 * @param name string of the candidate's name
	 * @param votes int of the number of votes for a certain candidate
	 */
	public void castVotes(String name, int votes) {
		if(candidates.containsKey(name.toLowerCase())) {
			candidates.put(name.toLowerCase(), votes);
		}
	}
	
	/**
	 * Returns number of votes inputed candidate received
	 * @param name string of candidate's name
	 * @return number of votes as an int
	 * @throws UnknownCandidateException to be throw when the candidate inputed can not be found
	 */
	public int getVotes(String name) throws UnknownCandidateException{
		if(candidates.containsKey(name.toLowerCase())) {
			return candidates.get(name.toLowerCase());
		}
		else {
			throw new UnknownCandidateException();
		}
	}
	
	/**
	 * Finds sum of the total number of votes for all candidates
	 * @return total number of votes as an int
	 */
	public int sum() {
		int totalVotes = 0;
		for (int votes : candidates.values()) {
		    totalVotes += votes;
		}
		return totalVotes;
	}

}