package cn.com.chainofresponsibility;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(int level) {
		System.out.println("error11111111");//2
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("error222222");
		System.out.println("Error Console::Logger: " + message);
	}

}
