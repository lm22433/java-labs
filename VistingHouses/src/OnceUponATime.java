public class OnceUponATime {
    public static Integer estimateRentPCM(House house) {
        return -1;
    }

    public static Integer estimateHeatingBillPCM(House house) {
        return -1;
    }

    public static String letMeComeIn(House house) {
        return "";
    }

    public static void main(String[] args) {

        House[] houses = new House[]{new StrawHouse(), new StickHouse(), new BrickHouse()};

        for (House house : houses) {
            System.out.println("Calling functions on: " + house.toString());
            System.out.println( "Estimating rent: " + estimateRentPCM(house) );
            System.out.println( "Estimating heating bill: " + estimateHeatingBillPCM(house) );
            System.out.println( "Here comes the Big Bad Wolf: " + letMeComeIn(house) );
        }

    }
}
