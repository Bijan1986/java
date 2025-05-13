package udemy.design.pattern.creational.factory.abstactmethod.advanced.service.impl;

import udemy.design.pattern.creational.factory.abstactmethod.AccessService;

public class AdvancedAccessServiceImpl implements AccessService {
    @Override
    public String accessHours() {
        return "Gym is accessible to you 24x7";
    }
}
