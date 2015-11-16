import java.util.List;
import java.util.ArrayList;

/**
* Week 8 Day 15
* 4. More Patients
* @author Sarah Connor
*/

public class PatientList{

	private List<Patient> patientList;
	
	public PatientList(){
		this.patientList = null;
	}
	
	public void add(String name, int birthYear){
		Patient newPatient;
		try{
			newPatient = new Patient(name, birthYear);
			patientList.add(newPatient);
		}catch(IllegalArgumentException e){
			System.out.println("ERROR was thrown " + e.getMessage());
		}
	}
}