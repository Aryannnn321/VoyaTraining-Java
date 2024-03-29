package com.object.overriding;

public class Chinese  extends Menu{
    @Override
    void showItems(String type) {
        super.showItems(type);
        if (type.equals("starters")){
            System.out.println("chilli");
        } else if (type.equals("lunch")){
            System.out.println("Meal");

        }
        else {
            System.out.println("deserts");
        }

    }
    void printGames(){

        System.out.println("board games available");
    }
}
