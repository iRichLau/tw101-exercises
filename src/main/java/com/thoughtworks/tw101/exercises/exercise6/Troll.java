package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    private int hitPoints;
    private String name;

    public Troll(String name, int initialHitPoints) {
        this.name = name;
        this.hitPoints = initialHitPoints;
    }

    public void takeDamage(int amount) {
        this.hitPoints -= (amount / 2);
    }

    public void reportStatus() {
        System.out.println(name + " has only " + hitPoints + " hit points left.");
    }
}
