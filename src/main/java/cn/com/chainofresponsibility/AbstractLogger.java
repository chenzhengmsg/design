package cn.com.chainofresponsibility;

/**
 * 1创建抽象的记录器接口
 * @author chenzheng
 *
 */
public abstract class AbstractLogger {
	
	public static int INFO = 1;
	
	public static int DEBUG = 2;
	
	public static int ERROR = 3;
	
	protected int level;
	
	//责任链中的下一个元素
	protected AbstractLogger nextLogger;
	
	public void setNextLogger(AbstractLogger nextLogger) {
		System.out.println("aa111111");//8,10
		this.nextLogger = nextLogger;
	}
	
	public void logMessage(int level,String message) {
		System.out.println("======this.level:"+this.level);
		System.out.println("=======level:"+level);
		System.out.println("aa22222");//12,15,18
		if(this.level <= level) {
			System.out.println("aa3333");//19,
			write(message);
		}
		System.out.println("aa4444");//13,16,22
		if(nextLogger != null) {
			System.out.println("aa5555");//14,17
			nextLogger.logMessage(level, message);
		}
	}

	abstract protected void write(String message);
}
