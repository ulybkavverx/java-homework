package practice_java.practice_7.user_monitor;

public class Main {
    public static void main(String[] args) {
        UserMonitor userMonitor = new UserMonitor();

        userMonitor.addNewSession("188");
        userMonitor.addNewSession("188");
        userMonitor.addNewSession("185");
        userMonitor.addNewSession("185");
        userMonitor.addNewSession("185");
        userMonitor.addNewSession("185");
        userMonitor.addNewSession("185");
        userMonitor.addNewSession("185");

        userMonitor.printSessions();

    }
}
