package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	Calculator c = new Calculator();

	@Test
	public void testAdd() {
		assertEquals(15, c.add(10, 5));
		assertEquals(25, c.add(20, 5));
		assertEquals(35, c.add(20, 15));
		assertEquals(5, c.add(0,5));
	}

	@Test
	public void testSub() {
		assertEquals(5, c.sub(10,5));
		assertEquals(95, c.sub(100,5));
		assertEquals(5, c.sub(20,15));
		assertEquals(5,	c.sub(10,5));
	}
 	@Test
	public void testMulti() {
		assertEquals(50, c.Multi(10, 5));
		assertEquals(5, c.Multi(1, 5));
		assertEquals(30, c.Multi(2, 15));
		assertEquals(5, c.Multi(0,5));
	}
  	@Test
	public void testDivde() {
		assertEquals(5, c.Divde(10, 5));
		assertEquals(5, c.Divde(10, 5));
		assertEquals(5, c.Divde(20, 15));
		assertEquals(5, c.Divde(0,5));
	}
}
