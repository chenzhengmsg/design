package cn.com.chainofresponsibility;

public class FileLogger extends AbstractLogger {
	
	public FileLogger(int level) {
		System.out.println("file111111");//4
		this.level = level;
	}

	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("file22222222");
		System.out.println("File::Logger: " + message);
	}

}
