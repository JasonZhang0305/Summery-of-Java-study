package com.zzj.api.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1 创建一个DatagramSocket对象，准备一个端口接受数据
        DatagramSocket socket = new DatagramSocket(9999);
        //2 创建一个DatagramPacket对象，准备接受数据
        //udp的一个最大数据包限制在64k以内
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);//这是空的
        //调用接收方法,将通过网络传输的对象传输到packet里去
        //当有数据包发送到本机的9999端口时，就会接收到数据
        //如果没有数据包发送到9999端口，就会阻塞等待
        System.out.println("接受端A等待数据...");
        socket.receive(packet);
        //拆包，取出数据
        int length = packet.getLength();//实际收到数据字节的长度
        byte[] data = packet.getData();//接受数据
        String s = new String(data, 0, length);
        System.out.println(s);

        System.out.println("======");
        data = "好的，明天见~".getBytes();
        packet = new DatagramPacket(data, data.length, InetAddress.getByName("10.0.26.247"), 9998);
        socket.send(packet);
        socket.close();
        System.out.println("A端退出");
    }
}
