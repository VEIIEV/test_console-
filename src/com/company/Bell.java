package com.company;

public class Bell {
    private int count;

    public Bell() {
        count = 0;
    }

    public void belling() {
        if ((count++) % 2 == 0) System.out.println("ding");
        else System.out.println("dong");
    }

}
