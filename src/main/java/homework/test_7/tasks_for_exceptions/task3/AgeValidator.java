package homework.test_7.tasks_for_exceptions.task3;

public class AgeValidator {
    public static void userAgeValidity(int age) throws OwnCheckedException {

        if (age < 0 || age > 150) {
            throw new OwnCheckedException("Невалидный возраст пользователя");
        } else {
            System.out.println("Возраст корректный");
        }
    }
}
