package gz.itcast.a_dom4j_write;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * ��һ��д�����ݵ�xml�ĵ�
 * @author APPle
 *
 */
public class Demo1 {
	
	public static void main(String[] args) throws Exception{
		//һ����ȡ�򴴽�һ��Document����
		//��ȡday07��Ŀ��xm�ļ�
		Document doc = new SAXReader().read(new File("./src/contact.xml"));
		
		
		//�����޸�Document��������
		
		
		//�������޸ĺ��Document����д����xml�ĵ���
		//ָ���ļ������λ��
		FileOutputStream out = new FileOutputStream("e:/contact.xml");
		//1.����д������
		XMLWriter writer = new XMLWriter(out);
		
		//2.д������
		writer.write(doc);
		//3.�ر���
		writer.close();
	}

}
