public class Vessels {

    String typeVessel;
    int buildYear;
    int durationOperation;
    public int incrementByOnebuildYear(int buildYear) {
        buildYear ++;
        return buildYear;
    }

    public int incrementByOnedurationOperation(int durationOperation) {
        durationOperation ++;
        return durationOperation;
    }

    public int decrementByOnebuildYear(int buildYear) {
        buildYear --;
        return buildYear;
    }

    public int decrementByOnedurationOperation(int durationOperation) {
        durationOperation --;
        return durationOperation;
    }
}
