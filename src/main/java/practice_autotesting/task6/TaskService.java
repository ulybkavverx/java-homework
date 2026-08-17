package practice_autotesting.task6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * TaskService - менеджер, управляет задачами, методы для добавления, удаления, поиска задач
 * Task - поля: ID<T>, статус, приоритет, дата
 * @param <T>
 */

public class TaskService<T> {
    // хранение задач
    private final List<Task<T>> tasks = new ArrayList<>();

    // добавление задачи
    public void addTask(Task<T> task) {
        tasks.add(task);
    }

    // удаление задачи по ID, синхронизация
    public void removeTask(T id) {
        tasks.removeIf(task -> task.getID().equals(id));
    }

    // поиск задачи по статусу
    public List<Task<T>> findByStatus(Status status) {
        return tasks.stream()
                .filter(task -> task.getStatus() == status)
                .toList();
    }

    // поиск задач по приоритету
    public List<Task<T>> findByPriority(Priority priority) {
        return tasks.stream()
                .filter(task -> task.getPriority() == priority)
                .toList();
    }

    // сортировка задач по дате
    public List<Task<T>> sortByDate() {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getDate))
                .toList();
    }
}
