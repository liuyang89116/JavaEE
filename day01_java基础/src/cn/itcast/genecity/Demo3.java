package cn.itcast.genecity;

import java.util.ArrayList;
import java.util.Comparator;

/*
 ������
 
 ������Ķ����ʽ��
 	
 	class ����<�����Զ���ķ���>{
 	
 	} 
 
ע������ 
 	1. �������Զ���ķ��͵ľ��������������ڴ��������ʱ��ָ���ġ�
	2. �������Զ����˷��ͣ������������Ķ���ʱû��ָ�����͵ľ������ͣ���ôĬ����Object���͡�
 	
 	
 */

class Worker implements Comparator<Worker>{

	@Override
	public int compare(Worker o1, Worker o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}



//�Զ��� һ�����϶���
class MyList<T>{
	
	Object[]  arr = new Object[10];
	
	int index = 0;
	
	public MyList(){
	
	}

	public void add(T o){
		arr[index++] = o;
	} 
	
}


public class Demo3 {
	
	public static void main(String[] args) {
		MyList<String> list=  new MyList<String>();
		list.add("123");
		
		MyList list2 = new MyList();
		
		new ArrayList<String>();
		
	}
	
}
