package clean_code.task8dip;

public class Main {
    public static void main(String[] args) {
        NotificationSender sender = new EmailSender();

        NotificationService service = new NotificationService(sender);

        service.sendNotification("Hello!");
    }
}
