package com.zzj.api.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
    public static void main(String[] args) throws IOException {
        //连接服务端（ip, 端口）
        //如果连接成功，返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket 返回=" + socket.getClass());
        //得到和socket关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, server".getBytes());
        //设置一个结束标记
        socket.shutdownOutput();
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readln = 0;
        while((readln = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readln));
        }
        outputStream.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
