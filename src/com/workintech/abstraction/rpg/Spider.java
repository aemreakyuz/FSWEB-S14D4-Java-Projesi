package com.workintech.abstraction.rpg;

public class Spider extends Monster implements Poisonable{

    public Spider(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }



    public double attack() {
        return getDamage() + (getDamage() * poison());
    }
}
