package homework.test_7.tasks_for_generics.task1;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setElements(55);
        System.out.println(integerBox.getElements());


        Box<String> stringBox = new Box<>();
        stringBox.setElements("Hello");
        System.out.println(stringBox.getElements());

        Box<Boolean> booleanBox = new Box<>();
        booleanBox.setElements(true);
        System.out.println(booleanBox.getElements());
    }
}
