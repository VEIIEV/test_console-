package com.company;

public class Separator {
    //   Добавьте в него поле array и конструктор, инициализирующий его.
    //   Также реализуйте методы even() и odd(), они должны возвращать массив четных или нечетных чисел, отобранных из array.
    private int[] array;

    public Separator(int[] array) {
        this.array = array;
    }

    public int[] even() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) count++;
        }
        int[] even = new int[count];
        count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even[count]=array[i];
                count++;
            }
        }
        return even;
    }

    public int[] odd() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) count++;
        }
        int[] even = new int[count];
        count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                even[count]=array[i];
                count++;
            }
        }
        return even;
    }

}
