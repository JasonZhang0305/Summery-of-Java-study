package com.zzj.api.homework;

import com.zzj.api.upload.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        //1 接受用户输入，指定下载文件名
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入下载文件名");
        String downLoadFileName = scanner.next();

        //2 客户端链接服务端，准备发送
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //3 获取和Socket关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downLoadFileName.getBytes());
        //设置写入结束标志
        socket.shutdownOutput();

        //4 读取服务端返回的文件（字节数据）
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //5 得到一个输出流，准备将bytes写入到磁盘文件
        String filePath = "/Users/zhejiazhang/Desktop/Programming/Java/" + downLoadFileName + ".mp4";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);

        bos.close();
        bis.close();
        outputStream.close();
        socket.close();

        System.out.println("客户端下载完毕");
    }
}
