package basic_data_structure_assignment;

import java.util.ArrayList;

class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    public int getCash(int cash1) {
    	int total=cash1+totalDeposits+creditLimit ;
    	return total;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    public int getCash(int fd) {
    	int total1=fd+totalDeposits+fixedDepositAmount;
    	return total1;
    }
}
public class Assignment2Q3 {
	public int totalCashInBank(ArrayList<Integer> cash){
		int sum=0;
		for(int c:cash) {
			sum=sum+c;
		}
		return sum;
	}
public static void main(String[] args) {
	CurrentAccount ca=new CurrentAccount();
	SavingsAccount sa=new SavingsAccount();

    	ArrayList<Integer> cash=new ArrayList<Integer>();
    	cash.add(ca.getCash(1200));
    	cash.add(sa.getCash(1500));
    	cash.add(sa.getCash(1880));
    	cash.add(ca.getCash(2500));
    	
    	Assignment2Q3 as=new Assignment2Q3();
    	System.out.println(as.totalCashInBank(cash));
   }
}
