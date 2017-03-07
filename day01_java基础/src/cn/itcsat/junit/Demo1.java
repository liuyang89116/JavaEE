package cn.itcsat.junit;

import static org.junit.Assert.*;

import java.util.Arrays;

import javax.management.RuntimeErrorException;

import org.junit.Test;

/*
junit(��Ԫ���Կ��)

Ŀǰ���ڵ����⣺
	1. Ŀǰ�ķ��������Ҫ���ԣ�����Ҫ��main�����ϵ��á�
	2. Ŀǰ�Ľ������Ҫ�����˹��Աȡ�


junitҪע���ϸ�ڣ�
	1. ���ʹ��junit����һ��������ʱ����junit��������ʾ������ô���������ȷ��
		����ǳ����˺����������÷������Գ������쳣��ͨ����
	2. �������������� ������������ ����������junit�ֱ���Ե��Ƕ�Ӧ�ķ������ࡢ ���� ���������test�����������е�����test������
	3.  @Test���Եķ���������static�����벻�ܴ����βΡ�
	4. �������һ��������ʱ����Ҫ׼�����ԵĻ���������������ԵĻ�������ô����@Before�� @After ��@BeforeClass�� @AfterClass���ĸ�ע�⡣
	@Before�� @After ����ÿ�����Է������Ե�ʱ�򶼻����һ�Σ� @BeforeClass�� @AfterClass�������еĲ��Է�������֮ǰ�����֮�����һ�ζ��ѡ�

junitʹ�ù淶��
	1. һ���������Ҫ���ԣ���ô�����Ӧ�ö�Ӧ��һ�������࣬������������淶 �� �������������+ Test.
	2. һ�������Եķ���һ���Ӧ��һ�����Եķ��������Եķ����������淶�ǣ� test+ �����Եķ����ķ�����

 */
public class Demo1 {
	
	@Test //ע��
	public	 void getMax(int a, int b){
	/*	int a = 3;
		int b = 5 ;*/
		int max = a>b?a:b;
		System.out.println("���ֵ��"+max);
	}

	
	@Test
	public void sort(){
		int[] arr = {12,4,1,19};
		for(int i = 0 ; i  < arr.length-1 ; i++){
			for(int j = i+1 ; j<arr.length ; j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("�����Ԫ�أ�"+Arrays.toString(arr));
		
	}
	

}
