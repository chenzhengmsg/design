package cn.com.chainofresponsibility;

/**
 * 创建不同类型的记录器
 * 赋予他们不同的错误级别，并在每个记录器中设置下一个记录器
 * 每个记录器中的下一个记录器代表的是链的一部分
 * @author chenzheng
 *
 */
public class ChainPatternDemo {

	private static AbstractLogger getChainOfLoggers() {
		System.out.println("cz88888");//1
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		System.out.println("cz999999");//3
	    AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
	    System.out.println("czqqqqqqqq");//5
	    AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
	    System.out.println("czwwwwww");//7
	    errorLogger.setNextLogger(fileLogger);
	    System.out.println("czeeeeeee");//9
	    fileLogger.setNextLogger(consoleLogger);
	    System.out.println("czrrrrrr");//11
	    return errorLogger;
	}
	
	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();
		System.out.println("=============");
		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
		System.out.println("1111111111111111");
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
		System.out.println("22222222222222");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}
}
