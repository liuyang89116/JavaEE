package gz.itcast.a_dom4j_read;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

/**
 * ��һ��Dom4j��ȡxml�ĵ�������
 * @author APPle
 *
 */
public class Demo1 {

	
	public static void main(String[] args) {
		try {
			//1.����һ��xml����������
			SAXReader reader = new SAXReader();
			//2.��ȡxml�ĵ�������Document����
			Document doc = reader.read(new File("./src/contact.xml"));
			
			System.out.println(doc);
		} catch (DocumentException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}

}
