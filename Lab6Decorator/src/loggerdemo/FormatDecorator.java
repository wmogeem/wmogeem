
package loggerdemo;

public abstract class FormatDecorator extends BaseLogger  {
    BaseLogger logger;
	// All format decorators have to reimplement the getLabel method
    @Override
	public abstract String getLabel();
    @Override
        public abstract String getLevel();
}
