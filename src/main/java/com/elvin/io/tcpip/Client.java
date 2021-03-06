package com.elvin.io.tcpip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : Client v0.1 2018/5/27 21:06 By Haifeng Pang.
 * @description :
 */
public class Client  {

    final static String ADDRESS = "127.0.0.1";
    final static int PORT = 7788;
    public static void main(String[] args) throws IOException {

        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        socket = new Socket(ADDRESS, PORT);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);

        //向服务器端发送数据
        out.println("接收到客户端的请求数据...");
        out.println("接收到客户端的请求数据测试测试...");
        String response = in.readLine();
        System.out.println("Client: " + response);

    }

}
