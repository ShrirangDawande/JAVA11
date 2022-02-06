package basic_data_structure_assignment;
abstract class Persistence{          // abstract class have abstract method
	abstract public String persist();
}
class FilePersistence extends Persistence{
	public String persist() {     // abstract method is overriden 
	return "This is the Persist method of File Persistence Method.";
}
}
class DatabasePersistence{	
	public String persist() {	return "This is the Persist method of File Data Base Method.";
}
}

public class Assignment2Q6 {
    public static void main(String[] args) {
    	 FilePersistence fp =new  FilePersistence();
    	 System.out.println(fp.persist());
    	 DatabasePersistence dp =new DatabasePersistence();
    	 System.out.println(dp.persist());
    }
}
