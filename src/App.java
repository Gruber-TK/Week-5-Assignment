
public class App {

	public static void main(String[] args) {
		
		AsteriskLogger asterisk = new AsteriskLogger();
		SpacedLogger spaced = new SpacedLogger();
		
		asterisk.log("Blue");
		
		System.out.println();
		
		asterisk.error("Green");
		
		System.out.println();
		spaced.log("Yellow");
		
		System.out.println();
		
		spaced.error("Orange");
		
		
		
		
	}
	
}
