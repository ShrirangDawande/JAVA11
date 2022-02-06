package basic_data_structure_assignment;

import java.util.ArrayList;

class Manager extends Assignment2Q2{
	 @Override
	    public int getSalary(int salary) {
	        int incentive = 5000;	
	        int sal=salary+incentive;
			return sal;
    }
}
class Lobour extends Assignment2Q2{
	 @Override
	    public int getSalary(int salary) {
	        int overtime = 500;
	        int sal1=salary+overtime;
	        return sal1;
	 }
}
public class Assignment2Q2 {
	int salary = 10000;
    public int getSalary(int salary){
    	return salary;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    	int sum=0;
       for (int a:employeeSalaries) {
    	   sum+=a;
       }
       return sum;
    }	
   public static void main(String[] args) {
	   Manager m1=new Manager();
	   Lobour l1=new Lobour();
	   Assignment2Q2 ass=new Assignment2Q2();
	   ArrayList<Integer> employeeSalaries=new ArrayList<>();
	   employeeSalaries.add(m1.getSalary(30000));
	   employeeSalaries.add(l1.getSalary(3500));
	   employeeSalaries.add(m1.getSalary(20000));
	   employeeSalaries.add(l1.getSalary(4500));
       System.out.println(ass.totalEmployeesSalary(employeeSalaries));
	}
}

