package homework.test_7.tasks_for_exceptions.task1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
