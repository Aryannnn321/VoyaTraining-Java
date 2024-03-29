package com.object.overriding;

public class Restaurant {
    public static void main(String[] args){
        Menu menu= new Chinese();
        menu.showItems("breakfast");
        Chinese chinese = (Chinese)menu;
        chinese.printGames();
        Menu menu1=new Indian();
        menu1.showItems("lunch");
    }
}
