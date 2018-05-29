package com.elvin.io.tcpip;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : Server v0.1 2018/5/27 21:08 By Haifeng Pang.
 * @description :
 */
public class Server {

    final static int PROT = 7788;
    public static void main(String[] args) throws IOException {

        ServerSocket server = null;
        server = new ServerSocket(PROT);
        System.out.println(" server start .. ");
        //进行阻塞
        Socket socket = server.accept();
        //新建一个线程执行客户端的任务
        new Thread(new ServerHandler(socket)).start();
    }
}
