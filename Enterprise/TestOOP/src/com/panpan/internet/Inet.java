package com.panpan.internet;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @author panpan
 * @create 2024-09-09-上午 09:08
 */
public class Inet {
    public static void main(String[] args) {
        InetSocketAddress isa = new InetSocketAddress("169.254.239.110", 8080);
        System.out.println(isa);
        System.out.println(isa.getAddress());
        System.out.println(isa.getHostName());
        System.out.println(isa.getPort());

        InetAddress ia = isa.getAddress();
        System.out.println(ia.getHostAddress());
        System.out.println(ia.getHostName());
    }
/*    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia1=InetAddress.getByName("www.baidu.com");
        System.out.println(ia1);

        InetAddress ia2=InetAddress.getByName("localhost");
        System.out.println(ia2);

        InetAddress ia3=InetAddress.getByName("127.0.0.1");
        System.out.println(ia3);

        InetAddress ia4=InetAddress.getByName("pan");
        System.out.println(ia4);

        InetAddress ia5=InetAddress.getByName("10.1.11.159");
        System.out.println(ia5);

        System.out.println(ia1.getHostName());
        System.out.println(ia1.getHostAddress());

    }*/
}
