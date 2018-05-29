package com.elvin.pattern.pattern.iouchain;

/**
 * @author : Haifeng Pang.
 * @version 0.1 : LoanOrderHandlerClient v0.1 2018/5/24 10:41 By Haifeng Pang.
 * @description :
 */
public class LoanOrderHandlerClient {


    public static void main(String[] args) {
        ParamCheckHandler paramCheckHandler = new ParamCheckHandler();
        LoanOrderCreateCheckHandler loanOrderCreateCheckHandler = new LoanOrderCreateCheckHandler();
        UserBaseInfoHandler userBaseInfoHandler = new UserBaseInfoHandler();
        UserCreditInfoHandler userCreditInfoHandler = new UserCreditInfoHandler();
        UserNeedCreditInfoHandler userNeedCreditInfoHandler = new UserNeedCreditInfoHandler();
        LoanOrderProgressInfoHandler loanOrderProgressInfoHandler = new LoanOrderProgressInfoHandler();
        LoanOrderOtherInfoHandler loanOrderOtherInfoHandler = new LoanOrderOtherInfoHandler();

        paramCheckHandler.setSuccessor(loanOrderCreateCheckHandler);
        loanOrderCreateCheckHandler.setSuccessor(userBaseInfoHandler);
        userBaseInfoHandler.setSuccessor(userCreditInfoHandler);
        userNeedCreditInfoHandler.setSuccessor(loanOrderProgressInfoHandler);

        paramCheckHandler.handlerRequest("VERSION_1");

    }

}
