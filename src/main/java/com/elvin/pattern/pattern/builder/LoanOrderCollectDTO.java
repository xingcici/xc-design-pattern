package com.elvin.pattern.pattern.builder;

import lombok.Builder;
import lombok.Data;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : LoanOrderCollectDTO v0.1 2018/5/23 16:59 By Haifeng Pang.
 * @description :
 */
@Data
@Builder
public class LoanOrderCollectDTO {

    private LoanOrderBasicInfoDTO loanOrderBasicInfo;

    private LoanOrderTrackInfoDTO loanOrderTrackInfo;
}
