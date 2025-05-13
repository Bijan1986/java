package udemy.design.pattern.creational.factory.abstactmethod.basic.service.impl;

import udemy.design.pattern.creational.factory.abstactmethod.AccessService;

public class BasicAccessServiceImpl implements AccessService {
    @Override
    public String accessHours() {
        return "Gym is accessible to you 12:00PM to 3:00PM";
    }
}
