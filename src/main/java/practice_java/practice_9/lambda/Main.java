package practice_java.practice_9.lambda;

public class Main {
    public static void main(String[] args) {
        // анонимный класс
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет Мир");
            }
        };

        r1.run();

        Runnable r2 = () -> System.out.println("Привет, Мир");

        r2.run();
    }
}
