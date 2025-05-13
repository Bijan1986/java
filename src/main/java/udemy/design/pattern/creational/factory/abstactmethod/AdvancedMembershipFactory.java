package udemy.design.pattern.creational.factory.abstactmethod;

import udemy.design.pattern.creational.factory.abstactmethod.advanced.service.impl.AdvancedAccessServiceImpl;
import udemy.design.pattern.creational.factory.abstactmethod.advanced.service.impl.AdvancedDietPlanServiceImpl;
import udemy.design.pattern.creational.factory.abstactmethod.advanced.service.impl.AdvancedTrainerServiceImpl;

public class AdvancedMembershipFactory implements GymMembershipAbstractFactory {
    @Override
    public TrainerService createTrainerService() {
        return new AdvancedTrainerServiceImpl();
    }

    @Override
    public DietService createDietService() {
        return new AdvancedDietPlanServiceImpl();
    }

    @Override
    public AccessService createAccessService() {
        return new AdvancedAccessServiceImpl();
    }
}
