package udemy.design.pattern.creational.factory;

public class EmailNotification implements Notification {

    @Override
    public String sendMessage() {
        return "Email Notification";
    }
}
