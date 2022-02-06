package basic_data_structure_assignment;

abstract class shape{
	abstract void draw();
}
class Line extends shape{
	void draw() {
		System.out.println("draw a line ");
	}
	}
class Rectangular extends shape{
    void draw() {
		System.out.println("draw a line ");
 }
}

class Cube extends shape{
    void draw() {		
    	System.out.println("draw a line ");
}
}
public class Assignment2Q5 {

	public static void main(String[] args) {
       Line l=new Line();
       l.draw();
       Rectangular r=new Rectangular();
       r.draw();
       Cube c=new Cube();
       c.draw();
	}

}
