
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		String spacedLog = "";
		for (int i = 0; i < log.length(); i++) {
			spacedLog += log.charAt(i) + " ";
		}
		System.out.println(spacedLog);
	}

	@Override
	public void error(String error) {
		String spacedError = "";
		for (int i = 0; i < error.length(); i++) {
			spacedError += error.charAt(i) + " ";
		}
		System.out.println("ERROR: " + spacedError);
	}

}
