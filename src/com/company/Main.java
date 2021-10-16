package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//       Balance balance=new Balance();
//       balance.addRight();
//       balance.addRight();
//       System.out.println(balance.getSituation());

//   Bell bell= new Bell();
//   for (int i = 0; i < 5; i++) {
//       bell.belling();
//   }

//      Player player=new Player("Lord","Darkwood","9 3/4", 123123);
//      player.myToString();

//     Dog dog= new Dog("doom", 15);
//     System.out.println(dog.bark());

  //     Human human1= new Human();
  //     Human human2= new Human(15, 123, "sd","SD ");

        Programmar programmar=new Programmar("oleg","net");
        System.out.println(programmar.getPosition());
        programmar.work();
        System.out.println(programmar.getPosition());
        programmar.work();
        System.out.println(programmar.getPosition());
        programmar.work();
        System.out.println(programmar.getPosition());

        int[][] point ={{25,44},{13, 6}};
        LimitingRectangle rectangle=new LimitingRectangle(point);
        for (int i = 0; i <rectangle.getBorders().length ; i++) {
            System.out.println(rectangle.getBorders()[i]);
        }
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());


        ToTable toTable=new ToTable(new int[]{6, 3, 4, 3, 2},3,2);
        toTable.resize();


        Mage first =new Mage("1",1,25,"frost");
        Mage second =new Mage("2",1,25,"earth");
        Mage third =new Mage("3",1,25,"fire");
        Mage forth =new Mage("4",1,2,"fire");
        System.out.println(first.fight(first,second));
        System.out.println(first.fight(first,third));
        System.out.println(first.fight(third,forth));
        System.out.println(first.fight(first,first));


        TicTacToe ttt= new TicTacToe();
        System.out.println(ttt.getField());
        System.out.println(ttt.makeMove(16,23));
        System.out.println(ttt.getField());
        System.out.println(ttt.checkGame());
        System.out.println(ttt.makeMove(0,0));
        System.out.println(ttt.getField());
        System.out.println(ttt.checkGame());
        System.out.println(ttt.makeMove(2,2));
        System.out.println(ttt.getField());
        System.out.println(ttt.checkGame());
        System.out.println(ttt.makeMove(2,2));
        System.out.println(ttt.getField());
        System.out.println(ttt.checkGame());
        ttt.makeMove(0,1);
        ttt.makeMove(2,1);
        ttt.makeMove(0,2);
        ttt.makeMove(2,0);
        System.out.println(ttt.checkGame());
        System.out.println( ttt.makeMove(2,0));

        Squirrel squirrel = new Squirrel(new int[]{-5, 4, -4, 5, -6, 13});
        System.out.println(squirrel.maxNuts());


    }
}
