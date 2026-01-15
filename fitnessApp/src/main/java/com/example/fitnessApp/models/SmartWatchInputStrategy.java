package com.example.fitnessApp.models;

import com.example.fitnessApp.repositories.HealthMetricsRepo;

public class SmartWatchInputStrategy implements InputStrategy{

    private HealthMetricsRepo healthMetricsRepo;

    public SmartWatchInputStrategy(HealthMetricsRepo healthMetricsRepo){
        this.healthMetricsRepo = healthMetricsRepo;
    }

    @Override
    public void insertHealthMetricsLog(HealthMetricsLog healthMetrics) {
        System.out.println( "health metrics inserted via smart watch.");
    }
    
}
