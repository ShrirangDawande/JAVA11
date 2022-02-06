package basic_data_structure_assignment;

import java.util.ArrayList;
import java.util.List;

public class AssignmentCFQ2 {
        public static void main(String [] args) {
        	ArrayList<String>li=new ArrayList<>(); 
        li.add("A");
        li.add("quick");
        li.add("brown");
        li.add("fox");
        li.add("jumps");
        li.add("over");
        li.add("the");
        li.add("lazy");
        li.add("dog");
        
        Object[]obj=li.toArray();
        
        for(Object obj1:obj) {                // this is the way to use for loop in collection as we dont have indexes to use normal for loop
        	System.out.print(obj1+" ");
        }

        }
        
	
}
       // ArrayList <String> l1=new ArrayList<>();