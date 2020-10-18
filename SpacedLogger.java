package Week5;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String Log) {
		// TODO Auto-generated method stub
		
		/*
		 *If the log method received “Hello” as an argument, it should print H e l l o
			The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
		 */
		StringBuilder newLog = new StringBuilder();
		for (int i=0; i < Log.length(); i++){
			newLog.append(Log.charAt(i) + " ");	
		}
		System.out.println(newLog.toString() );		
	}
	
	/*
	 * If the log method received “Hello” as an argument, it should print H e l l o
		The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
	 */
	@Override
	public void Error(String Error) {
		// TODO Auto-generated method stub
	StringBuilder newError = new StringBuilder();
		for (int i=0; i < Error.length(); i++){
			newError.append(Error.charAt(i) + " ");	
		}
		System.out.println("ERROR: " + newError.toString());
	
	}
}
