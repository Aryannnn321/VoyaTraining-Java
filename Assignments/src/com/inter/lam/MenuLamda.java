package com.inter.lam;

import jdk.swing.interop.SwingInterOpUtils;

public class MenuLamda {
    public static void main(String[] args) {
        IMenu menu=()-> {
            System.out.println("Chinese");
            System.out.println("gobi");
            System.out.println("noodles");
        };
        menu.showMenus();
        IMenu iMenu=()-> {
            System.out.println("indian");
            System.out.println("rice");
            System.out.println("dosa");};
        iMenu.showMenus();
        IMenu iMenu1=()-> {System.out.println("italian");
        System.out.println("nothing");
        System.out.println("pasta");};
        iMenu1.showMenus();

    }
}
