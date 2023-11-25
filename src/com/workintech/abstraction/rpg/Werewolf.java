package com.workintech.abstraction.rpg;

public class Werewolf extends Monster implements Bleedable{
    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    public double attack() {
        return getDamage() + bleed();
    }

    public double bleed() {
        return getDamage() * 0.25;
    }

    public double bleed(int level) {
        return getDamage() * level * 0.25;
    }
}
