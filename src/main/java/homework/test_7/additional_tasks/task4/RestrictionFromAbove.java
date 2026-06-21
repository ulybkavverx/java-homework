package homework.test_7.additional_tasks.task4;

import java.util.List;

public class RestrictionFromAbove {
    public static <T> double sum(List<? extends Number> list) {
        double sum = 0;

        for (Number element : list) {
            sum += element.doubleValue();
        }
        return sum;
    }
}
