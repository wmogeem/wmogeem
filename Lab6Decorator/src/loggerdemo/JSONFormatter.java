
package loggerdemo;

public class JSONFormatter extends FormatDecorator{
       	public JSONFormatter(BaseLogger logger) {
		this.logger = logger;
	}

            @Override
	public String getLabel() {
		return logger.getLabel() + ", JSONFormatter";
	}

            @Override
	public String getLevel() {
		return "Info " + logger.getLevel();
	}
}
