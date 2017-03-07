package gz.itcast.c_server;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * socket�������˳���
 * @author APPle
 *
 */
public class Server {

	public static void main(String[] args) throws Exception {
		//1.����ServerSocket
		ServerSocket server = new ServerSocket(8080);
		
		System.out.println("�������Ѿ������ɹ�....");
		
		while(true){
			//2.���տͻ��˵�����
			Socket socket = server.accept();
			
			//3.��ȡ���ص�test.html�ļ�
			FileInputStream in = new FileInputStream(new File("e:/web/test.html"));
			
			//4.�����������ͨ��
			OutputStream out = socket.getOutputStream();
			
			//5.��������
			byte[] buf = new byte[1024];
			int len = 0;
			while( (len=in.read(buf))!=-1 ){
				out.write(buf, 0, len);
			}
			
			//6.�ر���Դ
			out.close();
			in.close();
		}
		
	}

}
