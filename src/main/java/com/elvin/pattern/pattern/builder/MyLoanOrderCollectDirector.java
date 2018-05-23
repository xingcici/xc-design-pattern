package com.elvin.pattern.pattern.builder;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : MyLoanOrderCollectDirector v0.1 2018/5/23 17:49 By Haifeng Pang.
 * @description :
 */
public class MyLoanOrderCollectDirector implements LoanOrderCollectDirector {

    private LoanOrderCollectBuilder builder;

    public MyLoanOrderCollectDirector(LoanOrderCollectBuilder builder) {
        this.builder = builder;
    }

    @Override
    public LoanOrderCollectDTO directLoanOrderCollect() {
        LoanOrderBasicInfoDTO basicInfoDTO = builder.builderLoanOrderBasicInfo();
        LoanOrderTrackInfoDTO trackInfoDTO = builder.builderLoanOrderTrackInfo();

        return LoanOrderCollectDTO.builder().loanOrderBasicInfo(basicInfoDTO).loanOrderTrackInfo(trackInfoDTO).build();

    }


}
