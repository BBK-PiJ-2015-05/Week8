/**
* Week 8 Day 15
* 3. Error Handling on User Input
* @author Sarah Connor
*/

public class ErrorHandling{

	public static void main(String[] args){
		
		ErrorHandling test = new ErrorHandling();
		System.out.println(test.average());
	}
	
	public double average(){
		double num = 0;
		int amount = 0;
		System.out.println("How many number would you like to test?");
		while(amount < 2){
			try{
				String input = System.console().readLine();
				amount = Integer.parseInt(input);
				if(amount < 2){
					System.out.println("Must have a number greater than 1 in order to calculate an average");
				}
			}catch(NumberFormatException nfe){
					System.out.println("Not a valid integer");
			}
		}
		for (int i = 0; i < amount; i++){
			try{
				String input = System.console().readLine();
				num += Double.parseDouble(input);
				System.out.println("Please input another number");
			}catch(NumberFormatException nfe){
				i--;
				System.out.println("Not a valid integer");
			}
		}
		return num/(double)amount;
	}
}