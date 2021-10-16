package com.company;

public class Mage {
   private String name;
   private int level;
   private int damage;
   private String type;


   public Mage(String name,
           int level,
           int damage,
           String type){
      this.level=level;
      this.damage=damage;
      this.name=name;
      this.type=type;
   }

   public String getInfo(){
      StringBuffer str= new StringBuffer("{");
         str.append(name+", "+level+", "+damage+", "+type+"}");

      return  str.append(name+", "+level+", "+damage+", "+type+"}").toString();
   }

   public String fight(Mage first, Mage second){
      if ((first.type.equals("fire") && second.type.equals("frost"))
      ||(first.type.equals("frost") && second.type.equals("earth"))
      ||(first.type.equals("earth") && second.type.equals("fire"))) return first.name;
      else if (!first.type.equals(second.type)) return second.name;
      else {
         if (first.level>second.level) return first.name;
         else if(first.level<second.level) return second.name;
         else {
            if (first.damage>second.damage) return first.name;
            else if(first.damage<second.damage) return second.name;
            else return "draw";
         }
      }
   }
}
