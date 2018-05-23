package com.elvin.pattern.pattern.builder;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : LoanOrderCollectBuilder v0.1 2018/5/23 17:40 By Haifeng Pang.
 * @description :
 */
public interface LoanOrderCollectBuilder {

    LoanOrderBasicInfoDTO builderLoanOrderBasicInfo();

    LoanOrderTrackInfoDTO builderLoanOrderTrackInfo();
}
