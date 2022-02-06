package basic_data_structure_assignment;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	double si=(principalAmount*time*interestRate)/100;
        return si;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	 double ci = (principalAmount*Math.pow((1+interestRate/100),time))-principalAmount;
    	 return ci;
    			 
    }
	
}

public class Assignment1Q3 {

	public static void main(String[] args) {
		SiCi sc=new SiCi();
      System.out.println( sc.simpleInterest(5000, 2, 6.8));
       System.out.println(sc.compoundInterest(4000, 3, 7.6));

	}

}
