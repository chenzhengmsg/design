package cn.com.proxyjdk;

/**
 * 2
 * @author chenzheng
 *
 */
public class RealSubject implements Subject {

//	@Override
	public int sellBooks() {
		// TODO Auto-generated method stub
		System.out.println("卖书");
		return 1;
	}

//	@Override
	public String speak() {
		// TODO Auto-generated method stub
		System.out.println("说话");
		return "张三";
	}

}
