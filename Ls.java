import java.io.*;

/**
* Week 8 Day 16
* 1. ls
* @author Sarah Connor
*/

public class Ls{
	
	public static void main(String[] args){
		File file = new File(".");

		String[] stringFiles = file.list();

		for(int i = 0; i < stringFiles.length; i++){
			System.out.println(stringFiles[i]);
		}
	}
	
}
