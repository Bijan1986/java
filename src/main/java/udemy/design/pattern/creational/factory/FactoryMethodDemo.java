package udemy.design.pattern.creational.factory;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        System.out.println(NotifiactionFactory.getNotification("email").sendMessage());

    }
}
