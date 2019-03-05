package cn.com.factory.abstrac2;

import cn.com.factory.Bmw;
import cn.com.factory.Car;

public class BmwFactory extends AbstractFactory {

	public Car getCar() {
		// TODO Auto-generated method stub
		return new Bmw();
	}

}
