package practice_autotesting.task6;

import java.time.LocalDateTime;

public class Task<T> {
    private final T ID;
    private final Status status;
    private final Priority priority;
    private final LocalDateTime date;

    public Task(T ID, Status status, Priority priority, LocalDateTime date) {
        this.ID = ID;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getID() {
        return ID;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
