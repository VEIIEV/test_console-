package com.company;

public class Squirrel {
    int[] nuts;
    public Squirrel(int[] nuts){
        this.nuts=nuts;
    }

    public int getNuts(int i){
        return nuts[i];
    }

    public int maxNuts(){
        int max=0;
        if((nuts[0]+nuts[1])>=nuts[1]) max=nuts[0]+nuts[1];
        else max=nuts[1];
        if(max<0) max=0;
        for (int i = 2; i < nuts.length-2; i++) {
            if((nuts[i]+nuts[i+1])>=nuts[i]) {max+=nuts[i]+nuts[i+1];}
            else {max+=nuts[i+1]; }
            System.out.println(max);
            i++;
        }
        if((nuts[nuts.length-2]+nuts[nuts.length-2+1])>=nuts[nuts.length-2]) {max+=nuts[nuts.length-2]+nuts[nuts.length-2+1];}
        else {max+=nuts[nuts.length-2+1]; }
        return max;
    }
}
