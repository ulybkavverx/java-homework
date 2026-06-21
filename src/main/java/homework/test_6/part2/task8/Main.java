package homework.test_6.part2.task8;

public class Main {
    public static void main(String[] args) {
        UniqueWords uniqueWords = new UniqueWords();

        uniqueWords.addWordsInText("Cat Dog Cat Cat Cat Dof");
        uniqueWords.printUniqueCountWords();
        uniqueWords.printUniqueWords();
    }
}
