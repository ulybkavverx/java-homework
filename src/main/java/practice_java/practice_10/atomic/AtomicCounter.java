package practice_java.practice_10.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    // считает кол-во операций по всем потокам
    public static final AtomicInteger count = new AtomicInteger(0);
}
