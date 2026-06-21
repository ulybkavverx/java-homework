package homework.test_9.use_of_volatiles;

public class VolatileExample implements Runnable {
    private int count = 0;
    private volatile boolean stop = false;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while (!stop) {
            count++;
        }
    }

    public void stop() {
        stop = true;
    }
}
