/**
* Week 8 Day 15
* 2. Exception
* @author Sarah Connor
*/

public class ExceptionLauncher{

	public int divide(int a, int b){
		try{
			int sum = a / b;
			return sum;
		}catch(ArithmeticException e){
			System.out.println("cannot divide by zero");
			return -1;
		}
	}
	
}