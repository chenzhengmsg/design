package cn.com.factory.abstrac;

/**
 * 创建一个工厂的生成器，通过传递形状或颜色信息来获取工厂
 * @author chenzheng
 *
 */
public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if(choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}
