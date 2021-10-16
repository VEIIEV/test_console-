package com.company;

public class Balance {
    private int r;
    private int l;


    public void addRight(int x) {
        r+=x;
    }

    public void addLeft(int x) {
        l+=x;
    }

    public char getSituation() {
        if (r > l) return 'R';
        else if (r < l) return 'L';
        else return '=';
    }

}
