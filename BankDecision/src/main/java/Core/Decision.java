package Core;

import Customers.IDecisionProperties;

public class Decision implements IDecision{

    private static int BOTH_EQUALS = 0;
    private static int FIRST_IS_GREATER = 1;
    private static int SECOND_IS_GREATER = -1;


    public DecisionsEnum Decision(IDecisionProperties properties) {
        if(properties.getCreditAmount().compareTo(properties.getDebitAmount()) == BOTH_EQUALS){
            return DecisionsEnum.PENDING;
        }
        if(properties.getCreditAmount().compareTo(properties.getDebitAmount()) == FIRST_IS_GREATER){
            return DecisionsEnum.DECLINED;
        }
        if(properties.getCreditAmount().compareTo(properties.getDebitAmount()) == SECOND_IS_GREATER){
            return DecisionsEnum.ACCEPTED;
        }

        return DecisionsEnum.MANUAL_REVIEW;

    }
}
