import java.io.*;

/**
* Week 8 Day 16
* 5. Tr
* @author Sarah Connor
*/

public class Tr{

	public static void main(String[] args){
		Tr launch = new Tr();
		if(args.length != 3){
			System.out.println("Invalid arguments");
			System.out.println("Valid input: java Tr [charSequence target] [charSequence replacement]");
			System.exit(0);
		}
		File file = new File(args[0]);
		launch.copyAndReplace(file, args[1], args[2]);
	}
	
	public void copyAndReplace(File file, String a, String b){
		String temp = "";
		try(BufferedReader in = new BufferedReader(new FileReader(file))){
				String line;
				while((line = in.readLine()) != null){
					temp += line + System.lineSeparator();
					temp = temp.replace(a, b);
				}
		} catch (FileNotFoundException ex) {
			System.out.println("File " + file + " does not exist.");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		try(PrintWriter out = new PrintWriter(file)){
			out.println(temp);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}