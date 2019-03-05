package cn.com.factory.abstrac2;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		DefaultFactory factory = new DefaultFactory();
		
		System.out.println(factory.getCar("BMW"));
		
		
	}
}
