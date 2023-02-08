package sheet2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {

	@Test
	public void testIsEvenOnEvenNumbers() {
		assertTrue(Main.isEven(0));
		assertTrue(Main.isEven(2));
		assertTrue(Main.isEven(4));
	}

	@Test
	public void testIsEvenOnOddNumbers() {
		assertFalse(Main.isEven(1));
		assertFalse(Main.isEven(3));
		assertFalse(Main.isEven(5));
	}


}