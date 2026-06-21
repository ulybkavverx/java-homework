package homeworkautotest.code_tests3.test15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListTransformationTest {
    private ListTransformation listTransformation;

    @BeforeEach
    void setup() {
        listTransformation = new ListTransformation();
    }

    /**
     * ["Java", "C++", "Go"] → [4, 3, 2]
     * [] -> []
     */

    @Test
    public void convertingListOfStringsToListOfLengths() {
        assertEquals(
                List.of(4, 3, 2),
                listTransformation.mapToLengths(List.of("Java", "C++", "Go"))
        );
    }

    @Test
    public void emptyList() {
        assertEquals(
                List.of(),
                listTransformation.mapToLengths(List.of())
        );
    }
}
