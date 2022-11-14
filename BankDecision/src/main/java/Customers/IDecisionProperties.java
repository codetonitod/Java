package Customers;

import Core.DecisionsEnum;

import java.math.BigDecimal;

public interface IDecisionProperties {
    public BigDecimal getCreditAmount();
    public BigDecimal getDebitAmount();
    public void setStatus();

}
