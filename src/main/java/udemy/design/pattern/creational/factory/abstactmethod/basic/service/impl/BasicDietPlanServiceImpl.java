package udemy.design.pattern.creational.factory.abstactmethod.basic.service.impl;

import udemy.design.pattern.creational.factory.abstactmethod.DietService;

public class BasicDietPlanServiceImpl implements DietService {
    @Override
    public String dietPlan() {
        return "Diet plan is not included";
    }
}
