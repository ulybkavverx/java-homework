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
    public synchronized void addTask(Task<T> task) {
        if (tasks.stream().anyMatch(existingTask -> existingTask.getID().equals(task.getID()))) {
            throw new IllegalArgumentException("Task with this ID already exists");
        }

        tasks.add(task);
    }

    // удаление задачи по ID, синхронизация
    public synchronized void removeTask(T id) {
        tasks.removeIf(task -> task.getID().equals(id));
    }

    // поиск задачи по статусу
    public synchronized List<Task<T>> findByStatus(Status status) {
        return tasks.stream()
                .filter(task -> task.getStatus() == status)
                .toList();
    }

    // поиск задач по приоритету
    public synchronized List<Task<T>> findByPriority(Priority priority) {
        return tasks.stream()
                .filter(task -> task.getPriority() == priority)
                .toList();
    }

    // сортировка задач по дате
    public synchronized List<Task<T>> sortByDate() {
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getDate))
                .toList();
    }
}
