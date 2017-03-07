package gz.itcast.b_xpath;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

/**
 * ѧϰxPath���ʽ�﷨
 * @author APPle
 *
 */
public class Demo2 {

	public static void main(String[] args) throws Exception {
		Document doc = new SAXReader().read(new File("./src/contact.xml"));
		
		String xpath = "";
		
		/**
		 * 1.  	/      ����·��      ��ʾ��xml�ĸ�λ�ÿ�ʼ����Ԫ�أ�һ����νṹ��
		 */
		xpath = "/contactList";
		xpath = "/contactList/contact";
		
		/**
		 * 2. //     ���·��       ��ʾ�����κβ�νṹ��ѡ��Ԫ�ء�
		 */
		xpath = "//contact/name";
		xpath = "//name";
		
		/**
		 * 3. *      ͨ���         ��ʾƥ������Ԫ��
		 */
		xpath = "/contactList/*"; //����ǩcontactList�µ������ӱ�ǩ
		xpath = "/contactList//*";//����ǩcontactList�µ����б�ǩ�����ֲ�νṹ��
		
		/**
		 * 4. []      ����           ��ʾѡ��ʲô�����µ�Ԫ��
		 */
		//����id���Ե�contact��ǩ
		xpath = "//contact[@id]";
		//�ڶ�����contact��ǩ
		xpath = "//contact[2]";
		//ѡ�����һ��contact��ǩ
		xpath = "//contact[last()]";
		
		/**
		 * 5. @     ����            ��ʾѡ�����Խڵ�
		 */
		xpath = "//@id"; //ѡ��id���Խڵ���󣬷��ص���Attribute����
		xpath = "//contact[not(@id)]";//ѡ�񲻰���id���Ե�contact��ǩ�ڵ�
		xpath = "//contact[@id='002']";//ѡ��id����ֵΪ002��contact��ǩ
		xpath = "//contact[@id='001' and @name='eric']";//ѡ��id����ֵΪ001����name����Ϊeric��contact��ǩ
		
		/**
		 *6.  text()   ��ʾѡ���ı�����
		 */
		//ѡ��name��ǩ�µ��ı����ݣ�����Text����
		xpath = "//name/text()";
		xpath = "//contact/name[text()='����']";//ѡ������Ϊ������name��ǩ
		
		
		List<Node> list = doc.selectNodes(xpath);
		for (Node node : list) {
			System.out.println(node);
		}
	}

}
