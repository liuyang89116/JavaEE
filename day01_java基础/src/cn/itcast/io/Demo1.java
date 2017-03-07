package cn.itcast.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;

/*
IO������⣺ ����豸���豸֮�� �����ݴ������⡣  ���磺 Ӳ��--->�ڴ�            �ڴ�----->Ӳ��

�ֽ���:

�����ֽ�����
---------| InputStream ���������ֽ����Ļ��ࡣ �����ࡣ
------------| FileInputStream ��ȡ�ļ��������ֽ�����
------------| BufferedInputStream ���������ֽ����� �����ڲ���ʵ����ά����һ��8kb�ֽ�������ѡ�  ������ֵ�Ŀ����Ϊ����߶�ȡ�ļ����ݵ�Ч�ʡ�

����ֽ���:
---------| OutputStream  ��������ֽ����Ļ��ࡣ  �����ࡣ
------------| FileOutputStream ���ļ�������� ������ֽ�����
------------| BufferedOutputStream  ��������ֽ����� ������ֵ�Ŀ����Ϊ��������ļ�д���ݵ�Ч�ʡ� �����ڲ���ʵҲ��ά����һ��8kb���ֽ�������ѡ�


ʲô���ʹ���ֽ����� ��ȡ�����ݲ���Ҫ����������߽��������������ʱ��ʹ���ֽ��������磺ͼƬ����


�ַ��� = �ֽ��� + ���루���룩

�ַ���:

�����ַ���
--------| Reader ���������ַ����Ļ��ࡣ �����ࡣ
-----------| FileReader ��ȡ�ļ��ַ��������ַ����� 
-----------| BufferedReader ���������ַ����� ������ֵ�Ŀ����Ϊ����߶�ȡ�ļ��ַ���Ч�ʲ�����չ�˹��ܣ�readLine()�������ڲ� ��ʵ����ά����һ��8192�����ȵ��ַ����顣

����ַ���
-------| Writer ��������ַ����Ļ��ࡣ �����ࡣ
------------| FileWriter ���ļ�����ַ����ݵ�����ַ�����
---------------| BufferedWriter ��������ַ�����������ֵ�Ŀ����Ϊ�����д�ļ��ַ���Ч�ʲ�����չ�˹��ܣ�newLine()����

ʲô�����ʹ���ַ����������д�Ķ����ַ����ݣ���ʱ�����Ǿ�ʹ���ַ�����


ת����:

�����ֽ�����ת����             �����ֽ���---------�����ַ���
	InputSrteamReader 

����ֽ�����ת����
	OutputStreamWriter

ת���������ã�
	1. ���԰Ѷ�Ӧ���ֽ���ת�����ַ���ʹ�á�
	2. ����ָ�������ж�д�ļ������ݡ�
	


FileReader�� FileWriter��������Ĭ����ʹ�õ���gbk���� ������������ָ������д�ļ����ݡ�


 */
public class Demo1 {

	public static void main(String[] args) throws Exception {
//		testInput();
//		writeFile();
		readFile();
	}
	
	
	public static void readFile() throws IOException{
		//�����ļ���������������ͨ��
		FileInputStream fileInputStream = new FileInputStream("F:\\a.txt");
		//���������ֽ�����ת��������ָ�������ж�ȡ
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");
		int content = 0; 
		while((content = inputStreamReader.read())!=-1){
			System.out.println((char)content);
		}
		//�ر���Դ
		inputStreamReader.close();
		
		
		
		
		
		
		
		
		/*FileReader fileReader = new FileReader("F:\\a.txt");  //Ĭ��ʹ�õ���gbk���
		int content = 0; 
		while((content = fileReader.read())!=-1){
			System.out.print((char)content);
		}
		
		//�ر���Դ
		fileReader.close();*/
		
		
		
		
		
		
	}
	
	
	
	
	//ָ��ʹ��utf-8��������д�����ļ��ϡ�
	public static void writeFile() throws IOException{
		//�������ļ����������� ͨ��
		FileOutputStream fileOutputStream = new FileOutputStream("F:\\a.txt");
		//����һ������ֽ�����ת��������ָ��������д����
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"utf-8");
		outputStreamWriter.write("��Һ�");  //������utf-8�����ռ�����ֽڡ�
		
		//�ر���Դ
		outputStreamWriter.close();
	}
	
	
	
	
	
	
	
	public static void testOutput() throws Exception{
		Socket socket = new Socket(InetAddress.getLocalHost(),9090);
		//��ȡ��socket�����������
		OutputStream outputStream = 	socket.getOutputStream();
		//������ֽ���ת��������ַ���
		OutputStreamWriter  outputStreamWriter = new OutputStreamWriter(outputStream);
		outputStreamWriter.write("����!");
	}
	
	
	
	public static void testInput() throws Exception{
		InputStream in = System.in; 
//		int  content = in.read(); // ÿ��ֻ���ȡ��һ���ֽڵ�����
	
		//��Ҫ���ֽ���ת�����ַ���ʹ�á�
		InputStreamReader  inputStreamReader = new InputStreamReader(in);
		
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		System.out.println(bufferedReader.readLine());
	}
	
	
	
}
