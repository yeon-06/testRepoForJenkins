package testProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void JUnitTest() {
		Calculator c = new Calculator();
		assertEquals(30, c.sum(10,20));
	}
}
