package homework.test_7.additional_tasks.task2;

import java.util.List;

public class GeneralizedMethod {
    public static <T> void printList(List<T> list) {
            for (T element : list) {
                System.out.println(element);
            }
    }
}
