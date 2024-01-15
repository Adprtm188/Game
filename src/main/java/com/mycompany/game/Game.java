package com.mycompany.game;

public class Game {

    public static void main(String[] args) {
        Player hero = new Player();
        enemy enemi = new enemy ();

        hero.name = "Peni";
        hero.speed = 40;
        hero.healthPoin = 100;
        hero.damage = 50;
        hero.armor = 100;

        enemi.name = "Jumbi";
        enemi.damage = 10;
        enemi.armor = 70;
        enemi.healthPoint = 100;
        
        hero.attack();
        enemi.deffend(hero.damage);
        System.out.println("====================");
        enemi.attack();
        hero.defend(enemi.damage);
        if (hero.isDead()) {
            System.out.println("Game Over! :p");
        }
        if (enemi.isDead()) {
            System.out.println("You Win! :3");
        }
    }
}
