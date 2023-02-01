package io.github.theblacksquidward;

public class Critter {

    private final String name;

    public Critter(String name) {
        this.name = name;
    }

    void poke() {
        System.out.println(name + " was poked.");
    }

    public String getName() {
        return name;
    }

    void eat(Critter critter) {
        System.out.println(name + " ate " + critter.getName() + ".");
    }

}
