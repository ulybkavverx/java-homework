package practice_autotesting.task6;

public class Task<T> {
    private final T ID;
    private final Status status;
    private final Priority priority;
    private final String date;

    public Task(T ID, Status status, Priority priority, String date) {
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

    public String getDate() {
        return date;
    }
}
