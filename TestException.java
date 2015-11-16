import org.junit.*;
import static org.junit.Assert.*;

/**
* Week 8 Day 15
* 2. Exception
* @author Sarah Connor
*/

public class TestException{

	ExceptionLauncher testExceptions;
	
	@Before
	public void initialise(){
		testExceptions = new ExceptionLauncher();
	}
	
	@Test
	public void testForExpectedExceptionWithAnnotation(){
		assertNotNull(testExceptions.divide (1, 0));
	}
}

