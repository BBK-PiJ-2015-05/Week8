import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

/**
* Week 8 Day 15
* 5. Prime Divisors
* @author Sarah Connor
*/

public class TestPrimeDivisors{
	
	private PrimeDivisorListImpl test = new PrimeDivisorListImpl();

	@Test (expected = RuntimeException.class)
	public void testsPrimeDivisorAddNullPointerException(){
		test.add(null);
	}
	
	@Test (expected = RuntimeException.class)
	public void testsPrimeDivisorAddNonPrime(){
		test.add(4);
	}
	
	@Test
	public void testsIsPrime(){
		assertTrue(test.isPrime(5));
		assertFalse(test.isPrime(4));
	}
	
}