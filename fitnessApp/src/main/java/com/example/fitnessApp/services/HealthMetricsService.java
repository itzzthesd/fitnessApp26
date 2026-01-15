package com.example.fitnessApp.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.fitnessApp.models.HealthMetrics;
import com.example.fitnessApp.models.HealthMetricsCommand;
import com.example.fitnessApp.models.HealthMetricsLog;
import com.example.fitnessApp.models.InputStrategy;
import com.example.fitnessApp.models.InputStrategyFactory;
import com.example.fitnessApp.models.User;
import com.example.fitnessApp.models.DesignPatterns.GoalEvaluationService;
import com.example.fitnessApp.repositories.HealthMetricsRepo;
import com.example.fitnessApp.repositories.UserRepository;


@Service
public class HealthMetricsService {

    public HealthMetricsRepo healthMetricsRepo;

    public GoalEvaluationService goalEvaluationService;

    public UserRepository userRepository;

    public InputStrategyFactory inputStrategyFactory;

    public HealthMetricsService(HealthMetricsRepo healthMetricsRepo, 
                                GoalEvaluationService goalEvaluationService,
                                UserRepository userRepository,
                                InputStrategyFactory inputStrategyFactory){
        this.healthMetricsRepo = healthMetricsRepo;
        this.goalEvaluationService = goalEvaluationService;
        this.userRepository = userRepository;
        this.inputStrategyFactory = inputStrategyFactory;
    }

    public void insertHealthMetrics(HealthMetricsCommand metrics, String strategy) {
        // fetch user details from user repo
        long userId = metrics.getUserId();
        Optional<User> OpUser = userRepository.findById(userId);
        User user = OpUser.get();

        // create health metric from command class
        HealthMetrics metricsReal = metrics.creaHealthMetrics();
        HealthMetricsLog metricsLog = metrics.creaHealthMetricsLogs();

        
        
        // fetch input strategy from input strategy string
        InputStrategy inputStrategy = inputStrategyFactory.getInputStrategy(strategy);
        // persist health metrics log data in DB
        inputStrategy.insertHealthMetricsLog(metricsLog);
        
        //healthMetricsRepo.upsert
        healthMetricsRepo.upsertDailyMetrics(
            metricsReal.getUser(),
            metricsReal.getDate(),
            metricsReal.getSteps(),
            metricsReal.getWorkOut(),
            metricsReal.getCaloriesIntake(),
            metricsReal.getCaloriesBurn(),
            metricsReal.getWeight()
        );


        // evaluate goals
        goalEvaluationService.evaluategoals(user, null);


    }

}
