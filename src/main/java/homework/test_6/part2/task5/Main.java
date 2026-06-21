package homework.test_6.part2.task5;

public class Main {
    public static void main(String[] args) {
        UserActionHistory userActionHistory = new UserActionHistory();

        userActionHistory.usersActions("Открыть браузер");
        userActionHistory.usersActions("Зайти в интернет магазин");
        userActionHistory.usersActions("Оплатить товар");
        userActionHistory.printAllActions();

        userActionHistory.cancelLastAction();
        userActionHistory.cancelLastAction();
        userActionHistory.cancelLastAction();
        userActionHistory.cancelLastAction();
        userActionHistory.printAllActions();

    }
}
