/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author User
 */
public class TextReader {
    public static void main(String[] args) {
	
	File data = new File(File.separatorChar + "temp" + File.separatorChar 
                        + "test.txt");
        
        final int LAST_NAME = 0;
        final int FIRST_NAME = 1;
        final int PHONE_NUMBER = 2;
        final int ADDRESS = 3;
        final int CITY_STATE = 4;
        final int ZIP = 5;
        
        String temp[] = null;
        String output;
        BufferedReader in = null;
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
           
	   while(line != null){
               temp = line.split("\\|");
		  output = "Name: " + temp[FIRST_NAME] + " " + temp[LAST_NAME] + 
                          "\nPhone Number:" + temp[PHONE_NUMBER] + "\nAddress: " 
                + temp[ADDRESS] + temp[CITY_STATE] + temp[ZIP];
                  System.out.println(output);
		  line = in.readLine();
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(IOException e) {
                System.out.println("Could not close file");
            }
        }

        
        
       // System.out.println(output);
        
    } // end main
} // end class


