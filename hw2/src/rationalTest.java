import static org.junit.Assert.*;

import org.junit.Test;


public class rationalTest {

	@Test
	public void testNumerator() {
		assertEquals("both positive", 5, TwoA.newRationalIntInt(5,3));
		assertEquals("one negative. returns the negative", -5, TwoA.newRationalIntInt(-5,3));
		assertEquals("returns most reduced form of fraction", 5, TwoA.newRationalDouble(2.5));

	}

	@Test
	public void testDenominator() {
		assertEquals("both positive", 3, TwoA.newRationalIntInt(5,3));
		assertEquals("doesn't return negative", 3, TwoA.newRationalIntInt(-5,3));
		assertEquals("returns most reduced form of fraction", 2, TwoA.newRationalDouble(2.5));
	}

	@Test
	public void testMultiplyInt() {
		//Since this won't compile, assume for this test that I've created a working rational with a numerator of 3 and denominator of 2. It is called "forTesting"
		Rational forTesting=new Rational (3,2);
		assertEquals("a positive", rational.newRational(9,2), forTesting.rational.multiply(3));
		assertEquals("a negative", rational.newRational(-9,2), forTesting.rational.multiply(-3));

	}

	@Test
	public void testMultiplyRational() {
		Rational forTesting=new Rational (4,2);
		assertEquals ("Two positives", rational.newRational(16, 4), forTesting.rational.multiply(rational.newRational(4, 2)));
		assertEquals ("one negative", rational.newRational(-16, 4), forTesting.rational.multiply(rational.newRational(-4, 2)));

	}

	@Test
	public void testReciprocal() {
		assertEquals ("created from a double", rational.newRational(4, 1), rational.reciprocal(rational.newRational(.25)));
		assertEquals ("from two ints", rational.newRational(4, 1), rational.reciprocal(rational.newRational(1, 4)));

	}

	@Test
	public void testToDouble() {
		assertEquals ("Two positives", .25, rational.todouble(rational.newRational(4, 16)));
		assertEquals ("One Positive", -.25, rational.todouble(rational.newRational(-4, 16)));
		assertEquals ("Two Negatives", .25, rational.todouble(rational.newRational(-4, -16)));

	}


	@Test
	public void testNewRationalIntInt() {
		assertEquals ("numerator set correctly", 4, rational.newRational(4, 16)));
		assertEquals ("denominator set correctly", 16, rational.newRational(4, 16)));

	}

	@Test
	public void testNewRationalDouble() {
		assertEquals ("gives input back when cast to double", 4.5, rational.toDouble(rational.newRational(4.5))));
	}

}
