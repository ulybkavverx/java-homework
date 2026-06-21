package homework.test_7.tasks_for_exceptions.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddressValidator {
    public static void emailAddressValidity(String emailAddress) {
        Pattern pattern = Pattern.compile(".+@.+");

        Matcher matcher = pattern.matcher(emailAddress);

        if (!matcher.matches()) {
            throw new OwnUncheckedException("Невалидный Email");
        } else {
            System.out.println("Email корректный");
        }
    }
}
