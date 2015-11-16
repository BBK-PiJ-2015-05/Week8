import org.junit.*;
import static org.junit.Assert.*;

/**
* Week 8 Day 15
* 4. More Patients
* @author Sarah Connor
*/

public class TestPatients{

	private Patient testPatient;
	private PatientList testList;
	
	@Test (expected = RuntimeException.class)
	public void testsPatientConstructorNegative(){
		testPatient = new Patient("Herbert", 2020);
	}
	
	@Test (expected = RuntimeException.class)
	public void testsPatientConstructorOver130(){
		testPatient = new Patient("Herbert", 1420);
	}
	
	@Test (expected = RuntimeException.class)
	public void testsPatientListAddInvalid(){
		testList.add("Herbert", 1420);
	}
}