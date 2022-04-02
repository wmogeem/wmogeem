
package loggerdemo;

public abstract class BaseLogger {
    	String label = "Unknown label";
  
	public String getLabel() {
		return label;
	}
 
	public abstract String getLevel();
}
