package basic_data_structure_assignment;

public class Assignment1Q1 {
	public boolean armstrongCheck(int num) {
	int temp=num;
	int r,sum=0;
	while(num>0) {
	r=num%10;
	sum=sum+(r*r*r);
	num=num/10;	
	}
	if(sum==temp) {
		return true;
		}
	else {
		return false;
		}
	}

	public static void main(String[] args) {
		Assignment1Q1 ac=new Assignment1Q1();
		System.out.println(ac.armstrongCheck(371));

	}

}
