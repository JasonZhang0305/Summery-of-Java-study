package com.zzj.api.upload;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPFileUplaodSever {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("在8888端口监听");
        Socket socket = serverSocket.accept();

        //读取客户端发送的数据
        //通过Socket得到一个输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //将得到的bytes写入到指定的路径，就得到了一个文件
        String desFilePath = "/Users/zhejiazhang/Desktop/Programming/Java/Hirosue.png";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desFilePath));
        bos.write(bytes);
        bos.close();
        //向客户端回复 收到图片
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("收到图片");
        writer.flush();//把内容刷新到数据通道
        socket.shutdownOutput();//设置写入结束标记

        writer.close();
        bis.close();
        socket.close();
        serverSocket.close();


    }
}
