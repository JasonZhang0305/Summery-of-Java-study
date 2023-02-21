package com.zzj.api.homework;

import com.zzj.api.upload.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        //1 监听 9999端口，等待客服端连接
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待下载文件");
        Socket socket = serverSocket.accept();
        //2 读取客户端要下载的文件名
        InputStream inputStream = socket.getInputStream();
        String downLoadFileName = inputStream.toString();
        System.out.println("客户端希望下载" + downLoadFileName);
        //如果客户要下载的是 wangwang, 则返回该文件，否则一律返回dogs
        String readFileName = "";
        if ("wangwang".equals(downLoadFileName)) {
            readFileName = "src/wangwang.mp4";
        } else {
            readFileName = "src/dogs.mp4";
        }
        //4 创建一个输入流，读取文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(readFileName));
        //5 使用工具类StreamUtil，读取文件到一个字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //6 得到Socket关联的输出流
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        //7 写入到数据通道，返回给客户端
        bos.write(bytes);
        socket.shutdownOutput();//很关键

        //关闭相关资源
        bis.close();
        socket.close();
        serverSocket.close();
    }
}
