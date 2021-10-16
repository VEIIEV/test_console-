package com.company;

public class Programmar {
//  name (имя, строка);
//  company (имя компании, строка);
//  position (позиция, строка);
//  конструктор, принимающий name и company;
//  метод getPosition(), возвращающий строку — позицию программиста.
//  метод work(), поднимающий позицию программиста на уровень вверх (с самого начала (при инициализации)
//  программист — intern (стажер), потом junior (джуниор), далее middle, senior, lead).
    private static String[] lvl= {"intern","junior", "middle", "senior", "lead"};
    private String name;
    private String company;
    private int yourLvl=0;
    private String position="intern";

    public Programmar(String name, String company){
        this.name=name; this.company=company;
    }

    public String getPosition(){
        return position;
    }

    public void work(){
        position=lvl[++yourLvl];

    }

}
