package cn.com.Singleton;

/**
 * 单列模式
 * @author chenzheng
 *
 */
public class SingleObject {

	//创建一个SingleObject的一个对象
	private static SingleObject instance = new SingleObject();
	
	//让构造函数为private，这样该类就不会被实例化
	private SingleObject() {}
	
	//获取唯一一个可用的对象
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World!");
	}
}
