package cn.com.factory.func;

import cn.com.factory.Bmw;
import cn.com.factory.Car;

public class BmwFactory implements Factory {

	public Car getCar() {
		// TODO Auto-generated method stub
		return new Bmw();
	}

}
