package practice_autotesting.task3;

/*
GradeService - менеджер, управление и анализ оценок студентов, обобщенный подход
StudentGrade - поля: имя студента, предмет, оценка // оценка типа Т, расширяет класс Number
InvalidGradeException - оценка некорректна
 */

import java.util.LinkedList;
import java.util.List;

public class GradeService<T extends Number> {
    // хранение оценок студентов
    private final List<StudentGrade<T>> grades = new LinkedList<>();

    // метод для добавления оценки потокобезопасно, валидация на отрицательную оценку
    public synchronized void addGrade(StudentGrade<T> grade) {
        if (grade.getGrade().doubleValue() < 0) {
            throw new InvalidGradeException("Grade cannot be negative");
        }

        grades.add(grade);
    }

    // метод для расчета среднего значения оценок по конкретному предмету (сумма всех оценок / кол-во оценок)
    public synchronized double averageGradeBySubject(String subject) {
        double sum = 0;
        int count = 0;

        for (StudentGrade<T> grade : grades) {
            if (grade.getSubject().equals(subject)) {
                sum += grade.getGrade().doubleValue();
                count++;
            }
        }

        if (count == 0) {
            return 0;
        }

        return sum / count;
    }
}
