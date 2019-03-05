package cn.com.factory.func;

import cn.com.factory.Benz;
import cn.com.factory.Car;

public class BenzFactory implements Factory {

	public Car getCar() {
		// TODO Auto-generated method stub
		return new Benz();
	}

}
