package udemy.design.pattern.creational.factory.abstactmethod.basic.service.impl;

import udemy.design.pattern.creational.factory.abstactmethod.TrainerService;

public class BasicTrainerServiceImpl implements TrainerService {
    @Override
    public String trainerAvailability() {
        return "No trainers are available";
    }
}
