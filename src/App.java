
public class App {

	public static void main(String[] args) {
		
		AsteriskLogger asterisk = new AsteriskLogger();
		SpacedLogger spaced = new SpacedLogger();
		
		asterisk.log("Blue");
		asterisk.error("Green");
		
		spaced.log("Yellow");
		spaced.error("Orange");
		
		
		
		
	}
	
}
