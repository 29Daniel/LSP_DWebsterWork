package org.howard.edu.lsp.midterm.problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

/**
 * 
 * Class to test public methods of VotingMachine
 *
 */
class VotingMachineTest {

	@DisplayName("Test case for getVotes when a candidate is present")
	@Test
	void testGetVotesWhenCandidatePresent() throws UnknownCandidateException {
		VotingMachine machineOne = new VotingMachine();
		machineOne.addCandidate("Phil");
		machineOne.castVotes("phil", 10);
		try {
			assertEquals(machineOne.getVotes("pHil"), 10);
		}
		catch(UnknownCandidateException uce) {
			Assert.fail("HashMap should not be empty");
		}
		
	}
	
	@DisplayName("Test case for getVotes when a candidate is not present")
	@Test
	void testGetVotesWhenCandidateNotPresent() throws UnknownCandidateException {
		VotingMachine machineOne = new VotingMachine();
		assertThrows(UnknownCandidateException.class, () -> machineOne.getVotes("phil"));
	}
	
	@DisplayName("Test case for sum when there are no candidates")
	@Test
	void testSumWhenNoCandidatesArePresent() {
		VotingMachine machineOne = new VotingMachine();
		assertEquals(machineOne.sum(), 0);
	}
	
	@DisplayName("Test case for sum when there are no votes")
	@Test
	void testSumWhenNoVotesArePresent(){
		VotingMachine machineOne = new VotingMachine();
		machineOne.addCandidate("Phil");
		machineOne.addCandidate("Reiner");
		assertEquals(machineOne.sum(), 0);
	}
	
	@DisplayName("Test case for sum when there are votes")
	@Test
	void testSumWhenVotesArePresent(){
		VotingMachine machineOne = new VotingMachine();
		machineOne.addCandidate("Levi");
		machineOne.addCandidate("Reiner");
		machineOne.addCandidate("Eren");
		machineOne.castVotes("levi", 34);
		machineOne.castVotes("Eren", 5);
		assertEquals(machineOne.sum(), 39);
	}

}
