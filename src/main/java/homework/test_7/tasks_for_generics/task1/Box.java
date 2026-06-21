package homework.test_7.tasks_for_generics.task1;

public class Box<T> {
    private T elements;

    public T getElements() {
        return elements;
    }

    public void setElements(T element) {
        this.elements = element;
    }
}
