package basic_data_structure_assignment;
abstract class assi{
	public int sum() {
		int a=10;
		return a;
	}
}

final abstract class Assignment2Q4 extends Assi {      // we must use abstract class if we use abstract method
	public abstract void check();
	public static void main(String [] args) {
		Assignment2Q4 as=new Assignment2Q4(); // we can not instantiate the Assignment2Q4
	}

}
 abstract class Assignment0Q4 extends Assi {      // we must use abstract class if we use abstract method
	//public abstract void check();
	public static void main(String [] args) {
		Assignment2Q4 as=new Assignment2Q4(); // we can not instantiate the Assignment2Q4
	}

}

