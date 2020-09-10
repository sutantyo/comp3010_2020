package assg2;

import java.io.*;
import java.util.*;

public class Solver {
	
	/**
	 * You can use this to test your program without running the jUnit test,
	 * and you can use your own input file. You can of course also make your
	 * own tests and add it to the jUnit tests.
	 */
	public static void main(String[] args) {
		Solver m = new Solver();
		int answer = m.solve(null);
		System.out.println(answer);
		
	}
	
	/** The solve method accepts a String containing the 
	 * path to the input file for the problem (as described
	 * in the assignment specification) and returns an integer
	 * denoting the maximum income 
	 * 
	 * @param infile the file containing the input
	 * @return maximum income for this set of input
	 */
	
	public int solve(String infile) {
		try {
			readData(infile);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	/**
	 * The readData method accepts a String containing the 
	 * path to the input file for the problem.
	 * Please see the assignment specification for more information
	 * on the input format.
	 * 
	 * You should use this method to populate this class with 
	 * the information that you need to solve the problem.
	 * 
	 * @param infile the input file containing the problem
	 * @throws Exception if file is not found or if there is an input reading error
	 */
   	public void readData(String infile) throws Exception {

	}


}
