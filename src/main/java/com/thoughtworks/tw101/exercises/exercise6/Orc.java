package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    public int hitPoints;
    public String name;

    public Orc(String name, int initialHitPoints) {
        this.name = name;
        this.hitPoints = initialHitPoints;
    }

    public void takeDamage(int amount) {
        this.hitPoints -= amount;
    }

    public void reportStatus() {
        System.out.println(name + " has only " + hitPoints + " hit points left.");
    }
}


