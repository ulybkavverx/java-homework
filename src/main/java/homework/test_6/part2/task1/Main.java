package homework.test_6.part2.task1;

public class Main {
    public static void main(String[] args) {
        UniqueIDs uniqueIDs = new UniqueIDs();

        uniqueIDs.addUniqueUsersIDs();
        uniqueIDs.checkUserID("id963");
        uniqueIDs.checkUserID("id000");
    }
}
