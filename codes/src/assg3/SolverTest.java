package assg3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolverTest {

	private static Solver s;
	// change the path as necessary
	private String PATH = "src/secret3/data/";
	
	@Test (timeout=500)
	public void test_p1_1() {
		s = new Solver();
		int[] expected = {1,4};
		int[] actual = s.solve_1(PATH + "p1_01.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}
	
	@Test (timeout=500)
	public void test_p1_2() {
		s = new Solver();
		int[] expected = {1,22};
		int[] actual = s.solve_1(PATH + "p1_02.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}
	
	@Test (timeout=500)
	public void test_p1_3() {
		s = new Solver();
		int[] expected = {1,27};
		int[] actual = s.solve_1(PATH + "p1_03.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}
	
	@Test (timeout=500)
	public void test_p2_1() {
		s = new Solver();
		int[] expected = {20,0};
		int[] actual = s.solve_2(PATH + "p2_01.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}
	
	@Test (timeout=500)
	public void test_p2_2() {
		s = new Solver();
		int[] expected = {30,0};
		int[] actual = s.solve_2(PATH + "p2_02.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}
	
	@Test (timeout=500)
	public void test_p2_3() {
		s = new Solver();
		int[] expected = {80,0};
		int[] actual = s.solve_2(PATH + "p2_03.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}
	
	@Test (timeout=500)
	public void test_p3_1() {
		s = new Solver();
		int[] expected = {20,120};
		int[] actual = s.solve_3(PATH + "p3_01.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}

	@Test (timeout=500)
	public void test_p3_2() {
		s = new Solver();
		int[] expected = {20,105};
		int[] actual = s.solve_3(PATH + "p3_02.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}

	/* thanks to dark hairy from MACS discord */
	@Test (timeout=500)
	public void test_p3_3() {
		s = new Solver();
		int[] expected = {30,75};
		int[] actual = s.solve_3(PATH + "p3_03.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}
	
	/* thanks to dark hairy from MACS discord */
	@Test (timeout=500)
	public void test_p3_4() {
		s = new Solver();
		int[] expected = {27,76};
		int[] actual = s.solve_3(PATH + "p3_04.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}
	
	@Test (timeout=500)
	public void test_p3_5() {
		s = new Solver();
		int[] expected = {4,140};
		int[] actual = s.solve_3(PATH + "p3_05.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}
	
	@Test (timeout=500)
	public void test_p3_6() {
		s = new Solver();
		int[] expected = {12,690};
		int[] actual = s.solve_3(PATH + "p3_06.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}

	@Test (timeout=500)
	public void test_p3_7() {
		s = new Solver();
		int[] expected = {30,1200};
		int[] actual = s.solve_3(PATH + "p3_07.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}
	
	@Test (timeout=500)
	public void test_p3_8() {
		s = new Solver();
		int[] expected = {5,325};
		int[] actual = s.solve_3(PATH + "p3_08.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}
	
	@Test (timeout=500)
	public void test_p3_9() {
		s = new Solver();
		int[] expected = {80,6630};
		int[] actual = s.solve_3(PATH + "p3_09.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}
	
	@Test (timeout=1000)
	public void test_p3_10() {
		s = new Solver();
		int[] expected = {150,397716};
		int[] actual = s.solve_3(PATH + "p3_10.in");
		assertEquals(expected[0],actual[0]);
		assertEquals(expected[1],actual[1]);
	}
	
}
