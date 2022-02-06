package basic_data_structure_assignment;

class SingletonInheritanceCheck{
	static Assignment2Q1 as=new Assignment2Q1();   // create a static object
	
	private void SingletonInheritanceCheck() {}    // create private constructor
	
	public Assignment2Q1 checkSingleton() {
		return as;                                // return a static object in method 
	}
	
}

public class Assignment2Q1 extends SingletonInheritanceCheck {

	public static void main(String[] args) {
		SingletonInheritanceCheck ss= new SingletonInheritanceCheck();   
		SingletonInheritanceCheck s1= new SingletonInheritanceCheck();   

		
	}

}
