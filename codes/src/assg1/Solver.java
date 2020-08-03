package assg1;

import java.io.FileReader;
import java.util.Scanner;

public class Solver {
	
	public static void main(String[] args) {
		Solver s = new Solver();
		s.solve(null);
	}
	
	/** The solve method accepts a String containing the 
	 * path to the input file of a space partition problem
	 * as described in the assignment specification and 
	 * returns a two-dimensional String array containing 
	 * the solution.
	 * 
	 * @param infile the input file containing the problem
	 * @return solution to the space partition problem
	 */
	public String[][] solve(String infile){
		
		infile = "codes/src/assg1/data/test_case_01.in";
		/*
		 Here is a simple try-catch block for readData.
		 If you don't know what try/catch and exceptions are,
		 you don't have to worry about it for this unit, but
		 it would be good if you can learn a bit of it.
		*/
		try {
			readData(infile);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * The readData method accepts a String containing the 
	 * path to the input file containing the details of the
	 * problem (size of grid, number of sections, etc). 
	 * Please see the assignment specification for more information
	 * on the input format.
	 * 
	 * You should use this method to populate this class with 
	 * the information that you need to solve the problem.
	 * 
	 * I also recommend the use of Scanner class (I have written a
	 * little bit for you to start with), but you may choose to
	 * use something else. 
	 * 
	 * @param infile the input file containing the problem
	 * @throws Exception if file is not found or there is input reading error
	 */
   	public void readData(String infile) throws Exception {
   		Scanner in = new Scanner(new FileReader(infile));
   	}
}
