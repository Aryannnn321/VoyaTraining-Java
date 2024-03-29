package com.object.overriding;

public class Indian extends Menu {
    @Override
    void showItems(String type) {
        super.showItems(type);
        if (type.equals("breakfast")){
            System.out.println("idli");
        } else if (type.equals("lunch")) {
            System.out.println("Northmeal");
        }
        else {
            System.out.println("desserts");
        }

    }
}
