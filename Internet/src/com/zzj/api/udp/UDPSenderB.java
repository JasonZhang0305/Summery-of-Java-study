package com.zzj.api.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象，准备发送和接受数据
        //发送端B也是可以接受数据的，所以也需要初始化一个端口
        DatagramSocket socket = new DatagramSocket(9998);
        //将需要发送的数据，封装到DatagramPacket对象中
        byte[] data = "hello 明天吃火锅~".getBytes();
        //封装的DatagramPacket对象data是一个字节数组，字节长度，端口
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("10.0.26.247"), 9999);
        socket.send(packet);

        System.out.println("======-");
        byte[] buf01 = new byte[1024];
        packet = new DatagramPacket(buf01, buf01.length);//
        socket.receive(packet);
        int length = packet.getLength();//实际收到数据字节的长度
        data = packet.getData();//接受数据
        String s = new String(data, 0, length);
        System.out.println(s);
        socket.close();
        System.out.println("B端退出");
    }
}
