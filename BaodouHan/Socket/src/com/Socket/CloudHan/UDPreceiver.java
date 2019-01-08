package com.Socket.CloudHan;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPreceiver {
    public static void main(String[] args)throws Exception{
        DatagramSocket ds=new DatagramSocket(9999);
        byte[] byt=new byte[1024];
        DatagramPacket dp=new DatagramPacket(byt,byt.length);
        System.out.println("阻塞，等待包....");
        ds.receive(dp);
        System.out.println("接收成功！");
        InetAddress address=dp.getAddress();//获取发送端ip地址
        byte[] byts=dp.getData();
        int length=byts.length;
System.out.println("Sender>------"+address.getHostName()+":"+address.getHostAddress());
System.out.println(new String(byts,0,length));
        ds.close();
    }
}
