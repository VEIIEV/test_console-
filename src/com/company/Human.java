package com.company;

public class Human {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String work;

    public Human() {
        name = "ivan";
        age = 25;
        weight = 70;
        address = null;
        work = null;
    }

    public Human(String name, int age) {
        this();
        this.name=name;
        this.age=age;


    }

    public Human(String name, String address) {
        this();
        this.name=name;
        this.address=address;
    }

    public Human(String name, int age, int weight) {
        this();
        this.name=name;
        this.age=age;
        this.weight=weight;

    }

    public Human(String name, int age, String work) {
        this();
        this.name=name;
        this.age=age;
        this.work=work;

    }

    public Human(int age, int weight, String address, String work) {
        this();
        this.age=age;
        this.weight=weight;
        this.address=address;
        this.work=work;


    }


    //   Создайте 5 инициализаторов (конструкторов), принимающих:
    //
    //   name, age;
    //   name, address;
    //   name, age, weight;
    //   name, age, work;
    //   age, weight, address, work.
    //   Задача конструктора — создать полноценный объект (сделать его валидным).
    //   То есть, если вес неизвестен, то нужно указать хоть какой-нибудь средний вес,
    //   то же касается возраста и имени, а вот адреса и работы может и не быть (равны null).
}
