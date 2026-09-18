package clean_code.task8dip;

public class EmailSender implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("Отправка email: " + message);
    }
}
