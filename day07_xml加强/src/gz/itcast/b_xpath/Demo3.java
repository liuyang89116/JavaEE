package gz.itcast.b_xpath;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * xpath������ ģ���û���¼Ч��
 * @author APPle
 *
 */
public class Demo3 {

	public static void main(String[] args)throws Exception{
		//1.��ȡ�û�������û���������
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�������û�����");
		String name = br.readLine();
		
		System.out.println("���������룺");
		String password = br.readLine();
		
		//2.�������ݿ⡱�в�ѯ�Ƿ��ж�Ӧ���û�
		//��Ӧ���û���  ��user.xml�ļ����ҵ�һ��
		   //name����ֵΪ���û����롯����password����ֵΪ���û����롯��user��ǩ
		Document doc = new SAXReader().read(new File("./src/user.xml"));
		Element userElem = (Element)doc.selectSingleNode("//user[@name='" +name +"' and @password='"+password+"']");
		
		if(userElem!=null){
			//��¼�ɹ�
			System.out.println("��¼�ɹ�");
		}else{
			//��¼ʧ��
			System.out.println("��¼ʧ��");
		}
	}

}
