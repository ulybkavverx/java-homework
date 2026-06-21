package homework.test_8.functional_interface_lambda.task2;

public class MainForAnonymousClass {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
                    public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        r1.run();
    }
}
