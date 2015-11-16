import java.util.Calendar;

/**
* Week 8 Day 15
* 4. More Patients
* @author Sarah Connor
*/

public class Patient{

	public String name;
	public int birthYear;
	
	public Patient(String name, int birthYear){
		this.name = name;
		int age = Calendar.getInstance().get(Calendar.YEAR) - birthYear;
		if (age < 0 || age > 130){
			throw new IllegalArgumentException("invalid age");
		}else{
			this.birthYear = birthYear;
		}
	}
}