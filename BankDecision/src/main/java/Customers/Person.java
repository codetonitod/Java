package Customers;

import Core.Decision;
import Core.DecisionsEnum;

import java.math.BigDecimal;

public class Person implements IDecisionProperties{
    private String Name;
    private int Age;
    private DecisionsEnum Status = DecisionsEnum.UNKNOWN_STATUS;
    private BigDecimal Credit = BigDecimal.valueOf(0);
    private BigDecimal Debit = BigDecimal.valueOf(0);
    private Decision decisionMaking = new Decision();

    public Person(String name, int age, BigDecimal credit, BigDecimal debit){
        this.Name = name;
        this.Age = age;
        this.Credit = credit;
        this.Debit = debit;
    }

    public String getName(){
        return this.Name;
    }

    @Override
    public BigDecimal getCreditAmount() {
        return this.Credit;
    }

    @Override
    public BigDecimal getDebitAmount() {
        return this.Debit;
    }


    public void setStatus(){

        this.Status = decisionMaking.Decision(this);
    }

    public DecisionsEnum getStatus(){
        return this.Status;
    }

}
