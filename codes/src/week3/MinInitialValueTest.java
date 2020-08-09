package week3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinInitialValueTest {

	@Test
	public void testCase1() {
		// test case 1 is the example in the algorithm outline
		int[] trajectory = {-2,3,-4,5,-2,1};
		assertEquals(2,MinInitialValue.findInitialValue(trajectory, 5));

		// if max capacity is 4, we cannot complete the trajectory because
		// at some stage we have to ascend 5
		assertEquals(-1,MinInitialValue.findInitialValue(trajectory, 4));
	}

	@Test
	public void testCase2() {
		// simple example where we need an initial level of 1
		int[] trajectory = {-3,3,-3,4};
		assertEquals(1,MinInitialValue.findInitialValue(trajectory, 4));
	}

	@Test
	public void testCase3() {
		// simple example where we have too much charge
		// initial level should be 0
		int[] trajectory = {-3,-5,-2,3};
		assertEquals(0,MinInitialValue.findInitialValue(trajectory, 3));
		
		// reduce max capacity so that we cannot complete trajectory
		assertEquals(-1,MinInitialValue.findInitialValue(trajectory, 2));
	}

	@Test
	public void testCase4() {
		// checking if consecutive positive or negative integers affect the
		// program (it shouldn't!)

		// should be able to complete with 0 at start
		int[] trajectory_1 = {-1,-1,-1,3,-2,-2,4};
		assertEquals(0,MinInitialValue.findInitialValue(trajectory_1, 4));

		// need 3 at start, then should be able to complete trajectory
		int[] trajectory_2 = {1,1,1,-4,1,1,1};
		assertEquals(3,MinInitialValue.findInitialValue(trajectory_2, 4));
	}

}