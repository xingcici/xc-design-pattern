package com.elvin.pattern.pattern.iouchain;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : LoanOrderOtherInfoHandler v0.1 2018/5/24 10:40 By Haifeng Pang.
 * @description :
 */
public class LoanOrderOtherInfoHandler extends BaseHandler {

    @Override
    public void handlerRequest(Object object) {

        System.out.println(this.getClass().getSimpleName() + "最终处理事件");
    }
}
