package com.example.fitnessApp.models;

import com.example.fitnessApp.repositories.HealthMetricsRepo;

public class ManualInputStrategy implements InputStrategy{

    public HealthMetricsRepo healthMetricsRepo;

    public ManualInputStrategy(HealthMetricsRepo healthMetricsRepo){
        this.healthMetricsRepo = healthMetricsRepo;
    }

    @Override
    public void insertHealthMetricsLog(HealthMetricsLog healthMetrics) {
        System.out.println("health metrics added manually.");
    }
    
}
