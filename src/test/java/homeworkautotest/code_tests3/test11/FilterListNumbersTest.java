package homeworkautotest.code_tests3.test11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterListNumbersTest {
    private FilterListNumbers listNumbers;

    @BeforeEach
    void setup() {
        listNumbers = new FilterListNumbers();
    }

    /**
     * Обычный список: [1, 2, 3, 4, 5, 6] -> [2, 4, 6]
     * Список без четных чисел: [1, 3, 5] -> []
     * Пустой список: [] -> []
     */

    @Test
    public void ordinaryList() {
        assertEquals(
                List.of(2, 4, 6),
                listNumbers.filterEvenNumbers(List.of(1, 2, 3, 4, 5, 6))
        );
    }

    @Test
    public void listWithoutEvenNumbers() {
        assertEquals(
                List.of(),
                listNumbers.filterEvenNumbers(List.of(1, 3, 5))
        );
    }
    @Test
    public void emptyList() {
        assertEquals(
                List.of(),
                listNumbers.filterEvenNumbers(List.of())
        );
    }
}
