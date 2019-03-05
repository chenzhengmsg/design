package cn.com.factory.abstrac2;

import cn.com.factory.Car;

public class DefaultFactory extends AbstractFactory {

	private AudiFactory defaultFactory = new AudiFactory();
	
	@Override
	protected Car getCar() {
		// TODO Auto-generated method stub
		return defaultFactory.getCar();
	}

}
