package udemy.design.pattern.creational.factory;

public class SmsNotification implements Notification {

    @Override
    public String sendMessage() {
        return "Sms sent successfully";
    }
}
