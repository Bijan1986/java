package udemy.design.pattern.creational.factory.abstactmethod;

public interface GymMembershipAbstractFactory {
    TrainerService createTrainerService();

    DietService createDietService();

    AccessService createAccessService();
}
