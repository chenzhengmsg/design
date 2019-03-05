package cn.com.factory.func;

import cn.com.factory.Audi;
import cn.com.factory.Car;

public class AudiFactory implements Factory {

	public Car getCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}

}
