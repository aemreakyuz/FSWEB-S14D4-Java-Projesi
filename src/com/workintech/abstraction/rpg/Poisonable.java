package com.workintech.abstraction.rpg;

public interface Poisonable {

    default double poison(){
        return 0.3;
    }

}
