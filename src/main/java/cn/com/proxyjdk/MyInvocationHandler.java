package cn.com.proxyjdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 定义一个处理器
 * @author chenzheng
 *
 */
public class MyInvocationHandler implements InvocationHandler {

	/**
	 * 因为需要处理真实角色，要把真实角色传进来
	 */
	Subject realSubject;
	
	public MyInvocationHandler(Subject realSubject) {
		// TODO Auto-generated constructor stub
		this.realSubject = realSubject;
	}
	
	
	
	/**
	 * proxy：代理类
	 * method：正在调用的方法
	 * args：方法参数
	 */
//	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("开始调用代理类");
		if(method.getName().equals("sellBooks")) {
			Object invoke = method.invoke(realSubject, args);
			System.out.println("调用的是卖书的方法");
			return invoke;
		}else {
			String name = (String) method.invoke(realSubject, args);
			System.out.println("调用的是说话的方法");
			return name;
		}
	}

}
