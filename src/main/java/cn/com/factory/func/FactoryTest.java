package cn.com.factory.func;

public class FactoryTest {

	public static void main(String[] args) {
		//工厂方法模式
		//各个产品的生产商，都拥有各自的工厂
		//生成工艺
		Factory factory = new AudiFactory();
		System.out.println(factory.getCar());
		
		factory = new BmwFactory();
		System.out.println(factory.getCar());
		
		
	}
}
