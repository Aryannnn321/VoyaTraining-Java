package com.oops.def;

public class DefMain {
    public static void main(String[] args) {
        IBonusCalcultor bonusCalcultor= new CalcultorImpl();
        bonusCalcultor.calculate(2000);
        bonusCalcultor.policyType();

        IAllowanceCalcultor allowance=(IAllowanceCalcultor) bonusCalcultor;
        allowance.calculate(3000);

    }
}
