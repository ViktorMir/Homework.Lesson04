public class NumberManipulator {

    public static void main(String[] args) {
        Vessels vessel = new Vessels();

        String typeVessel = "Ferry vessel";
        int buildYear = 2019;
        int durationOperation = 4;
        System.out.println("Type of vessel:" + typeVessel);
        System.out.println("Initial buildYear:" + buildYear);
        System.out.println("Initial durationOperation:" + durationOperation);

        int incrementbuildYear = vessel.incrementByOnebuildYear(2019);
        int incrementdurationOperation = vessel.incrementByOnedurationOperation(4);
        System.out.println("buildYear after increment:" + incrementbuildYear);
        System.out.println("durationOperation after increment:" + incrementdurationOperation);

        int decrementbuildYear = vessel.decrementByOnebuildYear(2019);
        int decrementdurationOperation = vessel.decrementByOnedurationOperation(4);
        System.out.println("buildYear after decrement:" + decrementbuildYear);
        System.out.println("durationOperation after decrement:" + decrementdurationOperation);


    }
}
