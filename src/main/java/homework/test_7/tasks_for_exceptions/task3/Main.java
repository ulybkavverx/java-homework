package homework.test_7.tasks_for_exceptions.task3;

public class Main {
    public static void main(String[] args) {
       try {
           AgeValidator.userAgeValidity(151);
       } catch (OwnCheckedException e) {
           System.out.println(e.getMessage());
       }
    }
}
