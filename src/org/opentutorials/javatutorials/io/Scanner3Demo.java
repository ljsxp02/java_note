package org.opentutorials.javatutorials.io;

import java.util.Scanner;
import java.io.*;

public class Scanner3Demo {

	public static void main(String[] args) {
        try {
            File file = new File("out.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000); 
            }
            sc.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }   
	}
}
