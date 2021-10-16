package com.company;

public class LimitingRectangle {
    // метод getWidth(), возвращающий целое число (ширину прямоугольника);
    // метод getHeight(), возвращает целое число (высоту прямоугольника);
    // метод getBorders, возвращает строку вида {нижняя точка по Y, верхняя точка по Y, левая точка по Х, правая точка по Х}.
    private int[][] points;

    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    public int getWidth() {
        int min = points[0][0];
        int max = 0;
        for (int i = 0; i < points.length; i++) {
            if (max < points[i][0]) max = points[i][0];
            if (min > points[i][0]) min = points[i][0];
        }
        return max - min;
    }

    public int getHeight() {
        int min = points[0][1];
        int max = 0;
        for (int i = 0; i < points.length; i++) {
            if (max < points[i][1]) max = points[i][1];
            if (min > points[i][1]) min = points[i][1];
        }
        return max - min;
    }

    public int[] getBorders() {

        int minw = points[0][0];
        int maxw = 0;
        for (int i = 0; i < points.length; i++) {
            if (maxw < points[i][0]) maxw = points[i][0];
            if (minw > points[i][0]) minw = points[i][0];
        }

        int minh = points[0][1];
        int maxh = 0;
        for (int i = 0; i < points.length; i++) {
            if (maxh < points[i][1]) maxh = points[i][1];
            if (minh > points[i][1]) minh = points[i][1];
        }
        int[] border={minh,maxh,minw,maxw};
        return border;
    }


}
