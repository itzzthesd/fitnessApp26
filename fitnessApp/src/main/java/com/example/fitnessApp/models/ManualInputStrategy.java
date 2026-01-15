package com.example.fitnessApp.models;

public class ManualInputStrategy implements InputStrategy{

    @Override
    public void insertHealthMetrics(HealthMetrics healthMetrics) {
        System.out.println("health metrics added manually.");
    }
    
}
