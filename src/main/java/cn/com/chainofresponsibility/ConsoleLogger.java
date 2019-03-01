package cn.com.chainofresponsibility;

/**
 * 创建扩展了该记录器类的实体类
 * @author chenzheng
 *
 */
public class ConsoleLogger extends AbstractLogger {
	
	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("Standard Console::Logger:"+message);
	}

}
