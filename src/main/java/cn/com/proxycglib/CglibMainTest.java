package cn.com.proxycglib;

public class CglibMainTest {

	public static void main(String[] args) {
		//生成cglib代理类
		Engineer engineerProxy = (Engineer) CglibProxy.getProxy(new Engineer());
		
		System.out.println("==============");
		//调用相关方法
		engineerProxy.eat();
	}
}
