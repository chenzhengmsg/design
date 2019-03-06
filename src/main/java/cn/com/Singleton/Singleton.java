package cn.com.Singleton;

/**
 * 1.懒汉式，线程不安全实现单列模式
 * 这种方式是最基本的实现，这种实现最大的问题就是不支持多线程
 * ，因为没有加锁synchronized，所以严格意义上它并不算单列模式，
 * 这种方式lazy loading很明显，不要求线程安全，在多线程不能正常工作
 * @author chenzheng
 *
 */
//public class Singleton {
//	
//	private static Singleton instance;
//	
//	private Singleton() {};
//	
//	public static Singleton getInstance() {
//		if(instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
//
//}




/**
 * 2.懒汉式，线程安全
 * @author chenzheng
 * 这种方式具备很好的lazy loading,能够在多线程很好的工作
 * 但是效率很低，99%情况下不需要同步
 * 
 * 优点：第一次调用才会初始化，避免保证浪费
 * 缺点：必须加锁synchronized才能保证单列，但加锁会影响效率
 *
 */
//public class Singleton {
//	
//	private static Singleton instance;
//	
//	private Singleton() {}
//	
//	public static synchronized Singleton getInstance() {
//		if(instance == null) {
//			instance = new Singleton();
//		}
//		return instance;
//	}
//}


/**
 * **********建议使用**************
 * 3.饿汉式，线程安全
 * 这种方式比较常用，但是容易产生垃圾对象
 * 优点：没有加锁，执行效率会提高
 * 缺点：类加载式就初始化，浪费内存
 * @author chenzheng
 *
 */
//public class Singleton {
//	private static Singleton instance = new Singleton();
//	
//	private Singleton() {}
//	
//	public static Singleton getInstance() {
//		return instance;
//	}
//}


/**
 * 4.双检锁/双重效验锁
 * lazy初始化，线程安全
 * @author chenzheng
 *
 */
//public class Singleton {
//	
//	private volatile static Singleton singleton;
//	
//	private Singleton() {}
//	
//	public static Singleton getInstance() {
//		if(singleton == null) {
//			synchronized (Singleton.class) {
//				singleton = new Singleton();
//			}
//		}
//		return singleton;
//	}
//}

/**
 * 5.登记式/静态内部类
 * lazy初始化，线程安全
 * @author chenzheng
 *
 */
//public class Singleton {
//	
//	private static class SingletonHolder{
//		private static final Singleton INSTANCE = new Singleton();
//	}
//	
//	private Singleton() {};
//	
//	public static final Singleton getInstance() {
//		return SingletonHolder.INSTANCE;
//	}
//}


/**
 * 6.枚举
 * lazy初始化，线程安全
 * @author chenzheng
 *
 */
public enum Singleton {
	INSTANCE;
	public void whateverMethod() {
		
	}
}
