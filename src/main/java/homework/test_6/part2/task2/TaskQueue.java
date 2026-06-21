package homework.test_6.part2.task2;

import java.util.LinkedList;

public class TaskQueue {
    private LinkedList<String> tasks;

    public TaskQueue() {this.tasks = new LinkedList<>();}

    public void addTasks() {
        tasks.add("Помыть пол");
        tasks.add("Купить продукты");
        tasks.add("Посмотреть видео-урок");
        tasks.add("Погулять с собакой");
        tasks.add("Помыть руки");
    }

    public void taskProcessingInTurn() {
        while (!tasks.isEmpty()) {
            System.out.println("Все задачи: " + tasks);
            tasks.poll();
        }
    }
}
