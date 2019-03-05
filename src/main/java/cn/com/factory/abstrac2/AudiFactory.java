package cn.com.factory.abstrac2;

import cn.com.factory.Audi;
import cn.com.factory.Car;

public class AudiFactory extends AbstractFactory {

	public Car getCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}

}
