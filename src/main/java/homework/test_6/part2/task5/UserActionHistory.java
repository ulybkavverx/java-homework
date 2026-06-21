package homework.test_6.part2.task5;

import java.util.ArrayDeque;

public class UserActionHistory {
    private ArrayDeque<String> actions;

    public UserActionHistory() {
        this.actions = new ArrayDeque<>();
    }

    public void usersActions(String name) {
        actions.push(name);

        System.out.println("Добавлено действие: " + name);
    }

    public void cancelLastAction() {
        if (actions.isEmpty()) {
            System.out.println("Действий нет");
        } else {
            String lastAction = actions.pop();
            System.out.println("Последнее действие: " + lastAction + " было отменено");
        }
    }

    public void printAllActions() {
        System.out.println("Все действия: " + actions);
    }
}
