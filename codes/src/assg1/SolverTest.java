package assg1;


import static org.junit.Assert.*;

import java.io.FileReader;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class SolverTest {

	private static Solver s = new Solver();
	private static int h;
	private static int w;
	private static String[][] expected;
	
	private String PATH = "codes/src/assg1/data/";
	
	public String[][] readSolution(String infile) throws Exception{
		Scanner in = new Scanner(new FileReader(infile));
		h = in.nextInt();
		w = in.nextInt();
		expected = new String[h][w];
		for (int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				expected[i][j] = in.next();
			}
		}
		return expected;
	}

	@Before 
	public void initialize() {
		s = new Solver();
	}
	
	@Test (timeout=100)
	public void testSmall_1() {
		try {
			expected = readSolution(PATH + "test_case_01.out");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		String[][] actual = s.solve(PATH + "test_case_01.in");
		assertNotNull(actual);
		assertEquals(actual.length,h);
		assertNotNull(actual[0]);
		assertEquals(actual[0].length,w);
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				assertEquals(actual[i][j],expected[i][j]);
			}
		}
	}

	@Test (timeout=100)
	public void testSmall_2() {
		try {
			readSolution(PATH + "test_case_02.out");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		String[][] actual = s.solve(PATH + "test_case_02.in");
		assertNotNull(actual);
		assertEquals(actual.length,h);
		assertNotNull(actual[0]);
		assertEquals(actual[0].length,w);
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				assertEquals(actual[i][j],expected[i][j]);
			}
		}
	}	
	
	@Test(timeout=100)
	public void testSmall_3() {
		try {
			readSolution(PATH + "test_case_03.out");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		String[][] actual = s.solve(PATH + "test_case_03.in");
		assertNotNull(actual);
		assertEquals(actual.length,h);
		assertNotNull(actual[0]);
		assertEquals(actual[0].length,w);
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				assertEquals(actual[i][j],expected[i][j]);
			}
		}
	}	

	@Test (timeout=100)
	public void testSmall_4() {
		try {
			readSolution(PATH + "test_case_04.out");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		String[][] actual = s.solve(PATH + "test_case_04.in");
		assertNotNull(actual);
		assertEquals(actual.length,h);
		assertNotNull(actual[0]);
		assertEquals(actual[0].length,w);
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				assertEquals(actual[i][j],expected[i][j]);
			}
		}
	}	

	@Test (timeout=1000)
	public void testMedium_1() {
		try {
			readSolution(PATH + "test_case_05.out");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		String[][] actual = s.solve(PATH + "test_case_05.in");
		assertNotNull(actual);
		assertEquals(actual.length,h);
		assertNotNull(actual[0]);
		assertEquals(actual[0].length,w);
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				assertEquals(actual[i][j],expected[i][j]);
			}
		}
	}	
	
	@Test (timeout=1000)
	public void testMedium_2() {
		try {
			readSolution(PATH + "test_case_06.out");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		String[][] actual = s.solve(PATH + "test_case_06.in");
		assertNotNull(actual);
		assertEquals(actual.length,h);
		assertNotNull(actual[0]);
		assertEquals(actual[0].length,w);
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				assertEquals(actual[i][j],expected[i][j]);
			}
		}
	}	
	
	@Test (timeout=1000)
	public void testMedium_3() {
		try {
			readSolution(PATH + "test_case_07.out");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		String[][] actual = s.solve(PATH + "test_case_07.in");
		assertNotNull(actual);
		assertEquals(actual.length,h);
		assertNotNull(actual[0]);
		assertEquals(actual[0].length,w);
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				assertEquals(actual[i][j],expected[i][j]);
			}
		}
	}	
	
	@Test (timeout=1000)
	public void testMedium_4() {
		try {
			readSolution(PATH + "test_case_08.out");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		String[][] actual = s.solve(PATH + "test_case_08.in");
		assertNotNull(actual);
		assertEquals(actual.length,h);
		assertNotNull(actual[0]);
		assertEquals(actual[0].length,w);
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				assertEquals(actual[i][j],expected[i][j]);
			}
		}
	}	
	
	@Test (timeout=100000)
	public void testLarge_1() {
		try {
			readSolution(PATH + "test_case_09.out");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		String[][] actual = s.solve(PATH + "test_case_09.in");
		assertNotNull(actual);
		assertEquals(actual.length,h);
		assertNotNull(actual[0]);
		assertEquals(actual[0].length,w);
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				assertEquals(actual[i][j],expected[i][j]);
			}
		}
	}	
	
	@Test (timeout=100000)
	public void testLarge_2() {
		try {
			readSolution(PATH + "test_case_10.out");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		String[][] actual = s.solve(PATH + "test_case_10.in");
		assertNotNull(actual);
		assertEquals(actual.length,h);
		assertNotNull(actual[0]);
		assertEquals(actual[0].length,w);
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				assertEquals(actual[i][j],expected[i][j]);
			}
		}
	}	

}
