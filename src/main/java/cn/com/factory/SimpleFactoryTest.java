package cn.com.factory;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		
		//这边就是我们的消费者
		Car car = new SimpleFactory().getCar("Benz");
		System.out.println(car.getName());
	}
}
