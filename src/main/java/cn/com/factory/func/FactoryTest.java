package cn.com.factory.func;

public class FactoryTest {

	public static void main(String[] args) {
		//��������ģʽ
		//������Ʒ�������̣���ӵ�и��ԵĹ���
		//���ɹ���
		Factory factory = new AudiFactory();
		System.out.println(factory.getCar());
		
		factory = new BmwFactory();
		System.out.println(factory.getCar());
		
		
	}
}
