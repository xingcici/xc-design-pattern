package com.elvin.pattern.pattern.chain;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : HandlerClient v0.1 2018/5/24 09:57 By Haifeng Pang.
 * @description :
 */
public class HandlerClient {

    public static void main(String[] args) {
        Handler firstHandler = new FirstHandler();
        Handler secondHandler = new SecondHandler();

        firstHandler.setSuccessor(secondHandler);

        firstHandler.handlerRequest(100);
    }
}
