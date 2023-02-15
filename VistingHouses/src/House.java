public abstract class House {

    LittlePig occupant;

    House() {
        occupant = new LittlePig();
    }

    abstract Integer accept(VisitorInt visitor);

    interface VisitorInt {
        Integer visit(StrawHouse house);
        Integer visit(StickHouse house);
        Integer visit(BrickHouse house);
    }

    // Generic visitor:
    // Visitor<Integer> ≅ VisitorInt
    // accept(Visitor<Integer> visitor) ≅ acceptIntVisitor(VisitorInt visitor)

    abstract <T> T accept(Visitor<T> visitor);

    interface Visitor<T> {
        T visit(StrawHouse house);
        T visit(StickHouse house);
        T visit(BrickHouse house);
    }

}