package basic_data_structure_assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment4Q4 {
	public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
		 ArrayList<String>arr=employeeList.removeIf(n->n.length()%2!=0);
		 return arr;
	}
    public static void main(String[] args) {
    	Assignment4Q4 as=new Assignment4Q4();
    	ArrayList<String> employeeList=new ArrayList<>();
    	employeeList.add("yash");
    	employeeList.add("shrirang");
    	employeeList.add("jack");
    	employeeList.add("mike");
    	employeeList.add("madhavi");
    	System.out.println(as.removeOddLength(employeeList));
    }
}
