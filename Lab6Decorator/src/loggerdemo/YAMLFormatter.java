
package loggerdemo;

public class YAMLFormatter extends FormatDecorator {
       	public YAMLFormatter(BaseLogger logger) {
		this.logger = logger;
	}

            @Override
	public String getLabel() {
		return logger.getLabel() + ", YAMLFormatter";
	}

            @Override
	public String getLevel() {
		return "Info " + logger.getLevel();
	}
}
