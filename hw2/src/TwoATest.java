import static org.junit.Assert.*;

import org.junit.Test;

public class TwoATest {

	@Test
	public void testIsMultiple() {
		assertEquals(
				"Testing two positive integers. First smaller than second.",
				false, TwoA.isMultiple(5, 10));
		assertEquals(
				"Testing two positive integers. the first is a multiple of the second.",
				true, TwoA.isMultiple(15, 5));
		assertEquals("Testing two positive integers. Both are equal", true,
				TwoA.isMultiple(5, 5));
		assertEquals(
				"Testing one positive integer. First smaller than second. A is not a multiple of B",
				false,TwoA.isMultiple(-5, 15));
		assertEquals(
				"Testing one positive integer. A is a multiple of B. A is negative",
				true, TwoA.isMultiple(-10, 5));
		assertEquals("Testing two negative integers. A is a multiple of B.",
				true, TwoA.isMultiple(-10, -2));
		assertEquals("Testing a as zero.", true, TwoA.isMultiple(0, 5));
		assertEquals("Testing b as zero", false, TwoA.isMultiple(5, 0));
	}

	@Test
	public void testIsOdd() {
		assertEquals("negative even", false, TwoA.isOdd(-2));
		assertEquals("negative odd", true, TwoA.isOdd(-5));
		assertEquals("positive odd", true, TwoA.isOdd(5));
		assertEquals("positive even", false, TwoA.isOdd(10));
		// Integer.MAX_VALUE is 2147483647, which is odd
		assertEquals("MAX_VALUE", true, TwoA.isOdd(Integer.MAX_VALUE));
		// Integer.MIN_VALUE is -2147483648, which is even
		assertEquals("MIN_VALUE", false, TwoA.isOdd(Integer.MIN_VALUE));

	}

	@Test
	public void testOddSumTo() {
		assertEquals("negative number", 0, TwoA.oddSumTo(-50));
		assertEquals("lower edge case.", 0, TwoA.oddSumTo(1));
		assertEquals("another lower edge case. (can there be two edge cases?)", 1, TwoA.oddSumTo(2));
		assertEquals("", 4, TwoA.oddSumTo(5));
	}

	@Test
	public void testIsOddProd() {
		assertEquals("two odd numbers", true, TwoA.isOddProd(new int[]{1,2,3}));
		assertEquals("one odd number", false, TwoA.isOddProd(new int[]{2,2,3}));
		assertEquals("all even numbers", false, TwoA.isOddProd(new int[]{2,2,8}));
		assertEquals("more than two odd numbers", true, TwoA.isOddProd(new int[]{2,2,3,8,7,9}));
		// I purposefully declined to test cases with one int, or no ints, because the wording of the requirements are ambiguous and I choose to interpret them to mean there must be at least two ints a precondition


	}


	@Test
	public void testAllDistinct() {
		assertEquals("all distinct", true, TwoA.allDistinct(new int[]{1,2,3}));
		assertEquals("one duplicate", false, TwoA.allDistinct(new int[]{1,1,3}));
		assertEquals("two duplicates", false, TwoA.allDistinct(new int[]{1,3,5,1,7,3}));
		// I purposefully declined to test cases with one int, or no ints, because the wording of the requirements are ambiguous and I choose to interpret them to mean there must be at least two ints a precondition
		
	}

	@Test
	public void testReverseInts() {
		//assertEquals("one item", (new int[]{1}), TwoA.reverseInts(new int[]{1}));
		//assertArrayEquals("an even amount of items", (new int[]{7,5,3,1}), TwoA.reverseInts(new int[]{1,3,5,7}));
		assertArrayEquals("an odd amount of items", (new int[]{9,7,5,3,1}), TwoA.reverseInts(new int[]{1,3,5,7,9}));
		assertArrayEquals("no items", (new int[]{}), TwoA.reverseInts(new int[]{}));
	}
	@Test
	public void testAverage() {
		//assertEquals("two evens", 7, TwoA.average(6,8));
		//assertEquals("one odd", 6, TwoA.average(5,8));
		//assertEquals("eqal of opposite magnitude", 0, TwoA.average(-8,8));
		//assertEquals("negative average", -1, TwoA.average(-10,8));
		//assertEquals("average of 1", 1, TwoA.average(1,1));
		//assertEquals("average of -1", -1, TwoA.average(-1,-1));
		assertEquals("average of 0", Integer.MAX_VALUE, TwoA.average(Integer.MAX_VALUE,Integer.MAX_VALUE));



	}
	

}
