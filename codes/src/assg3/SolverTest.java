package assg3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolverTest {

	private static Solver s = new Solver();
	// change the path as necessary
	private String PATH = "/codes/src/assg3/data/";
	
	@Test (timeout=500)
	public void test_p1_1() {
		int[] expected = {1,4};
		int[] actual = s.solve_1(PATH + "p1_1.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}
	
	@Test (timeout=500)
	public void test_p2_1() {
		int[] expected = {20,0};
		int[] actual = s.solve_2(PATH + "p2_1.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}
	
	@Test (timeout=500)
	public void test_p3_1() {
		int[] expected = {20,120};
		int[] actual = s.solve_3(PATH + "p3_1.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}

	@Test (timeout=500)
	public void test_p3_2() {
		int[] expected = {20,105};
		int[] actual = s.solve_3(PATH + "p3_2.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}

}
