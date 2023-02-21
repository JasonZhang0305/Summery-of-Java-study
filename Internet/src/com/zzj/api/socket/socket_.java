package com.zzj.api.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class socket_ {
    public static void main(String[] args) throws IOException {
        //在本机的9999端口监听，等待连接
        //要求在本机没有其他服务在监听9999
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Server is waiting at 9999 port.");
        //当没有客服端连接9999端口时，程序会阻塞，等待连接
        //当有客服连接，则会返回Socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println(socket.getClass());

        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readln = 0;
        while((readln = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readln));
        }
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, client".getBytes());
        socket.shutdownOutput();
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
