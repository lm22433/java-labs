import java.util.Random;

public class LittlePig {
    int hp = 1;
    String name = chooseRandomName();

    private static String chooseRandomName() {
        String[] possibleNames = new String[]{"Peppa", "Wilbur", "Porky",
                "Miss Piggy", "Babe", "Piglet",
                "Ganon", "Pey'j"};
        Random rand = new Random();
        int randomIndex = rand.nextInt(possibleNames.length);
        return possibleNames[randomIndex];
    }
}
