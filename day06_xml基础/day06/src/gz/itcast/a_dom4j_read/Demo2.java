package gz.itcast.a_dom4j_read;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/**
 * �ڶ���dom4j��ȡxml�ļ�����
 * �ڵ�
 * ��ǩ
 * ����
 * �ı�
 * @author APPle
 *
 */
public class Demo2 {
	
	/**
	 * �õ��ڵ���Ϣ
	 */
	@Test
	public void test1() throws Exception{
		//1.��ȡxml�ĵ�������Document����
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/contact.xml"));
		
		//2.nodeIterator: �õ���ǰ�ڵ��µ������ӽڵ����(�����������µĽڵ�)
		Iterator<Node> it = doc.nodeIterator();
		while(it.hasNext()){//�ж��Ƿ�����һ��Ԫ��
			Node node = it.next();//ȡ��Ԫ��
			String name = node.getName();//�õ��ڵ�����
			//System.out.println(name);
			
			//System.out.println(node.getClass());
			//����ȡ����������ӽڵ�
			//ֻ�б�ǩ�ڵ�����ӽڵ�
			//�жϵ�ǰ�ڵ��Ƿ��Ǳ�ǩ�ڵ�
			if(node instanceof Element){
				Element elem = (Element)node;
				Iterator<Node> it2 = elem.nodeIterator();
				while(it2.hasNext()){
					Node n2 = it2.next();
					System.out.println(n2.getName());
				}
			}
		}
	}
	
	/**
	 * ����xml�ĵ������нڵ�
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception{
		//1.��ȡxml�ĵ�������Document����
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/contact.xml"));
		
		//�õ�����ǩ
		Element rooElem = doc.getRootElement();
		
		getChildNodes(rooElem);

	}
	
	/**
	 * ��ȡ ����ı�ǩ�µ������ӽڵ�
	 * @param elem
	 */
	private void getChildNodes(Element elem){
		System.out.println(elem.getName());
		
		//�õ��ӽڵ�
		Iterator<Node> it = elem.nodeIterator();
		while(it.hasNext()){
			Node node = it.next();
			
			//1.�ж��Ƿ��Ǳ�ǩ�ڵ�
			if(node instanceof Element){
				Element el = (Element)node;
				//�ݹ�
				getChildNodes(el);
			}
		};
	}
	
	/**
	 * ��ȡ��ǩ
	 */
	@Test
	public void test3() throws Exception{
		//1.��ȡxml�ĵ�������Document����
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/contact.xml"));
		
		//2.�õ�����ǩ
		Element  rootElem = doc.getRootElement();
		//�õ���ǩ����
		String name = rootElem.getName();
		System.out.println(name);
		
		//3.�õ���ǰ��ǩ��ָ�����Ƶĵ�һ���ӱ�ǩ
		/*
		Element contactElem = rootElem.element("contact");
		System.out.println(contactElem.getName());
		*/
		
		//4.�õ���ǰ��ǩ��ָ�����Ƶ������ӱ�ǩ
		/*
		Iterator<Element> it = rootElem.elementIterator("contact");
		while(it.hasNext()){
			Element elem = it.next();
			System.out.println(elem.getName());
		}
		*/
		
		//5.�õ���ǰ��ǩ�µĵ������ӱ�ǩ
		List<Element> list = rootElem.elements();
		//����List�ķ���
		//1)��ͳforѭ��  2����ǿforѭ�� 3��������
		/*for(int i=0;i<list.size();i++){
			Element e = list.get(i);
			System.out.println(e.getName());
		}*/
		
	/*	for(Element e:list){
			System.out.println(e.getName());
		}*/
		/*
		Iterator<Element> it = list.iterator(); //ctrl+2 �ɿ� l
		while(it.hasNext()){
			Element elem = it.next();
			System.out.println(elem.getName());
		}*/
		
		//��ȡ�����εı�ǩ(����ֻ��һ���ػ�ȡ)
		Element nameElem = doc.getRootElement().
					element("contact").element("name");
		System.out.println(nameElem.getName());
		
	}
	
	/**
	 * ��ȡ����
	 */
	@Test
	public void test4() throws Exception{
		//1.��ȡxml�ĵ�������Document����
		SAXReader reader = new SAXReader();
		Document doc = reader.read(new File("./src/contact.xml"));
		
		//��ȡ���ԣ����Ȼ���������ڵı�ǩ����Ȼ����ܻ�ȡ���ԣ�
		//1.�õ���ǩ����
		Element contactElem = doc.getRootElement().element("contact");
		//2.�õ�����
		//2.1  �õ�ָ�����Ƶ�����ֵ
		/*
		String idValue = contactElem.attributeValue("id");
		System.out.println(idValue);
		*/
		
		//2.2 �õ�ָ���������Ƶ����Զ���
		/*Attribute idAttr = contactElem.attribute("id");
		//getName�� ��������    getValue������ֵ
		System.out.println(idAttr.getName() +"=" + idAttr.getValue());*/
		
		//2.3 �õ��������Զ���,����LIst����
		/*List<Attribute> list = contactElem.attributes();
		//��������
		for (Attribute attr : list) {
			System.out.println(attr.getName()+"="+attr.getValue());
		}*/
		
		//2.4 �õ��������Զ��󣬷��ص�����
		Iterator<Attribute> it = contactElem.attributeIterator();
		while(it.hasNext()){
			Attribute attr = it.next();
			System.out.println(attr.getName()+"="+attr.getValue());
		}
		
	}
	
	/**
	 * ��ȡ�ı�
	 */
	@Test
	public void test5() throws Exception{
		//1.��ȡxml�ĵ�������Document����
		SAXReader reader = new SAXReader();
					
		Document doc = reader.read(new File("./src/contact.xml"));
		
		
		/**
		 * ע��: �ո�ͻ���Ҳ��xml������
		 */
		String content = doc.getRootElement().getText();
		System.out.println(content);
		
		
		//��ȡ�ı����Ȼ�ȡ��ǩ���ٻ�ȡ��ǩ�ϵ��ı���
		Element nameELem = 
			doc.getRootElement().element("contact").element("name");
		//1. �õ��ı�
		String text = nameELem.getText();
		System.out.println(text);
		
		//2. �õ�ָ���ӱ�ǩ�����ı�����
		String text2 = 
			doc.getRootElement().element("contact").elementText("phone");
		System.out.println(text2);
		
	}
	
	
}
