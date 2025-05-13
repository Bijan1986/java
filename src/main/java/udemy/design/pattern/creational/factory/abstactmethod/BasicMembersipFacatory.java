package udemy.design.pattern.creational.factory.abstactmethod;

import udemy.design.pattern.creational.factory.abstactmethod.basic.service.impl.BasicAccessServiceImpl;
import udemy.design.pattern.creational.factory.abstactmethod.basic.service.impl.BasicDietPlanServiceImpl;
import udemy.design.pattern.creational.factory.abstactmethod.basic.service.impl.BasicTrainerServiceImpl;

public class BasicMembersipFacatory implements GymMembershipAbstractFactory {
    @Override
    public TrainerService createTrainerService() {
        return new BasicTrainerServiceImpl();
    }

    @Override
    public DietService createDietService() {
        return new BasicDietPlanServiceImpl();
    }

    @Override
    public AccessService createAccessService() {
        return new BasicAccessServiceImpl();
    }
}
