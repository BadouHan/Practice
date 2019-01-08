package 基于TCP协议的Socket;
import jdk.internal.util.xml.impl.Input;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpReceiver {
    public static void main(String[] args)throws Exception{
    ServerSocket ss=new ServerSocket(9999);
    System.out.println("阻塞，等待链接：");
    Socket s=ss.accept();
    System.out.println("已收到链接");
    System.out.println("开始解析数据....");
    InputStream ins =s.getInputStream();
    byte[] bys=new byte[1024];
    int length=ins.read(bys);
    InetAddress address =s.getInetAddress();
    System.out.println("发送者Sender>-----"+address.getHostName()+":"+address.getHostAddress());
    System.out.println(new String(bys,0,length));
    ins.close();
   // s.close();//可以不关服务端
    }
}
