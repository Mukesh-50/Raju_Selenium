package lib;

public class Sync {
	
	
	
	public static String lsleep(int ltime)
	{
	
	try {
		Thread.sleep(ltime);
		
	} catch (InterruptedException e) {
		
	}
	
	return "Pass";

}
	
}
