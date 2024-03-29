package com.oops.def;

public class CalcultorImpl  implements IBonusCalcultor, IAllowanceCalcultor {

    @Override
    public void  calculate(double amount) {
        System.out.println(amount *5); }

    @Override
    public void policyType() {
        IBonusCalcultor.super.policyType();

    }
}


