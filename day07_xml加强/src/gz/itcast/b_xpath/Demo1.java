package gz.itcast.b_xpath;

import java.io.File;
import java.io.FileOutputStream;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * ��һ��xpath����
 * @author APPle
 *
 */
public class Demo1 {

	
	public static void main(String[] args) throws Exception{
		/**
		 * ����: ɾ��idֵΪ2��ѧ����ǩ
		 */
		Document doc = new SAXReader().read(new File("e:/student.xml"));
		
		//1.��ѯidΪ2��ѧ����ǩ
		//ʹ��xpath����
		Element stuElem = (Element)doc.selectSingleNode("//Student[@id='2']");

		//2.ɾ����ǩ
		stuElem.detach();
		
		//3.д��xml�ļ�
		FileOutputStream out = new FileOutputStream("e:/student.xml");
		OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("utf-8");
		XMLWriter writer = new XMLWriter(out,format);
		writer.write(doc);
		writer.close();
	}

}
