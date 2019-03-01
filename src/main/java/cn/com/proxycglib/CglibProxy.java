package cn.com.proxycglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	
	private Object target;
	
	public CglibProxy(Object target) {
		this.target = target;
	}
	

	public Object intercept(Object obj, Method method, Object[] objects, MethodProxy proxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("###   before invocation");
		Object result = method.invoke(target, objects);
		
		System.out.println("###   end invocation\"");
		return result;
	}
	
	public static Object getProxy(Object target) {
		Enhancer enhancer = new Enhancer();
		//设置需要代理的对象
		enhancer.setSuperclass(target.getClass());
		//设置代理人
		enhancer.setCallback(new CglibProxy(target));
		return enhancer.create();
	}

}
