package com.elvin.pattern.pattern.iouchain;

import com.elvin.pattern.pattern.chain.Handler;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : Handler v0.1 2018/5/24 10:30 By Haifeng Pang.
 * @description :
 */
public abstract class BaseHandler {

    /**
     *
     */
    protected BaseHandler successor;

    /**
     *
     */
    public void setSuccessor(BaseHandler successor) {
        this.successor = successor;
    }

    public abstract void handlerRequest(Object object);
}
