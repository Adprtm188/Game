package com.mycompany.game;
public class enemy {
   String name;
   int healthPoint,damage,armor;
   
   boolean isDead(){
   if(healthPoint <=0 ) return true; return false;
   }
   
   void attack(){
       System.out.println(name+" is attacking");
       System.out.println("damage "+damage);
   }
   void deffend(int value){
        System.out.println(name+" get attacked");
        damage = value;
        armor-=damage;
        System.out.println("Armor - "+damage);
        System.out.println("Armor = "+armor);
   }
}
   
