package cn.itcsat.junit;

import junit.framework.Assert;

import org.junit.Test;

//������
public class ToolTest {
	
	@Test
	public void testGetMax(){
		int max = Tool.getMax();
		if(max!=5){
			throw new RuntimeException();
		}else{
			System.out.println("���ֵ��"+ max);
		}
		
		//����
		//Assert.assertSame(5, max); // expected ����   actual  ��ʵ     ==
//		Assert.assertSame(new String("abc"), "abc");
//		Assert.assertEquals(new String("abc"), "abc"); //�ײ���ʹ��Equals�����Ƚϵ�
//		Assert.assertNull("aa");
//		Assert.assertTrue(true);
		
		
		
	}
	
	@Test
	public void  testGetMin(){
		int min = Tool.getMin(); 
		if(min!=3){
			throw new RuntimeException();
		}else{
			System.out.println("��Сֵ��"+ min);
		}
	}
	
	

}
