package basic_data_structure_assignment;

import java.util.Scanner;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	//double sum=subject1Marks+subject2Marks+subject3Marks;
    	if(subject1Marks>=60.0&&subject2Marks>=60.0&&subject3Marks>=60.0) {
    		return "Passed";
    	}
    	else if((subject1Marks>=60.0 && subject2Marks>=60.0 && subject3Marks<60.0)||(subject1Marks>=60.0 && subject2Marks<60.0 && subject3Marks>=60.0)||(subject1Marks<60.0 && subject2Marks>=60.0 && subject3Marks>=60.0)) {
    		return "Propmoted";
    		}
    		else {
    		return "failed";
    	}
    }
}
    public class Assignment1Q4 {

	public static void main(String[] args) {
		ResultDeclaration rd=new ResultDeclaration();
		try (Scanner sc = new Scanner(System.in)) {
			double subject1Marks = sc.nextDouble();
			double subject2Marks = sc.nextDouble();
			double subject3Marks = sc.nextDouble();
			System.out.println(rd.declareResults(subject1Marks,subject2Marks,subject3Marks));
		}
		
	}
}

