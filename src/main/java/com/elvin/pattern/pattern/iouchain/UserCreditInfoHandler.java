package com.elvin.pattern.pattern.iouchain;

import com.elvin.pattern.pattern.chain.Handler;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : UserCreditInfoHandler v0.1 2018/5/24 10:36 By Haifeng Pang.
 * @description :
 */
public class UserCreditInfoHandler extends BaseHandler {

    @Override
    public void handlerRequest(Object object) {

        System.out.println(this.getClass().getSimpleName() + "处理事件");

        /**
         * 处理完了也可以继续向下传递
         */
        if (this.successor != null) {
            System.out.println(this.getClass().getSimpleName() + "处理完了传递事件");
            this.successor.handlerRequest(object);
        }
    }

}
