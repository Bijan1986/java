package udemy.design.pattern.creational.factory.abstactmethod.advanced.service.impl;

import udemy.design.pattern.creational.factory.abstactmethod.DietService;

public class AdvancedDietPlanServiceImpl implements DietService {
    @Override
    public String dietPlan() {
        return "Diet plan with recipes provided";
    }
}
