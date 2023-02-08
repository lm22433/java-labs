package sheet2;

public class Fruit extends Food {

    @Override
    public String eaten(Animal animal) {
        return "animal eats fruit";
    }

    @Override
    public String eaten(Dog animal) {
        return "dog eats fruit";
    }

    @Override
    public String eaten(Cat animal) {
        return "cat eats fruit";
    }
}
