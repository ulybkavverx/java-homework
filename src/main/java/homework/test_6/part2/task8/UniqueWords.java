package homework.test_6.part2.task8;

import java.util.HashSet;

public class UniqueWords {
    private HashSet<String> uniqueWords;

    public UniqueWords() {
        this.uniqueWords = new HashSet<>();
    }

    public void addWordsInText(String text) {
        String[] words = text.split(" "); // Раздели текст на слова через split(" ")

        for (String word : words) {
            uniqueWords.add(word);
        }
    }

    public void printUniqueCountWords() {
        System.out.println("Кол-во уникальных слов: " + uniqueWords.size());
    }

    public void printUniqueWords() {
        System.out.println("Все уникальные слова: " + uniqueWords);
    }
}
