package basic_data_structure_assignment;

import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	double ctcc=ctc;
    	if(ctc<180000) {
    		return ctcc;
    	    }
    	else if(ctc>181001.0&&ctc<=300000.0) {
    			ctcc=(ctc*0.1);
    		}
    	else if(ctc>300001.0&&ctc<=500000.0){
    	        ctcc= (ctc*0.2);
    		}
    	else if(ctc>500001.0&&ctc<=100000.0) {
    			ctcc= (ctc*0.3);
    		}
		return ctcc;
    	}
    }
public class Assignment1Q5 {

	public static void main(String[] args) {
      TaxAmount ta=new TaxAmount();
      Scanner sc=new Scanner(System.in);
      int income=sc.nextInt();
      System.out.println(ta.calculateTaxAmount(income));
		
	}
}
