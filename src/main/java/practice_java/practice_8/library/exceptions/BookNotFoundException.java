package practice_java.practice_8.library.exceptions;

// проверяемый -> Exception (наследников)
public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
       super(message);
    }
}
