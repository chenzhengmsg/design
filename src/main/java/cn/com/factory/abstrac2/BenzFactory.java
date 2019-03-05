package cn.com.factory.abstrac2;

import cn.com.factory.Benz;
import cn.com.factory.Car;

public class BenzFactory extends AbstractFactory {

	public Car getCar() {
		// TODO Auto-generated method stub
		return new Benz();
	}

}
