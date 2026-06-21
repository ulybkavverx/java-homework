package practice_java.practice_10.synchronizedkeyword;

public class SafeCounter {
    // методы по увеличению и уменьшению значения
    // задача реализовать решение в многопоточной среде
    private int count = 0; // одно общее поле

    public synchronized void increment() { // без synchronized может быть: не + 1000
        this.count++;
    }

    public synchronized void decrement() { // без synchronized может быть: не - 1000
        this.count--;
    }

    public synchronized int getCount() {
        return this.count;
    }
    // Без synchronized: 2 человека одновременно пишут в один документ
    // С synchronized: по очереди
}
