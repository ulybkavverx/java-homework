package homeworkautotest.code_tests3.test12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingListStringsTest {
    private SortingListStrings sortList;

    @BeforeEach
    void setup() {
        sortList = new SortingListStrings();
    }

    /**
     * ["Java", "C", "Python"] → ["C", "Java", "Python"]
     * Одинаковые длины (["aa", "bb", "cc"]) -> ["aa", "bb", "cc"]
     * Пустой список -> []
     */
    @Test
    public void sortingOrdinaryWords() {
        assertEquals(
                List.of("C", "Java", "Python"),
                sortList.sortByLength(List.of("Java", "C", "Python"))
        );
    }

    @Test
    public void equalLengths() {
        assertEquals(
                List.of("aa", "bb", "cc"),
                sortList.sortByLength(List.of("aa", "bb", "cc"))
        );
    }

    @Test
    public void emptyList() {
        assertEquals(
                List.of(),
                sortList.sortByLength(List.of())
        );
    }
}
