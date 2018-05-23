package com.elvin.pattern.pattern.builder;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : MyLoanOrderCollectBuilder v0.1 2018/5/23 17:41 By Haifeng Pang.
 * @description :
 */
@Repository
@Service
public class MyLoanOrderCollectBuilder implements LoanOrderCollectBuilder {

    @Override
    public LoanOrderBasicInfoDTO builderLoanOrderBasicInfo() {
        return LoanOrderBasicInfoDTO.builder().price("250").build();
    }

    @Override
    public LoanOrderTrackInfoDTO builderLoanOrderTrackInfo() {
        return LoanOrderTrackInfoDTO.builder().source("月球").build();
    }
}
