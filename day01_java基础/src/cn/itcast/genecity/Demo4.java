package cn.itcast.genecity;
/*
 ���ͽӿڣ�
 
 ���ͽӿڵĶ����ʽ��
 	
 	interface �ӿ���<�����Զ���ķ���>{
 	
 	}
 
�ڽӿ����Զ��巺��Ҫע������
 	1. �ڽӿ����Զ��巺�͵ľ���������������ʵ�ָýӿڵ�ʱ��ָ���ġ�
 	2. ���һ���ӿ��Զ����˷��ͣ���ʵ�ָýӿڵ�ʱ��û��ָ��������������ͣ���ôĬ����Object�������͡� 
 
 ������ڴ����ӿ�ʵ��������ʱ����ָ���ӿ��Զ��巺�� �ľ����������ͣ�
 
 
 
 */
interface Dao<T>{
	
	public void add(T t);
	
	public void remove(T t);

}


public class Demo4<T>  implements Dao<T>{

	public static void main(String[] args) {
		new Demo4<String>();
	}

	@Override
	public void add(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(T t) {
		// TODO Auto-generated method stub
		
	}

	

}
