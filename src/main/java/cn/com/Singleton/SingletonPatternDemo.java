package cn.com.Singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		//无法创建，因为构造函数已私有化
//		SingleObject object = new SingleObject();
		
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}
}
