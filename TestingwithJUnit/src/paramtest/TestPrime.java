package paramtest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.runners.Parameterized;

import org.junit.runner.RunWith;
import org.junit.Test;

@RunWith(Parameterized.class)

public class TestPrime {

	private final Integer inputnumber;
	private final boolean expectedResult;
	private PrimeNumber primenumber;

	@Before
	public void initialize() {
		primenumber = new PrimeNumber();
	}

	public TestPrime(Integer inputnumber, boolean expectedResult) {
		super();
		this.inputnumber = inputnumber;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(
				new Object[][] { { 2, true }, 
					{ 6, false }, 
					{ 19, true }, 
					{ 22, false }, 
					{ 23, true }, 
					{ 24, false },
					{10,false}});
	}

	@Test
	public void testValidator() {
		System.out.println("Parameterized number is " + inputnumber);
		assertEquals(expectedResult, PrimeNumber.validate(inputnumber));
	}

}
