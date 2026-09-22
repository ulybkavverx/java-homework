package design_patterns.adapter.task2;

public class MilesToKilometersAdapter implements Distance{
    private static final double MILES_TO_KILOMETERS = 1.609344;
    private Miles miles;

    public MilesToKilometersAdapter(Miles miles) {
        this.miles = miles;
    }


    @Override
    public double getDistance() {
        return miles.getMiles() * MILES_TO_KILOMETERS;
    }
}
