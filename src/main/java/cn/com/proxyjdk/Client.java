package cn.com.proxyjdk;

import java.lang.reflect.Proxy;

/**
 * 调用类
 * @author chenzheng
 *
 */
public class Client {
	public static void main(String[] args) {
		// 真实对象
		Subject realSubject = new RealSubject();
		
		//把真实对象注入到代理类中
		MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);
		
		//代理对象
		Subject proxyClass = (Subject)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Subject.class}, myInvocationHandler);
		
		proxyClass.sellBooks();
		
		proxyClass.speak();
	}
}
