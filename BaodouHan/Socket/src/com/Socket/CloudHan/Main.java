package com.Socket.CloudHan;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Main {

    public static void main(String[] args) throws Exception{
        DatagramSocket ds=new DatagramSocket();
        String str="Hello Socket";
        byte[] byt=str.getBytes();
        int length=byt.length;
        int port =9999;
        InetAddress address=InetAddress.getByName("CloudHan");
        DatagramPacket dp=new DatagramPacket(byt,length,address,port);
        ds.send(dp);
    }
}
