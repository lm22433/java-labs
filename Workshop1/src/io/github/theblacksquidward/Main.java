package io.github.theblacksquidward;

public class Main {

    public static void main(String[] args) {
        Critter lion = new Critter("Lion");
        Critter cat = new Critter("Cat");
        lion.poke();
        lion.eat(cat);
    }

}
