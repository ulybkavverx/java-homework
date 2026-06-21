package homework.test_6.part1.hash_set.task1;

import java.util.HashSet;

public class HashSetTask1 {
    // создать множество
    private HashSet<Integer> set;

    public HashSetTask1() {this.set = new HashSet<>();}

    // добавить 5 чисел
    public void addNumbersInSet() {
      for (int i = 1; i <= 5; i++) {
          set.add(i);
      }
    }

    // вывести все содержимое
    public void printAllSet() {
        System.out.println("Все содержимое: " + set);
    }
}
