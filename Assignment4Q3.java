package basic_data_structure_assignment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assignment4Q3 {
	  static String modifyValue(){
		  String a= "yash";
		  return a;  
		  }
	  
      static class Product {
    	private String name;
        public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
   }
	  static void display() { 
		  return ;
	  }
	
	  public static void main(String [] args) {
		Product p=new Product();
		// Predicate Built-in Interface
		Predicate<String>modifyValue=str->str.length()>5;
		System.out.println(modifyValue.test(Assignment4Q3.modifyValue()));
		// Consumer Built-in Interface
		Consumer<Product>consumer=t->t.setName("shrirang");
		consumer.accept(p);
		System.out.println(p.getName());
		// Function Built-in Interface
		Function<Integer,String>getInt=t->t*10+" data multiplyed by 10";
		System.out.println(getInt.apply(10));
		//Supplier Built-in Interface
		Supplier<Assignment4Q3>getran=Assignment4Q3.display();
		System.out.println(getran.get());

	}
}
