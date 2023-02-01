public class Critter {
    String name;

    void Critter(name) {
        this.name = name
    }

    void poke() {
        System.out.println(this.name + " was poked!\n");
    }

    String get_name() {
        return this.name;
    }

    void eat(Critter c) {
        System.out.println(this.name + " Ate the " + c.get_name()+"\n");
    }
}
