package homework.test_7.additional_tasks.task3;

import java.util.List;

public class NumberBox<T extends Number> {
        private List<T> numbers;

        public NumberBox(List<T> numbers) {
            this.numbers = numbers;
        }

      public double getSum() {
            double sum = 0;

            for (T element : numbers) {
                sum += element.doubleValue();
            }
            return sum;
      }
}
