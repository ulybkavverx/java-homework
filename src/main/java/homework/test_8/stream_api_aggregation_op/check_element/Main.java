package homework.test_8.stream_api_aggregation_op.check_element;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Поиск первого элемента, начинающегося на "Б"
        List<String> list = Arrays.asList("Ромб", "Горб", "Бабочка", "Бабушка", "Дубинка");

        String word = list.stream()
                .filter(s -> s.startsWith("Б"))
                .findFirst()
                .orElse("Не найдено");

        System.out.println(word);


        // Проверка наличия хотя бы одного элемента по условию
        List<Integer> isEven = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        boolean numberEven = isEven.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println(numberEven);
    }
}
