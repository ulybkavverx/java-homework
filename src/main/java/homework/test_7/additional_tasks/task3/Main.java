package homework.test_7.additional_tasks.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        NumberBox<Integer> box = new NumberBox<>(list);
        System.out.println(box.getSum());
    }
}
