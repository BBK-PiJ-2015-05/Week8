import java.util.*;

/**
* Week 8 Day 15
* 5. Prime Divisors
* @author Sarah Connor
*/

public class PrimeDivisorListImpl<Integer>{
	
	private List<Integer> list;
	
	public PrimeDivisorListImpl(){
		list = new ArrayList<Integer>();
	}
	
	public void add(Integer obj){
		if(obj == null){
			throw new NullPointerException("cannot add a null to the list");
		}else if(!isPrime(obj)){
			throw new IllegalArgumentException("not a prime number");
		}else{
			list.add(obj);
		}
	}
	
	public boolean isPrime(Integer input){
		int num = Integer.valueOf(input);
		int i = 2;
		while (i < num){
			if((num % i) == 0){
				return false;
			}
			i++;
		}
		return true;
	}
}