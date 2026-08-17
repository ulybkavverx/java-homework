package practice_autotesting.task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {
    private TaskService<Integer> taskService;

    @BeforeEach
    public void setup() {
        taskService = new TaskService<>();
    }

    // addTask(): добавить задачу
    @Test
    public void shouldAddTask() {
        Task<Integer> task = new Task<>(1,
                Status.NEW,
                Priority.LOW,
                "2026-08-17");

        taskService.addTask(task);

        assertEquals(List.of(task), taskService.findByStatus(Status.NEW));
    }

    // removeTask(): удаление задачи по ID
    @Test
    public void shouldRemoveTaskByID() {
        Task<Integer> task1 = new Task<>(
                1,
                Status.IN_PROGRESS,
                Priority.HIGH,
                "2026-08-20"
        );

        Task<Integer> task2 = new Task<>(
                2,
                Status.IN_PROGRESS,
                Priority.LOW,
                "2026-08-17"
        );

        taskService.addTask(task1);
        taskService.addTask(task2);

        taskService.removeTask(2);

        assertEquals(List.of(task1), taskService.findByPriority(Priority.HIGH));
    }

    // removeTask(): удаление задачи по ID (удалить НЕсущ задачу)
    @Test
    public void shouldNotThrowExceptionRemovingNonExistingTask() {
        assertDoesNotThrow(
                () -> taskService.removeTask(99)
        );
    }

    // findByStatus(): фильтр по статусу задачи
    @Test
    public void shouldFindTaskByStatus() {
        Task<Integer> task1 = new Task<>(
                1,
                Status.IN_PROGRESS,
                Priority.MEDIUM,
                "2026-08-20"
        );

        Task<Integer> task2 = new Task<>(
                2,
                Status.NEW,
                Priority.MEDIUM,
                "2026-08-21"
        );

        Task<Integer> task3 = new Task<>(
                3,
                Status.NEW,
                Priority.MEDIUM,
                "2026-08-21"
        );

        taskService.addTask(task1);
        taskService.addTask(task2);
        taskService.addTask(task3);

        List<Task<Integer>> result = taskService.findByStatus(Status.NEW);

        assertEquals(List.of(task2, task3), result);
    }

    // findByStatus(): фильтр по статусу (задачи с таким статусом отсутствуют)
    @Test
    public void shouldReturnEmptyListWhenStatusNotFound() {
        Task<Integer> task = new Task<>(
                1,
                Status.NEW,
                Priority.MEDIUM,
                "2026-08-21"
        );

        taskService.addTask(task);

        List<Task<Integer>> result = taskService.findByStatus(Status.COMPLETED);

        assertTrue(result.isEmpty());
    }

    // findByPriority(): фильтр по приоритету задачи
    @Test
    public void shouldFindTaskByPriority() {
        Task<Integer> task1 = new Task<>(
                1,
                Status.IN_PROGRESS,
                Priority.MEDIUM,
                "2026-08-20"
        );

        Task<Integer> task2 = new Task<>(
                2,
                Status.NEW,
                Priority.LOW,
                "2026-08-21"
        );

        Task<Integer> task3 = new Task<>(
                3,
                Status.NEW,
                Priority.MEDIUM,
                "2026-08-21"
        );

        taskService.addTask(task1);
        taskService.addTask(task2);
        taskService.addTask(task3);

        List<Task<Integer>> result = taskService.findByPriority(Priority.MEDIUM);

        assertEquals(List.of(task1, task3), result);
    }

    // findByPriority(): фильтр по приоритету (задачи с таким приоритетом отсутствуют)
    @Test
    public void shouldReturnEmptyListWhenPriorityNotFound() {
        Task<Integer> task = new Task<>(
                1,
                Status.NEW,
                Priority.MEDIUM,
                "2026-08-21"
        );

        taskService.addTask(task);

        List<Task<Integer>> result = taskService.findByPriority(Priority.LOW);

        assertTrue(result.isEmpty());
    }

    // sortByDate(): сортировка от самой ранней даты к самой поздней
    @Test
    public void shouldSortTaskByDate() {
        Task<Integer> task1 = new Task<>(
                1,
                Status.IN_PROGRESS,
                Priority.MEDIUM,
                "2026-08-20"
        );

        Task<Integer> task2 = new Task<>(
                2,
                Status.NEW,
                Priority.LOW,
                "2026-08-10"
        );

        Task<Integer> task3 = new Task<>(
                3,
                Status.NEW,
                Priority.MEDIUM,
                "2026-08-30"
        );

        taskService.addTask(task1);
        taskService.addTask(task2);
        taskService.addTask(task3);

        List<Task<Integer>> result = taskService.sortByDate();

        assertEquals(List.of(task2, task1, task3), result);
    }
}
