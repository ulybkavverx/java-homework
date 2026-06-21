package practice_java.practice_11;

public class StringProcessor {

    // метод для переворота строки
    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return new StringBuilder(input).reverse().toString();
    }

    // метод для проверки, является ли строка палиндромом
    // abba - палиндром
    // bba - не палиндром
    public boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null");
        }
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // метод, который бросает исключение, если строка слишком короткая
    public String validateLength(String input, int muiLength) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        if (input.length() < muiLength) {
            throw new IllegalArgumentException("Input must be at least " + muiLength);
        }
        return input;
    }
}
