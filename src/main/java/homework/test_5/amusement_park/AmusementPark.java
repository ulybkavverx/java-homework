package homework.test_5.amusement_park;

public class AmusementPark {
    private Attraction attraction;

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void operateAttraction() {
        attraction.info();
        attraction.serviceAttraction();
    }
}
