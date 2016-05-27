package rkppl.kelompok3.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import rkppl.kelompok3.tubes.D;

public class TestD {
	private D d;

	@Before
	public void awalTest() {
		d = new D();
		System.out.println("Mengawali Testing");
	}

	@Test
	public void testCase1() {
		assertNotSame("Seharusnya error", d.pow(2.0, 0.6), 2.6);
	}

	@Test
	public void testCase2() {
		assertEquals("Harusnya tidak error", d.pow(2.2, 4.5), 6.7);
	}

	@After
	public void setelahTest() {
		System.out.println("Mengakhiri Testing");
	}

}
