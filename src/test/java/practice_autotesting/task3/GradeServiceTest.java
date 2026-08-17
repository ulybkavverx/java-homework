package practice_autotesting.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {
   private GradeService<Number> gradeService;

   @BeforeEach
   public void setup() {
       gradeService = new GradeService<>();
   }

    // addGrade() : добавить 1 оценку в пустой лист
    @Test
    public void shouldAddGradeToEmptyList() {
        StudentGrade<Number> grade = new StudentGrade<>("Bob", "Literature", 3);

        gradeService.addGrade(grade);

        assertEquals(3, gradeService.averageGradeBySubject("Literature"));
    }

    // addGrade() : добавить 1 оценку в НЕпустой лист
    @Test
    public void shouldAddGradeToNotEmptyList() {
       StudentGrade<Number> grade1 = new StudentGrade<>("Bob", "Literature", 2);
       StudentGrade<Number> grade2 = new StudentGrade<>("Bob", "Literature", 5);

       gradeService.addGrade(grade1);
       gradeService.addGrade(grade2);

       assertEquals(3.5, gradeService.averageGradeBySubject("Literature"));
    }

    // addGrade() : добавить отрицательную оценку
    @Test
    public void shouldAddNegativeGradeToList() {
       StudentGrade<Number> grade = new StudentGrade<>("Bob", "Literature", -1);

       assertThrows(
               InvalidGradeException.class,
               () -> gradeService.addGrade(grade)
       );
    }

    // avg() : несколько оценок по одному предмету
    @Test
    public void shouldReturnAverageGradeForSubject() {
        StudentGrade<Number> grade1 = new StudentGrade<>("Bob", "Literature", 4);
        StudentGrade<Number> grade2 = new StudentGrade<>("Alice", "Literature", 5);
        StudentGrade<Number> grade3 = new StudentGrade<>("Maria", "Literature", 3);

        gradeService.addGrade(grade1);
        gradeService.addGrade(grade2);
        gradeService.addGrade(grade3);

        assertEquals(4, gradeService.averageGradeBySubject("Literature"));
    }

    // avg() : оценки разных предметов
    @Test
    public void shouldCalculateAverageOnlyForRequestSubject() {
        StudentGrade<Number> literature1 = new StudentGrade<>("Bob", "Literature", 4);
        StudentGrade<Number> math = new StudentGrade<>("Alice", "Math", 5);
        StudentGrade<Number> literature2 = new StudentGrade<>("Maria", "Literature", 3);

        gradeService.addGrade(literature1);
        gradeService.addGrade(math);
        gradeService.addGrade(literature2);

        assertEquals(3.5, gradeService.averageGradeBySubject("Literature"));
    }

    // avg() : предмет не найден
    @Test
    public void shouldReturnZeroWhenSubjectNotFound() {
        StudentGrade<Number> grade = new StudentGrade<>("Bob", "Literature", 4);

        gradeService.addGrade(grade);

        assertEquals(0, gradeService.averageGradeBySubject("Math"));
    }

}
