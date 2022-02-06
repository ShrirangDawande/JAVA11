package basic_data_structure_assignment;
import java.util.Scanner;
class Login{
    String userId = "Ajay",password = "password";
    int count=0;
    String stat;
    public String loginUser(String user, String pass) {
    	while(user!=userId&&pass!=password) {
    		count=count+1;
    	}
    	if(user==userId&&pass==password) {
    		stat= "Welcome Ajay";
    	}
    	else if(user!=userId&&pass!=password) {
    		stat= "You have entered wrong credentials ,please enter the right credentials.";
    	}
    	else if(count==3) {
    		stat= "You have entered wrong credentials 3 times";
    	}
    	return stat;
    }
    }
public class Assignment1Q6 {
public static void main(String [] args) {
	Login l=new Login();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter userid");
	String us=sc.next();
	System.out.println("Enter password");
	String pa=sc.next();
	System.out.println(l.loginUser(us, pa));
}
}
