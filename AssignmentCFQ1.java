package basic_data_structure_assignment;

import java.util.Scanner;

interface si{                                        // this is functional interface as it have only one method
     public double calSI(int P,int R,int T);         // if you are using lambda expression you must use to have functional interface
}

public class AssignmentCFQ1{
	public static void main(String[] args) {
        si si1=((P,R,T)->(P*R*T)/100);            //  lambda expression
                                                  // datatype of lambda expression should be interface name 
        System.out.println("Simple Interest\nPrincipal = 1000\nRate of interest = 6\nTime = 4");
        System.out.println("Simple interest = "+si1.calSI(1000,6,4));

	}

	

}
