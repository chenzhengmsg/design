package cn.com.delegate;

/**
 * IOC容器中，有一个Register的东西（为了告诉我们的容器，在这个类被初始化
 * 的过程中，需要做很多不同的逻辑，需要实现多个任务执行者，分别实现各自的功能
 * ）
 * 
 * 保证结果的多样性，对于用户来只是一种方法
 * @author 87655
 *
 */
public class DispatcherTest {

	
	public static void main(String[] args) {
		Dispatcher dispatcher = new Dispatcher(new TargetA());
		
		//看上去好像是我们的项目经理在干活，
		//但实际干活的人是普通员工
		//这就是典型，干活是我的，功劳是你的
		dispatcher.doing();
	}
}
