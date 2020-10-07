package com.ustl.ifi.trainer_api.service;

import com.ustl.ifi.trainer_api.bo.Trainer;

public interface TrainerService {

    Iterable<Trainer> getAllTrainers();
    Trainer getTrainer(String name);
    Trainer createTrainer(Trainer trainer);
}