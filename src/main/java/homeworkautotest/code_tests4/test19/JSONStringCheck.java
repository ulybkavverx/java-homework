package homeworkautotest.code_tests4.test19;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONStringCheck {
    public boolean isValidJSON(String json) {
        try {
            new ObjectMapper().readTree(json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
