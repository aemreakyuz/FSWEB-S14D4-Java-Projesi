package com.workintech.abstraction.rpg;

public class Troll extends Monster implements Bleedable, Poisonable{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    public double attack() {
        return getDamage() + bleed() + (getDamage() * poison());
    }
    public double bleed(){
        return getDamage() * 0.25;
    }

    public double bleed(int level) {
        return getDamage() * level * 0.25;
    }
}
