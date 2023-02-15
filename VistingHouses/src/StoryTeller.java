public class StoryTeller implements House.Visitor<String> {

    @Override
    public String visit(StrawHouse house) {
        LittlePig pig = house.occupant;
        String story = "\n\n" +
                "Once upon a time, there was a little pig called " + pig.name + ".\n" +
                "They have " + pig.hp + " health points.\n" +
                "They live in a straw house.\n" +
                "A big bad wolf visits the house.\n" +
                "He huffs and he buffs and he blows the house down.\n" +
                "The big bad wolf noms the little piggy until he is full.\n" +
                "The End.\n";
        pig.hp = 0;
        return story;
    }

    @Override
    public String visit(StickHouse house) {
        LittlePig pig = house.occupant;
        String story = "\n\n" +
                "Once upon a time, there was a little pig called " + pig.name + ".\n" +
                "They have " + pig.hp + " health points.\n" +
                "They live in a stick house.\n" +
                "A big bad wolf visits the house.\n" +
                "He huffs and he buffs and he blows the house down.\n" +
                "The big bad wolf noms the little piggy until he is full.\n" +
                "The End.\n";
        pig.hp = 0;
        return story;
    }

    @Override
    public String visit(BrickHouse house) {
        boolean isCooking = house.potBoiling;
        LittlePig pig = house.occupant;
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Once upon a time, there was a little pig called ").append(pig.name).append(".\n");
        stringBuilder.append("They have ").append(pig.hp).append(" health points.\n");
        stringBuilder.append("They live in a brick house.\n");

        if (isCooking) stringBuilder.append("They are cooking.\n");
        else stringBuilder.append("They are not cooking anything.\n");

        stringBuilder.append("A big bad wolf visits the house.\n");
        stringBuilder.append("He huffs and he buffs but no matter how hard he tries he cannot blow the house down..\n");
        stringBuilder.append("The big bad wolf huffing and panting knocks on the door...\n");
        stringBuilder.append("But the little piggy doesnt answer.\n");
        stringBuilder.append("So the big bad wolf goes home hungry and cranky.\n");
        stringBuilder.append("The End.\n");

        return stringBuilder.toString();
    }

}
