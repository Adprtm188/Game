package com.mycompany.game;
public class Player {
        String name;
        int speed, healthPoin, damage, armor;
    
    void run(){
        System.out.println(name+" is running");
        System.out.println("Speed = "+speed);
    }
    void attack(){
        System.out.println(name+" is attacking");
        System.out.println("Damage = "+damage);
    }
    void defend(int value){
        System.out.println(name+" get attacked");
        damage = value;
        armor-=damage;
        System.out.println("Armor - "+damage);
        System.out.println("Armor = "+armor);
    }
    boolean isDead(){
        if(healthPoin<=0)return true;return false;
    }
    
    
}
