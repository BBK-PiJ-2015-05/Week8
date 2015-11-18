import java.io.*;

/**
* Week 8 Day 16
* 2. mkdir
* @author Sarah Connor
*/

public class MkDir{
	
	public static void main(String[] args){
		
		for(int i = 0; i < args.length; i++){
			File file = new File("." + File.separator + args[i]);
			file.mkdir();
		}
	}
}

