package homework.test_7.tasks_for_generics.task3;

public class Pair<T, U> {
   private T first;
   private U second;

    public T getFirst() {
        return this.first;
    }

    public U getSecond() {
        return this.second;
    }

    public void setFirst(T item) {
        this.first = item;
    }

    public void setSecond(U item) {
        this.second = item;
    }
}
