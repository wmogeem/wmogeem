
package loggerdemo;

public class HTTPFormatter extends FormatDecorator {
       	public HTTPFormatter(BaseLogger logger) {
		this.logger = logger;
	}

            @Override
	public String getLabel() {
		return logger.getLabel() + ", HTTPFormatter";
	}

            @Override
	public String getLevel() {
		return "Info " + logger.getLevel();
	}
}
