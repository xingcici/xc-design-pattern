package com.elvin.pattern.pattern.chain;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : FirstHandler v0.1 2018/5/24 09:53 By Haifeng Pang.
 * @description :
 */
public class FirstHandler extends Handler{

    @Override
    public void handlerRequest(Object object) {

        if ((int)object < 1000) {
            System.out.println(this.getClass().getSimpleName() + "处理事件");

            /**
             * 处理完了也可以继续向下传递
             */
            if (this.successor != null) {
                System.out.println(this.getClass().getSimpleName() + "处理完了传递事件");
                this.successor.handlerRequest(object);
            }
        }else {
            if (this.successor != null) {
                System.out.println(this.getClass().getSimpleName() + "传递事件");
                this.successor.handlerRequest(object);
            }
        }
    }
}
