package com.oops.def;

import jdk.swing.interop.SwingInterOpUtils;

public  interface IBonusCalcultor  {
    Void calculate(double amount);
       default void policyType(){
           System.out.println("policy for bonus");
       }

}
