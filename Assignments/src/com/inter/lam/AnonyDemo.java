package com.inter.lam;

public class AnonyDemo {
    public static void main(String[] args) {
        IGreater greater= new GreaterImpl();
        greater.greetMessage("welcome to Lambda");
        IGreater greater1 =new IGreater() {
            @Override
            public void greetMessage(String message) {
                System.out.println(message);
            }
        };
        greater1.greetMessage("Great day");
    }
}
