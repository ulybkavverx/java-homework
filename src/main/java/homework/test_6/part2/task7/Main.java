package homework.test_6.part2.task7;

public class Main {
    public static void main(String[] args) {
        CheckBracketSequence checkBracketSequence = new CheckBracketSequence();

        System.out.println(checkBracketSequence.isValid("()("));
        checkBracketSequence.printAllStack();

    }
}
