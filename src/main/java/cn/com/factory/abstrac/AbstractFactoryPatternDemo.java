package cn.com.factory.abstrac;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		//获取形状工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		//获取形状为CIRCLE的对象
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		//调用CIRCLE的shape方法
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
	
	}
}
