package Week5;

public class AplicationForLog {

	public static void main(String[] args) {			
	/*
	 * Access to the Interface Logger and connect with the class AsteriskLogger
	 * instantiate an instance of each of your logger classes that implement the Logger interface.
	 */
	Logger logger = new AsteriskLogger();
	System.out.println("Asterisk Log");
	logger.Log("HELLO");
	
	Logger error1 = new AsteriskLogger();
	System.out.println("Asterisk Error");
	error1.Error("HELLO");
	
	Logger logger2 = new SpacedLogger();
	System.out.println("Spacer Log");
	logger2.Log("HELLO");
	
	Logger error2 = new SpacedLogger();
	System.out.println("");
	System.out.println("Spacer Error");
	error2.Error("HELLO");
	
	
	
	}

	

}
