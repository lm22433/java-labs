package io.github.theblacksquidward;

public class Critter {

    private final String name;

    public Critter(String name) {
        this.name = name;
    }

    void poke() {
        System.out.println(name + " was poked.");
    }

}
