package com.company;

public class ToLine {
  // Этот класс работает наоборот, то есть из двумерного массива делает одномерный.
  // В этом классе реализуйте:
  // поле data (двумерный массив);
  // конструктор, инициализирующий данное поле (data);
  // метод resize(), возвращающий одномерный список.
    private int[][] data;

    public ToLine(int[][] data){
        this.data=data;
    }

    public int[] resize(){
        int count=0;

        for (int i = 0; i < data.length; i++) {
            count+=data[i].length;
        }
        int[] newData= new int[count];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                newData[count++]=data[i][j];
            }
        }
        return newData;
    }
}
