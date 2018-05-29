package com.elvin.pattern.pattern.chain;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : SecondHandler v0.1 2018/5/24 09:56 By Haifeng Pang.
 * @description :
 */
public class SecondHandler extends Handler{

    @Override
    public void handlerRequest(Object object) {
        System.out.println(this.getClass().getSimpleName() + "处理事件");
    }
}
