
package loggerdemo;

public class CSVFormatter extends FormatDecorator {
    	public CSVFormatter(BaseLogger logger) {
		this.logger = logger;
	}

            @Override
	public String getLabel() {
		return logger.getLabel() + ", CSVFormatter";
	}

            @Override
	public String getLevel() {
		return "Info " + logger.getLevel();
	}
}
