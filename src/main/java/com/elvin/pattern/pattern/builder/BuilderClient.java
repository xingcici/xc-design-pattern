package com.elvin.pattern.pattern.builder;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : BuilderClient v0.1 2018/5/23 17:59 By Haifeng Pang.
 * @description :
 */
public class BuilderClient {

    public static void main(String[] args) {
        LoanOrderCollectDirector director = new MyLoanOrderCollectDirector(new MyLoanOrderCollectBuilder());

        LoanOrderCollectDTO collectDTO = director.directLoanOrderCollect();

        System.out.println(collectDTO.getLoanOrderBasicInfo().getPrice());
    }
}
