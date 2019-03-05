package cn.com.factory.abstrac2;

import cn.com.factory.Audi;
import cn.com.factory.Benz;
import cn.com.factory.Bmw;
import cn.com.factory.Car;
import cn.com.factory.func.BmwFactory;

public abstract class AbstractFactory {

	protected abstract Car getCar();
	
	public Car getCar(String name) {
		if(name.equalsIgnoreCase("BMW")) {
			return new BmwFactory().getCar();
		}else if(name.equalsIgnoreCase("Benz")) {
			 return new BenzFactory().getCar();
		}else if(name.contentEquals("Audi")) {
			 return new AudiFactory().getCar();
		}else {
			System.out.println("这个产品生产不出来");
			return null; 
		}
	}
}
