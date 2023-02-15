public class EnergySurveyor implements House.Visitor<Integer>{
    @Override
    public Integer visit(StrawHouse house) {
        return 300;
    }

    @Override
    public Integer visit(StickHouse house) {
        return 200;
    }

    @Override
    public Integer visit(BrickHouse house) {
        return 100;
    }
}
