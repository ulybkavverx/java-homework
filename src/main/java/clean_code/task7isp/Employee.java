package clean_code.task7isp;

public class Employee implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Сотрудник работает");
    }

    @Override
    public void eat() {
        System.out.println("Сотрудник ест");
    }
}
