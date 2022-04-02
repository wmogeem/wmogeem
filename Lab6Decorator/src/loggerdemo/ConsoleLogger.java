
package loggerdemo;

public class ConsoleLogger extends BaseLogger {
    public ConsoleLogger() {
		label = "Console logger";
	}
 
    @Override
	public String getLevel() {
		return "info";
	}
}
