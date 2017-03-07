package cn.itcsat.junit;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo2 {
	
	//׼�����ԵĻ���
	//@Before
	@BeforeClass
	public static void beforeRead(){
		System.out.println("׼�����Ի����ɹ�...");
	}
	
	
	//��ȡ�ļ����ݣ��Ѱ��ļ����ݶ�
	@Test
	public void readFile() throws IOException{
		FileInputStream fileInputStream = new FileInputStream("F:\\a.txt");
		int content  = fileInputStream.read();
		System.out.println("���ݣ�"+content);
	}
	
	
	@Test
	public void sort(){
		System.out.println("��ȡ�ļ���������..");
	}

	
	//������Ի����ķ���
//	@After 
	@AfterClass
	public static void afterRead(){
		System.out.println("������Ի���..");
	}
	

}
