package udemy.design.pattern.creational.factory.abstactmethod.advanced.service.impl;

import udemy.design.pattern.creational.factory.abstactmethod.TrainerService;

public class AdvancedTrainerServiceImpl implements TrainerService {
    @Override
    public String trainerAvailability() {
        return "Trainer is available 5 days a week during 9:00 AM to 5:00PM";
    }
}
