package basic_data_structure_assignment;

import java.util.Arrays;
import java.util.List;

public class Assignment4Q8 {
	public void Display_Numbers(List<Integer> list){
        for (int i:list){
            System.out.print(i+" ");
        }
    }
public static void main(String [] args) {
	Assignment4Q8 ass=new Assignment4Q8();
	Thread thread=new Thread();
	thread.start();
	List<Integer>li=Arrays.asList(1,3,4,2,5,6,8);
	System.out.print(ass.Display_Numbers(li));
	thread.stop();
    
}
}
