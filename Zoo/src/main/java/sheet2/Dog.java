package sheet2;

public class Dog extends Animal {

    @Override
    public String eat(Food food) {
        return food.eaten(this);
    }

}
