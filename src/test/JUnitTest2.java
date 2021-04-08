package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitTest2 {

	@Test
	public void JUnitTest2() {
		Calculator c = new Calculator();
		assertEquals(40, c.sum(20,20));
	}

}
