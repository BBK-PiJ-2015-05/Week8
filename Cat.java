import java.io.*;

/**
* Week 8 Day 16
* 3. cat
* @author Sarah Connor
*/

public class Cat{
	public static void main (String[] args){
		if(args.length == 0){
			System.out.println("No arguments found");
			System.out.println("java Cat [file name]");
		}
		for(int i = 0; i < args.length; i++){
			File file = new File(args[i]);
			if(file.exists()){
				try(BufferedReader in = new BufferedReader(new FileReader(file))){
					String line;
					while((line = in.readLine()) != null){
						System.out.println(line);
					}
				}catch(FileNotFoundException e){
					System.out.println("File " + file + " does not exist.");
				}catch(IOException e){
					e.printStackTrace();
				}
			}	
		}
	}
}