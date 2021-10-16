package com.company;

public class ToTable {

    //  Этот класс должен превращать одномерный массив чисел в таблицу (двумерный массив чисел x на y).

    //  метод resize(), возвращающий двумерный список x на y.
    private int[] data;
    private int x;
    private int y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize() {
        int[][] ndata = new int[x][y];
   //   int count = 0;
   //   for (int i = 0; i < x; i++) {
   //       for (int j = 0; j < y; j++) {
   //           ndata[i][j] = data[count];
   //           count++;
   //       }
   //   }
        for (int i=1; i<data.length;i++) {
            ndata[(int)(i/y)][(int)(i%y)]=data[i];

        }


        return ndata;
    }


}
