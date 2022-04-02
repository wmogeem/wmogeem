
package loggerdemo;

public class DatabaseLogger extends BaseLogger{
       public DatabaseLogger() {
		label = "Database logger";
	}
 
       @Override
	public String getLevel() {
		return "info";
	}
}
