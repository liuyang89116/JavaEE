package cn.itcast.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;



public class Demo2 {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		//ʹ��get����������
		list.add("����");
		list.add("����");
		list.add("����");
		
		System.out.println("======get��ʽ����=========");
		for(int i = 0 ; i < list.size() ; i++){
			System.out.print(list.get(i)+",");
		}
		
		
		
		
		//ʹ�õ�����  ע�⣺ �������ڵ����� �����в���ʹ�ü��϶����޸ļ����е�Ԫ�ظ����������Ҫ�޸�Ҫʹ�õ������ķ��������޸ģ�
		System.out.println("\r\n======��������ʽ����=========");
		HashSet<String> set = new HashSet<String>();
		set.add("����");
		set.add("��ʣ");
		set.add("����");
		
		/*Iterator<String> it = set.iterator();	//��ȡ��������
		while(it.hasNext()){
			System.out.print(it.next()+",");
		}
		*/
		
		for(String item : set){
			System.out.print(item+",");
		}
		
		
		System.out.println("\r\n======entrySet��ʽ����=========");
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("����","001");
		map.put("����","002");
		map.put("����","003");
		Set<Entry<String,String>> entrys = map.entrySet(); //
		for (Entry<String,String> entry : entrys) {
			System.out.println("����"+entry.getKey()+" ֵ��"+entry.getValue());
		}
		
		
		
		
		
	}
	
	
}
