package homework.test_7.tasks_for_generics.task3;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>();

        pair1.setFirst("Anna");
        pair1.setSecond(25);

        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());

        Pair<Integer, Boolean> pair2 = new Pair<>();
        pair2.setFirst(26);
        pair2.setSecond(true);

        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
    }
}
