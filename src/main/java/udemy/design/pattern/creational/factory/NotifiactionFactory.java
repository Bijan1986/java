package udemy.design.pattern.creational.factory;

public class NotifiactionFactory {
    public static Notification getNotification(String type) {
        return switch (type.toUpperCase()) {
            case "EMAIL" -> new EmailNotification();
            case "SMS" -> new SmsNotification();
            default -> throw new IllegalArgumentException("Invalid type");
        };
    }
}
