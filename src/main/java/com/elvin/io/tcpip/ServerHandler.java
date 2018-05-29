package com.elvin.io.tcpip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : ServerHandler v0.1 2018/5/27 21:09 By Haifeng Pang.
 * @description :
 */
public class ServerHandler implements Runnable {

    private Socket socket;

    public ServerHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            out = new PrintWriter(this.socket.getOutputStream(), true);
            String body = null;
            while (true) {
                body = in.readLine();
                if (body == null) {
                    break;
                }
                System.out.println("Server :" + body);
                out.println("服务器端回送响的应数据.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
