package basic_data_structure_assignment;

import java.util.Arrays;
import java.util.List;

public class Assignment4Q6 {
	public List<String> convertToUpperCase(List<String> list) {
		List<String>str=(list)->{list.replaceAll(i-> String.valueOf(i.charAt(0)).toUpperCase()+i.substring(1))};
		return str;
		 
	 }  
	 public static void main(String[] args) {
		 List<String>list=Arrays.asList("yash","shri","himasnhu","jack");
		 Assignment4Q6 ass=new  Assignment4Q6();
		 System.out.println(ass.convertToUpperCase(list));
	 }
	 
}
