package udemy.design.pattern.creational.factory.abstactmethod;

public class AbstractMerhodDemo {
    public static void main(String[] args) {
        var memebrRegistration = GymMembershiptProvider.getMembershipFactory("BASIC");
        System.out.println(memebrRegistration.createTrainerService().trainerAvailability());
    }
}
