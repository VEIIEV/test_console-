package com.company;

public class Player {
    // Опишите класс Payer. В классе должны быть следующие поля:
    // surname (фамилия, строка);
    // name (имя, строка);
    // address (адрес, строка);
    // cardNumber (номер карты).
    // Реализуйте конструктор, принимающий эти параметры (surname, name, address, cardNumber) и метод
    // public toString(), возвращающий строку вида {Payer: surname name, address: address, card: cardNumber}.
    private String surname;
    private String name;
    private String address;
    private int card;

    public Player(String surname,
                  String name,
                  String address,
                  int card) {

        this.name = name;
        this.surname = surname;
        this.card = card;
        this.address = address;
    }
    public void myToString(){
        System.out.println(" {Payer: "+ surname+ " "+ name+ ", "+address+", card: "+ card+"}.");
    }


}
