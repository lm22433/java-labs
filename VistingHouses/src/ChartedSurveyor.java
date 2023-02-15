public class ChartedSurveyor implements House.VisitorInt {

    @Override
    public Integer visit(StrawHouse house) {
        return 100;
    }

    @Override
    public Integer visit(StickHouse house) {
        return 500;
    }

    @Override
    public Integer visit(BrickHouse house) {
        return 1000;
    }

}
