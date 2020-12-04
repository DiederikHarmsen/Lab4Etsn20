package reader;

import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;



public class Reader {

    public static void main(String[] args) throws IOException {
        String pattern;
    	String filename;
    	Scanner sc= new Scanner(System.in);
    	
    	System.out.println("Enter what you want to do");
    	String command = sc.nextLine();
    	
    	if(command.split(" ")[0].equals("search")) {
    		pattern = command.split(" ")[1];
    		filename = command.split(" ")[2];
    		
    		
    		FileReader FR = new FileReader(filename);
    		BufferedReader BR = new BufferedReader(FR);
    		
    		String line;
    		String[] words=null;
    		while((line=BR.readLine()) != null) {
    			words = line.split(" ");
    			for(String word:words) {
    				if(word.equals(pattern)) {
    					System.out.println(line);
    				}
    				
    				
    			}
    			
    			
    		}
        	FR.close();
    			
    		
    	}
    	else {
    		System.out.println("Invalid Input");
    	}
    	

    }
}
