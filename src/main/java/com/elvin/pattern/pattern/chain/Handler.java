package com.elvin.pattern.pattern.chain;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : Handler v0.1 2018/5/24 09:51 By Haifeng Pang.
 * @description :
 */
public abstract class Handler {
    /**
     *
     */
    protected Handler successor;

    /**
     *
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handlerRequest(Object object);
}
