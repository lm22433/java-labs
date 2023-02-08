package sheet2;

public class Chocolate extends Food {

    @Override
    public String eaten(Animal animal) {
        return "animal eats chocolate";
    }

    @Override
    public String eaten(Dog animal) {
        return "dog eats chocolate";
    }

    @Override
    public String eaten(Cat animal) {
        return "cat eats chocolate";
    }
}
