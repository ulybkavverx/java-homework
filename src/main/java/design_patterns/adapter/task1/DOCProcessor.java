package design_patterns.adapter.task1;

public class DOCProcessor implements DocumentProcessor {

    @Override
    public void process() {
        System.out.println("Обрабатываем DOC-документ");
    }
}
