package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitTest2 {

	@Test
	public void JUnitTest2() {
		assertEquals(40, sum(20,20));
	}
	
	public int sum(int x, int y) {
		return x+y;
	}

}
