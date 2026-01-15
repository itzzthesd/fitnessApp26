package com.example.fitnessApp.models;

public class SmartWatchInputStrategy implements InputStrategy{

    @Override
    public void insertHealthMetrics(HealthMetrics healthMetrics) {
        System.out.println( "health metrics inserted via smart watch.");
    }
    
}
