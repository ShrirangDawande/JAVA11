package basic_data_structure_assignment;

interface func{
	public double addition(int num1,int num2);
    public double subtraction(int num1,int num2);
    public double multiplication(int num1,int num2);
    public double division(int num1,int num2);
} 

public class Assignment4Q1 implements func {
	public double addition(int num1,int num2){
		return num1+num2;}
    public double subtraction(int num1,int num2){
		return num1-num2;}
    public double multiplication(int num1,int num2){
		return num1*num2;}
    public double division(int num1,int num2){
		return num1/num2;}

	public static void main(String[] args) {
		Assignment4Q1 as=new Assignment4Q1();
        System.out.println(as.addition(13,5));
        System.out.println(as.subtraction(13,5));		
        System.out.println(as.multiplication(13,5));		
        System.out.println(as.division(13,5));		

		
	}

}
