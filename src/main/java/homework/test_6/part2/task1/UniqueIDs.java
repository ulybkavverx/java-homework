package homework.test_6.part2.task1;

import java.util.HashSet;

public class UniqueIDs {
    private HashSet<String> userID;

    public UniqueIDs() {this.userID = new HashSet<>();}

    public void addUniqueUsersIDs() {
        userID.add("id123");
        userID.add("id555");
        userID.add("id963");
        userID.add("id144");
    }

    public void checkUserID(String id) {
        if (userID.contains(id)) {
            System.out.println("Пользователь " + id + " есть в базе");
        } else {
            System.out.println("Пользователя " + id + " нет в базе");
        }
    }
}
