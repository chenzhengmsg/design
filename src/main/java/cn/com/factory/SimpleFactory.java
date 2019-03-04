package cn.com.factory;

//对于这个工厂来说
//这个工厂都可以调用
public class SimpleFactory {


	//实现统一管理
	//如果没有工厂模式，管理混乱，没有执行标准
	public Car getCar(String name) {
		if(name.equalsIgnoreCase("BMW")) {
			return new Bmw();
		}else if(name.equalsIgnoreCase("Benz")) {
			 return new Benz();
		}else if(name.contentEquals("Audi")) {
			 return new Audi();
		}else {
			System.out.println("这个产品生产不出来");
			return null; 
		}
	}
}
