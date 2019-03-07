package cn.com.prototype;

/**
 * 原型模式
 * 
 * @author chenzheng
 * 使用ShapeCache类来获取存储在HashTable中的形状的克隆
 */
public class PrototypePatternDemo {

	/**
	 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
	 * 原型模式是用于创建重复的对象，同时又保证性能，这种类型的设计模式属于创建型模式
	 * 主要解决在运行期建立和删除原型
	 * @param args
	 */
	
	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape = ShapeCache.getShape("1");
		System.out.println("Shape : "+clonedShape.getType());
		
		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("Shape : "+clonedShape2.getType());
		
		Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.println("Shape : "+clonedShape3.getType());
	}
	
	
}
