package com.zzj.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        //返回InetAddress的对象
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2);
        String hostAddress = host2.getHostAddress();
        System.out.println(hostAddress);
        String hostName = host2.getHostName();
        System.out.println(hostName);

    }

}
