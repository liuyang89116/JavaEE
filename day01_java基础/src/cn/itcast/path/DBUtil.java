package cn.itcast.path;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/*
 ��������ᷢ���仯���������ǿ��Զ����������ļ��ϡ� ����˵�����ݿ���û��������롣
  
 �����ļ���·��Ӧ�����д �أ�
 	
 	����·����һ���ļ�������·����Ϣ��һ�����·���ǰ������̷� �ġ�  ����·����ȱ�ݣ� ��Ϊ����·�������̷���ͷ�ģ���Щϵͳ��û���̷��ġ�
 	
 	���·��: ���·��������ڵ�ǰ�����·������ǰ·������ִ��java�����ʱ�򣬿���̨���ڵ�·����
 	
 	���ļ�·�� :���ļ�·������ʹ����classpath��·���Ҷ�Ӧ����Դ�ļ���
 	
 	�����Ҫʹ�õ����ļ�·��������Ҫ��ȡ��һ��Class����
 	
 
 
 */
public class DBUtil {
	
	static Properties properties ;
	
	static{
		try {
			properties = new Properties();
			//ȥ���������ļ�  /
			Class clazz = DBUtil.class; 
			InputStream inputStream = clazz.getResourceAsStream("/db.properties"); //  "/"������Classpath��·����           getResourceAsStream �÷�������ʹ�õ�·������ʹ�������ļ�·����
			properties.load(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("��ǰ·����"+ new File(".").getAbsolutePath() );
		System.out.println("�û�����"+ properties.getProperty("userName")+" ���룺"+properties.getProperty("password"));
		
	}
	
	

}
