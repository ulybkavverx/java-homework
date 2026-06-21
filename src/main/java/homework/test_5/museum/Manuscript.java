package homework.test_5.museum;

public class Manuscript implements Exhibit {

    @Override
     public void describe() {
        System.out.println("Манускрипт - это древний текст");
    }

    @Override
    public void preserve() {
        System.out.println("Манускрипту необходима контролируемая влажность");
    }
}
