import java.util.List;
import java.util.ArrayList;

/**
* Week 8 Day 15
* 1. Code Flow
* Sarah Connor
*/

public class CodeFlow{
	
	public static void main(String[] args){
		CodeFlow codeLaunch = new CodeFlow();
		codeLaunch.launch(6);
	}
	
	/*
	* if userInput = 0, code executes launch()lines 34 - 52
	* the list will be empty and encounter an error at line 53
	* it will then jump to the catch in line 56 and execute 57
	*
	* if userInput = 2, code executes lines 34 - 48
	* the list will then only be two elements long and will error at 49
	* it will then jump to the catch at 56 and execute 57
	*
	* if userInput = 4, code executes lines 34 - 44 and the list will only
	* have 4 elements and error at line 45 and will jump to 56 and execute 57
	*
	* if userInput = 6, code executes lines 34 - 42, it will then try
	* get at the 6th index but error out of bounds at  line 43
	* it will then jump to 56 and execute 57
	*/
	public void launch(int userInput) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		try {
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
		} catch (IndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
	}
}