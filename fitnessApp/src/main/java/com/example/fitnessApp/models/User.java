package com.example.fitnessApp.models;

import java.util.List;

public class User {
    public long id;
    public double weight;
    public Gender gender;
    public List<Goals> goals;
    public List<HealthMetrics> healthMetrics;
    
    public List<Goals> getGoals(){
        return this.goals;
    }

    public List<HealthMetrics> getHealthMetrics(){
        return this.healthMetrics;
    }
}
