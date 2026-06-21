package homework.test_5.museum;

public class Sculpture implements Exhibit {

    @Override
    public void describe() {
        System.out.println("Скульптура - это скульптурный объект");
    }

    @Override
    public void preserve() {
        System.out.println("Скульптура нуждается в реставрации");
    }
}
