package 基于TCP协议的Socket;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
public class TcpSender {
    public static void main(String[] args)throws Exception{
        Socket s=new Socket(InetAddress.getByName("CloudHan"),9999);
        OutputStream outStream=s.getOutputStream();
        String str="Hello TCP Socket";
        outStream.write(str.getBytes());
        outStream.close();
        s.close();
    }
}
