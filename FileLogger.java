
package loggerdemo;

public class FileLogger extends BaseLogger {
       public FileLogger() {
		label = "File logger";
	}
 
       @Override
	public String getLevel() {
		return "info";
	}
}
