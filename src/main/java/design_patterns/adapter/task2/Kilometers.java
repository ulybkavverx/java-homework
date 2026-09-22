package design_patterns.adapter.task2;

public class Kilometers implements Distance {
    private double kilometers;

    public Kilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public double getDistance() {
        return kilometers;
    }
}
