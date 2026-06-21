package homework.test_9.use_of_volatiles;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        VolatileExample volatileExample = new VolatileExample();

        Thread t1 = new Thread(volatileExample);
        t1.start();

        Thread.sleep(2000);
        volatileExample.stop();
        System.out.println(volatileExample.getCount());
    }
}
