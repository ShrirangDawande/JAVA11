package basic_data_structure_assignment;

import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Assignment_string {
	
	public static void main(String [] args) throws IOException {
	    File a=new File("D:\\ADAPT\\Java Core 11\\Java11Assignments_StudentList.txt"); 
	    Scanner sc=new Scanner(a);
	    int count =0;
	    while(sc.hasNextLine()) {
	    	String string = sc.nextLine();

            if(string.length()!=0){
                System.out.println(string.trim());
                count++;
            }
        }
        System.out.println("Total number of students present in the txt file are: "+count);

        sc.close();

	    }
} 
