import java.io.*;

/**
* Week 8 Day 16
* 4. cp
* @author Sarah Connor
*/

public class Cp{
	public static void main(String[] args){
		Cp launch = new Cp();
		
		if(args.length < 2){
			System.out.println("Valid input: java Cp [file input] [file ouput]");
			System.out.println("Valid input: java Cp [file input] ... [directory output]");
			System.exit(0);
		}
		
		File outFile = new File(args[args.length - 1]);
		
		if(outFile.isDirectory()){
			for(int i = 0; i < (args.length - 1); i++){
				File inFile = new File(args[i]);
				String newCopy = "." + File.separator + args[args.length - 1] + File.separator + args[i];
				File newFile = new File(newCopy);
				launch.copyFile(inFile, newFile);
			}
		}else if(args.length == 2){
			File inFile = new File(args[0]);
			launch.copyFile(inFile, outFile);
		}
		
		
	}
	
	public void copyFile(File inFile, File outFile){
		if(outFile.exists()){
			System.out.println("File " + outFile + " already exists.");
			System.out.println("Overwrite? Y/N");
			String answer = System.console().readLine();
			if(answer.equals("N")){
				System.exit(0);
			}
		}
		
		try(BufferedReader in = new BufferedReader(new FileReader(inFile));
			PrintWriter out = new PrintWriter(outFile)){
				String line;
				while((line = in.readLine()) != null){
					out.println(line);
				}
				
		} catch (FileNotFoundException ex) {
			System.out.println("File " + inFile + " does not exist.");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}