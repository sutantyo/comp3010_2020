package assg2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolverTest {

	private static Solver s;

	// change the path as necessary
	private String PATH = "src/secret2/data/";
	
	@Before 
	public void initialize() {
		s = new Solver();
	}
	
	@Test (timeout=500)
	public void testSmall_1() {
		int expected = 32;
		int actual = s.solve(PATH + "test_case_01.in");
		assertEquals(expected,actual);
	}
	
	@Test (timeout=500)
	public void testSmall_2() {
		int expected = 36;
		int actual = s.solve(PATH + "test_case_02.in");
		assertEquals(expected,actual);
	}
	
	@Test (timeout=500)
	public void testSmall_3() {
		int expected = 35;
		int actual = s.solve(PATH + "test_case_03.in");
		assertEquals(expected,actual);
	}
	
	@Test (timeout=500)
	public void testSmall_4() {
		int expected = 440;
		int actual = s.solve(PATH + "test_case_04.in");
		assertEquals(expected,actual);
	}
	
	@Test (timeout=500)
	public void testSmall_5() {
		int expected = 10295;
		int actual = s.solve(PATH + "test_case_05.in");
		assertEquals(expected,actual);
	}
	
	@Test (timeout=500)
	public void testSmall_6() {
		int expected = 13429;
		int actual = s.solve(PATH + "test_case_06.in");
		assertEquals(expected,actual);
	}
}