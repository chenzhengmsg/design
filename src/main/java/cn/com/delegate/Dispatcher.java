package cn.com.delegate;

public class Dispatcher implements IDelegate {
	
	IDelegate iDelegate;
	
	Dispatcher(IDelegate iDelegate) {
		this.iDelegate = iDelegate;
	}

	//项目经理，虽然也有执行方法，
	//但是他的工作职责是不一样的
	public void doing() {
		this.iDelegate.doing();
	}

}
