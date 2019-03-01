package cn.com.proxycglib;

public class Engineer {

	public void eat() {
		//可以被代理
		System.out.println("工程师正在吃饭");
	}
	
	//final方法不会被生成的子类覆盖
	public final void work() {
		System.out.println("工程师正在工作");
	}
	
	//private方法不会被生成的子类覆盖
	private void play() {
		System.out.println("this enginner is playing game");
	}
}
