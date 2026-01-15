package com.example.fitnessApp.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.fitnessApp.models.HealthMetrics;
import com.example.fitnessApp.models.HealthMetricsCommand;
import com.example.fitnessApp.models.User;
import com.example.fitnessApp.models.DesignPatterns.GoalEvaluationService;
import com.example.fitnessApp.repositories.HealthMetricsRepo;
import com.example.fitnessApp.repositories.UserRepository;


@Service
public class HealthMetricsService {

    public HealthMetricsRepo healthMetricsRepo;

    public GoalEvaluationService goalEvaluationService;

    public UserRepository userRepository;

    public HealthMetricsService(HealthMetricsRepo healthMetricsRepo, 
                                GoalEvaluationService goalEvaluationService,
                                UserRepository userRepository){
        this.healthMetricsRepo = healthMetricsRepo;
        this.goalEvaluationService = goalEvaluationService;
        this.userRepository = userRepository;
    }

    public void insertHealthMetrics(HealthMetricsCommand metrics, String string) {
        // fetch user details from user repo
        long userId = metrics.getUserId();
        Optional<User> OpUser = userRepository.findById(userId);
        User user = OpUser.get();
        
        // fetch input strategy from input strategy string
        
        // persist health metrics data in DB
        //healthMetricsRepo.upsert

        // evaluate goals
        goalEvaluationService.evaluategoals(user, null);


    }

}
